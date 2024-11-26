package com.do_again_first.the_first.Controller;

import com.do_again_first.the_first.Dto.Request.ApiResponse;
import com.do_again_first.the_first.Dto.Request.RegisterRequest;
import com.do_again_first.the_first.Entities.User;
import com.do_again_first.the_first.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired

    private UserService userService;

    @PostMapping
    ApiResponse<User> RegisterUser(@RequestBody @Valid RegisterRequest request) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.RegisterUser(request));
        return apiResponse;
    }

}
