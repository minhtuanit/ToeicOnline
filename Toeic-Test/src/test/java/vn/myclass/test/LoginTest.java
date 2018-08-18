package vn.myclass.test;

import org.testng.annotations.Test;
import vn.myclass.core.dao.RoleDAO;
import vn.myclass.core.daoimpl.RoleDAOImpl;
import vn.myclass.core.persestence.entity.Role;

import java.util.List;

public class LoginTest {

    @Test
    public void testLogin(){
        RoleDAO roleDAO = new RoleDAOImpl();
        List<Role> roleList = roleDAO.findAll();
        roleList.size();
    }
} 
