package quyentq_lab.authen_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthenController {
    @Autowired
    private AuthenService authenService;

    @GetMapping("/create-user")
    public String createUser() {
//        authenService.createUser();
        authenService.createUser();
        return "create-user";
    }

    @GetMapping("/get-user")
    public String getUser(@RequestParam String username) {
//        authenService.createUser();
        return authenService.login(username, "");
    }
}
