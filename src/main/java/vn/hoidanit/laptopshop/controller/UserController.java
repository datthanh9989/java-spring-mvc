package vn.hoidanit.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;
import vn.hoidanit.laptopshop.service.UserServive;




@Controller
public class UserController {
    private final UserRepository userRepository;
    private final UserServive userServive;
    
    public UserController(UserServive userServive, UserRepository userRepository) {
        this.userServive = userServive;
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public String getHomePage(Model model){
        List<User> arrUser = this.userServive.getAllUserByEmail("1@gmail.com");
        model.addAttribute("hoidanit", "from controller with model");
        return "hello";
    }
    @RequestMapping("/admin/user")
    public String getUserPage(Model model){
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }
    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User hoidanit){
        this.userServive.handleSaveUser(hoidanit);
        System.out.println(" run here " + hoidanit);
        return "hello";
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