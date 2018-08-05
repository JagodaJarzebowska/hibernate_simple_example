package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.Optional;

/**
 * Abstract DAO for db entities
 * CRUD methods
 * @param <T>
 */
public abstract class AbstractDAO<T> {

    protected abstract Class<T> getClazz();

    /**
     * Method add entity to db
     * @param entity
     * @return created entity
     */
    public Optional<T> add(final T entity){
        Session session = HibernateUtil.getHibernateSession();
        try{
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
            return Optional.of(entity);
        }catch (HibernateException ex){
            if (session.getTransaction()!=null){
                session.getTransaction().rollback();
            }
            ex.printStackTrace();
            return Optional.empty();
        }
    }
}
