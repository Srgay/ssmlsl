package cm.itcast.controller;

//账户web层

import cm.itcast.domain.Account;
import cm.itcast.service.AccountService;
import cm.itcast.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    //登录
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password,Model model){
        Account account =new Account();
        account.setUsername(username);
        account.setPassword(password);
        if (accountService.login(account) != null){
            model.addAttribute("username",username);
            return "success";
        }else {
            model.addAttribute("error","账号或密码错误");
            return "login";
        }
    }
    //注册
    @Test
    @RequestMapping("/register")
    public String register(@RequestParam("username") String username,@RequestParam("password") String password){
        Account account =new Account();
        account.setUsername(username);
        account.setPassword(password);
        accountService.register(account);
        return "login";
    }


    @RequestMapping("/registerjsp")
    public String register(){
        return "register";
    }
    @RequestMapping("/loginjsp")
    public String loginjsp(){
        return "login";
    }





}
