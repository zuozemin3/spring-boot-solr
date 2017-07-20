package com.zzm.user.controller;

import com.zzm.user.service.UserService;
import com.zzm.user.vo.UserVo;
import com.zzm.utils.ResultBuilder;
import com.zzm.utils.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public ResultVo getUserById(@PathVariable String name) {
        userService.getUserByName(name);
        return ResultBuilder.buildSuccess().with("", "");
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResultVo insertUser(@RequestBody UserVo userVo) {
        userService.insertUser(userVo);
        return ResultBuilder.buildSuccess().with("", "");
    }
}
