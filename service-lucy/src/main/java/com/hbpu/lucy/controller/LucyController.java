package com.hbpu.lucy.controller;

import com.hbpu.lucy.service.LucyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2018/9/29.
 */
@RestController
public class LucyController {

    @Autowired
    LucyService lucyService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return lucyService.hiService( name );
    }

    @GetMapping(value = "/he")
    public String he(@RequestParam String name) {
        return lucyService.home( name );
    }
}