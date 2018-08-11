package vn.myclass.core.common.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
        try {
            return new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex){
            System.out.println("Init Session Failed");
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSesstionFactory(){
        return sessionFactory;
    }

} 
