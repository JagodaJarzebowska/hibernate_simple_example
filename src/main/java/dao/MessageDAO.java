package dao;

import entity.Message;

public class MessageDAO extends AbstractDAO<Message>{
    @Override
    protected Class<Message> getClazz() {
        return Message.class;
    }
}
