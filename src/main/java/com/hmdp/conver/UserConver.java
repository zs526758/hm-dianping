package com.hmdp.conver;

import com.hmdp.dto.UserDTO;
import com.hmdp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *   TODO
 * </P>
 *
 * @date: 2023/4/27
 * @author: xz
 * @version: 1.0
 */
@Mapper
public interface UserConver {
    UserConver INSTANCT =Mappers.getMapper(UserConver.class);
    UserDTO user2UserDto(User user);
    User UserDto2User(UserDTO userDTO);
}
