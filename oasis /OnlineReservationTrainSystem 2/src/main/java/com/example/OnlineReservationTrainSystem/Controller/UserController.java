package com.example.OnlineReservationTrainSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.OnlineReservationTrainSystem.services.userServices;

@Controller
public class UserController {

    @Autowired
    private userServices userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView handleLogin(@RequestParam("email") String email,
                                    @RequestParam("password") String password,
                                    Model model) {

        // Your login logic goes here.
        // For simplicity, let's assume userService has a method to authenticate the user.
    	System.out.print(email+"\n");
    	System.out.print(password);
    	System.out.print(userService.getUserById((long)1));
//        boolean isAuthenticated = userService.authenticateUser(email, password);
//
//        if (isAuthenticated) {
//            // User is authenticated, proceed to the dashboard.
//            model.addAttribute("message", "Login successful!");
//
//            // Assuming you have a "welcome" view
//            return new ModelAndView("welcome");
//        } else {
//            // Authentication failed, show the login form with an error message.
//            model.addAttribute("error", true);
//
//            // Assuming you have a "login" view
//            return new ModelAndView("login");
//        }
    	return new ModelAndView("welcome");
    }
}
