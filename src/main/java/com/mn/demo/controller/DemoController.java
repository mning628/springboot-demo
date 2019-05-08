package com.mn.demo.controller;


import com.mn.demo.bean.Demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class DemoController
{

    @PostMapping("demo/test")
    public void demoValidatorTest(@RequestBody @Valid Demo demo)
    {
        log.info(demo.getName() + ":" + demo.getPassword());
    }
}
