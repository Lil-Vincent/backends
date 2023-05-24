package com.kob.backends.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lil
 * @date 2023/05/24 13:31
 **/

@RestController
@RequestMapping("/pk/")
public class BothInfoController {
    @RequestMapping("getbotinfo/")
    public String getBotInfo() {
        return "hhhhhhh";
    }
}