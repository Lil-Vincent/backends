package com.kob.backends.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lil
 * @date 2023/05/24 13:26
 **/

@Controller
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("index/")
    public String index () {
        return "pk/index.html";
    }
}