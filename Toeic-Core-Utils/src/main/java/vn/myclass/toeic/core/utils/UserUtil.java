package vn.myclass.toeic.core.utils;

import vn.myclass.core.persestence.entity.User;
import vn.myclass.toeic.core.dto.UserDTO;

public class UserUtil {
    public static UserDTO entity2DTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setCreateddate(user.getCreateddate());
        userDTO.setFullname(user.getFullname());
        userDTO.setListComment(user.getListComment());
        userDTO.setPassword(user.getPassword());
        userDTO.setUserId(user.getUserId());
        userDTO.setRole(user.getRole());
        return userDTO;
    }

} 
