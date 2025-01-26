package com.myfirstwebapp.todo_web_application.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    // http://localhost:8080/login?name=John
    //req param and model
    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name , ModelMap model) {
        model.put("name",name);
        return "login";

    }
}
