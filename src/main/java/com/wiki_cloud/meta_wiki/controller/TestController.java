package com.wiki_cloud.meta_wiki.controller;

import com.wiki_cloud.meta_wiki.domain.Test;
import com.wiki_cloud.meta_wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qingfeng
 * meta_wiki
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/list")
    public List<Test> list() {
        return testService.list();
    }
}
