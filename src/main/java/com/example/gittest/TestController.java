package com.example.gittest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 李树洪
 * @Email 2324592742@qq.com
 * @Date 2020/8/17 18:10
 */
@RestController
public class TestController {
    @RequestMapping("test")
    public String test(){
        return "李树洪";

    }
}
