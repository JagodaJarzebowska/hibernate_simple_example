package dao;

import entity.User;

public class UserDAO extends AbstractDAO<User> {
    @Override
    protected Class<User> getClazz() {
        return User.class;
    }
}
