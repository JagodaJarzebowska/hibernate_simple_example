package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate util class
 * get session and close session methods
 */
public final class HibernateUtil {

    private final static SessionFactory SESSION_FACTORY = new Configuration()
            .configure()
            .buildSessionFactory();

    private static Session session;

    private HibernateUtil(){

    }

    /**
     * Open session method
     * @return opened session
     */
    public static Session getHibernateSession(){
        if (session==null){
            session = SESSION_FACTORY.openSession();
        }
        return session;
    }

    /**
     * Close session method
     */
    public static void closeHibernateSession(){
        session.close();
        SESSION_FACTORY.close();
    }
}
