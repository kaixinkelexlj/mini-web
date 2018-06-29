package com.fun.mini.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xulujun
 * @date 2018/06/28
 */
@Controller
public class PortalController {

    @RequestMapping("hello-docker.json")
    @ResponseBody
    public String helloDocker() throws Exception {
        return "hello docker";
    }

    @RequestMapping("check-preload.json")
    @ResponseBody
    public String checkPreload() throws Exception {
        return "success";
    }

}
