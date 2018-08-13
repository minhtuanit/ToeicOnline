package vn.myclass.test;

import org.testng.annotations.Test;
import vn.myclass.core.dao.RoleDAO;
import vn.myclass.core.daoimpl.RoleDAOImpl;
import vn.myclass.core.persestence.entity.Role;

import java.util.List;

public class RoleTest {
    @Test
    public void findAll(){
        RoleDAO roleDAO = new RoleDAOImpl();
        List<Role> list = roleDAO.findAll();
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i).getName() + " " + list.get(i).getRoleId());
        }
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
