package vn.myclass.test;

import org.testng.annotations.Test;
import vn.myclass.core.dao.RoleDAO;
import vn.myclass.core.dao.UserDAO;
import vn.myclass.core.daoimpl.RoleDAOImpl;
import vn.myclass.core.daoimpl.UserDAOImpl;
import vn.myclass.core.persestence.entity.Role;
import vn.myclass.core.persestence.entity.User;

import java.util.ArrayList;
import java.util.List;

public class RoleTest {
    @Test
    public void findAll(){
        RoleDAO roleDAO = new RoleDAOImpl();
        List<Role> roleList = roleDAO.findAll();
        roleList.size();
    }

    @Test
    public void update(){
        Role role = new Role();
        role.setName("tuandeptrai");
        role.setRoleId(1);
        RoleDAO roleDAO = new RoleDAOImpl();
        roleDAO.update(role);
    }
} 
