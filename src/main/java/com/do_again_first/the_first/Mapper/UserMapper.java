package com.do_again_first.the_first.Mapper;

import com.do_again_first.the_first.Dto.Request.RegisterRequest;
import com.do_again_first.the_first.Dto.Response.UserResponse;
import com.do_again_first.the_first.Entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(RegisterRequest request);
    UserResponse toUserResponse(User user);

}
