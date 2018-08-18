package vn.myclass.core.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import vn.myclass.core.common.util.HibernateUtil;
import vn.myclass.core.dao.UserDAO;
import vn.myclass.core.data.daoimpl.AbstractDAO;
import vn.myclass.core.persestence.entity.Role;
import vn.myclass.core.persestence.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl extends AbstractDAO<Integer,User> implements UserDAO{

        public boolean isExistUser(String email, String password) {
        Session session = HibernateUtil.getSesstionFactory().openSession();
        Transaction transaction = null;
        User user = null;
        try{
            StringBuilder stringBuilder = new StringBuilder("from User where name=\"Phamminhtuan\" and password=\"obeliskra12\"");
            transaction = session.beginTransaction();
            Query query = session.createQuery(stringBuilder.toString());

            user = (User) query.uniqueResult();
            transaction.commit();
            return user != null;
        }catch (HibernateException ex) {
            ex.printStackTrace();
            transaction.rollback();
            return false;
        }
    }

    public List<Role> getListUser(){
        Session session  = HibernateUtil.getSesstionFactory().openSession();
        Transaction transaction = null;
        List<Role> list = new ArrayList<Role>();
        try{
            StringBuilder s = new StringBuilder("from role");
            transaction = session.beginTransaction();
            list = session.createQuery(s.toString()).list();
            transaction.commit();
        }catch (HibernateException ex){
            ex.printStackTrace();
            transaction.rollback();
        }
        return list;
    }

}
