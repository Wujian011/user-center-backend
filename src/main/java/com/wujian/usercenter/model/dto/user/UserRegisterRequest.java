package com.wujian.usercenter.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户注册请求体
 * @author wujian
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 校验密码
     */
    private String checkPassword;


}
