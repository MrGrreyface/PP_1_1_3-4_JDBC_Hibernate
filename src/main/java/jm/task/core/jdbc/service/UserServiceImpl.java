package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserServiceImpl implements UserService {

    UserDaoJDBCImpl userDaoJDBC;

    {
        try {
            userDaoJDBC = new UserDaoJDBCImpl();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public UserServiceImpl() {

    }

    public void createUsersTable() {
        userDaoJDBC.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoJDBC.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBC.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoJDBC.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoJDBC.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoJDBC.cleanUsersTable();
    }
}
