package com.shimh.common.util;

import org.apache.shiro.SecurityUtils;

import com.shimh.common.constant.Base;
import com.shimh.entity.User;

public class UserUtils {

    public static User getCurrentUser() {
        User user = (User) SecurityUtils.getSubject().getSession().getAttribute(Base.CURRENT_USER);
        return user;
    }
}
