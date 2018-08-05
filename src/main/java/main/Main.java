package main;

import dao.UserDAO;
import entity.User;
import utils.HibernateUtil;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");

        User user = new User();
        user.setName("name2");
        user.setEmail("email2");

        UserDAO userDAO = new UserDAO();
        userDAO.add(user);
        HibernateUtil.closeHibernateSession();


    }
}
