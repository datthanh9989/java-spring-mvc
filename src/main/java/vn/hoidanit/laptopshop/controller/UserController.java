package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.hoidanit.laptopshop.service.UserServive;




@Controller
public class UserController {
    private UserServive userServive;
    
    public UserController(UserServive userServive) {
        this.userServive = userServive;
    }

    @RequestMapping("/")
    public String getHomepage(){
        String test = this.userServive.handleHello();
        return "eric.html";
    }
}
// @RestController
// public class UserController {
//     private UserServive userServive;
    
//     public UserController(UserServive userServive) {
//         this.userServive = userServive;
//     }

//     @GetMapping("")
//     public String getHomepage(){
//         return this.userServive.handleHello();
//     }
// }