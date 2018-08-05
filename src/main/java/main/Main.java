package main;

import dao.MessageDAO;
import dao.UserDAO;
import entity.Message;
import entity.User;
import utils.HibernateUtil;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");

//        User user = new User();
//        user.setName("name3");
//        user.setEmail("email3");
//
//        UserDAO userDAO = new UserDAO();
//        userDAO.add(user);

        Message message = new Message();
        message.setId(1);
        message.setMessage("msg11");
        message.setFrom("test1");

        MessageDAO messageDAO = new MessageDAO();
        messageDAO.add(message);

        HibernateUtil.closeHibernateSession();


    }
}
