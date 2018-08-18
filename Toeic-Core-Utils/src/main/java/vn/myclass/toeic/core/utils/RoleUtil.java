package vn.myclass.toeic.core.utils;

import vn.myclass.core.persestence.entity.Role;
import vn.myclass.toeic.core.dto.RoleDTO;

public class RoleUtil {
    public static RoleDTO entity2DTO(Role role){
       RoleDTO roleDTO = new RoleDTO();
       roleDTO.setName(role.getName());
       roleDTO.setRoleId(role.getRoleId());
       roleDTO.setListUser(role.getListUser());
       return roleDTO;
    }
} 
