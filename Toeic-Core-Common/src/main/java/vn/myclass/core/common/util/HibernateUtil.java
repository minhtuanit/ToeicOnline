package vn.myclass.core.common.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            return configuration.buildSessionFactory();
        }catch (Throwable ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static SessionFactory getSesstionFactory(){
        return sessionFactory;
    }

} 
