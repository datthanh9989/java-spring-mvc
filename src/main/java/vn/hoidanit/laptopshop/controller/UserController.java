package vn.hoidanit.laptopshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserServive;



// @Controller
// public class UserController {

//     @RequestMapping("/")
//     public String getHomepage(){
//         return "hello from controler";
//     }
// }
@RestController
public class UserController {
    private UserServive userServive;
    
    public UserController(UserServive userServive) {
        this.userServive = userServive;
    }

    @GetMapping("")
    public String getHomepage(){
        return this.userServive.handleHello();
    }
}