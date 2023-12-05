package com.valuedones.controller;

import com.valuedones.common.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")
public class InitController {
    @RequestMapping("/user")
    public void init() {
    }

}
