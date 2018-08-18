package vn.myclass.core.dao;

import vn.myclass.core.data.dao.GenericDAO;
import vn.myclass.core.persestence.entity.Role;
import vn.myclass.core.persestence.entity.User;

import java.util.List;

public interface UserDAO extends GenericDAO<Integer,User> {
    boolean isExistUser(String email,String password);
    List<Role> getListUser();

} 
