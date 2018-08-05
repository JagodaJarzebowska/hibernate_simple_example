package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {

    private final static SessionFactory SESSION_FACTORY = new Configuration()
            .configure()
            .buildSessionFactory();

    private static Session session;

    private HibernateUtil(){

    }

    public static Session getHibernateSession(){
        if (session==null){
            session = SESSION_FACTORY.openSession();
        }
        return session;
    }

    public static void closeHibernateSession(){
        session.close();
        SESSION_FACTORY.close();
    }

}
