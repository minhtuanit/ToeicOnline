package vn.myclass.core.data.daoimpl;

import org.hibernate.*;
import vn.myclass.core.common.util.HibernateUtil;
import vn.myclass.core.data.dao.GenericDAO;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class AbstractDAO<ID extends Serializable,T> implements GenericDAO<ID,T>{
    private Class<T> persistenceClass;

    public AbstractDAO(){
        this.persistenceClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    public String getPersestenceName(){
        return persistenceClass.getSimpleName();
    }


    public List<T> findAll() {
        List<T> list = new ArrayList<T>();
        Transaction transaction = null;
        Session session = null;
        try{
            session = HibernateUtil.getSesstionFactory().openSession();
            transaction = session.beginTransaction();
            String s = new String("from ");
            s += this.getPersestenceName();
            Query query = session.createQuery(s);
            list = query.list();
            transaction.commit();
        }catch (HibernateException ex){
            transaction.rollback();
            ex.printStackTrace();
        } finally {
          session.close();
        }
        return list;
    }

    public T update(T entity) {
        Transaction transaction = null;
        T result = null;
        Session session = null;
        try{
            session = HibernateUtil.getSesstionFactory().openSession();
            transaction = session.beginTransaction();
            Object object = session.merge(entity);
            result = (T) object;
            transaction.commit();
        }catch (HibernateException ex){
            transaction.rollback();
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return result;
    }



}
