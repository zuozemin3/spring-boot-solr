package com.zzm.user.service;

import com.zzm.user.vo.UserVo;

public interface UserService {
    /**
     * 根据名称获取用户
     *
     * @param name
     * @return
     */
    UserVo getUserByName(String name);

    /**
     * 保存用户
     *
     * @param userVo
     * @return
     */
    Integer insertUser(UserVo userVo);
}
