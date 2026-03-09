package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class UserController {

    @RequestMapping("/")
    
    
    public String getHomepage(){
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