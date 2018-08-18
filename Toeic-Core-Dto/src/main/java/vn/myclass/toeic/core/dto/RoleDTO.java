package vn.myclass.toeic.core.dto;

import vn.myclass.core.persestence.entity.User;

import java.io.Serializable;
import java.util.List;

public class RoleDTO implements Serializable{
    private Integer roleId;
    private String name;
    private List<User> listUser;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getListUser() {
        return listUser;
    }

    public void setListUser(List<User> listUser) {
        this.listUser = listUser;
    }
}
