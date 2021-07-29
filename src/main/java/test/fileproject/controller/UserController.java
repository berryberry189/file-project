package test.fileproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.fileproject.service.UserService;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    /**
     * user 권한 변경
     */
    @PostMapping("/{email}")
    public ResponseEntity updateRole(@PathVariable String email){

        return new ResponseEntity(userService.updateRoleAdmin(email), HttpStatus.OK);
    }

}
