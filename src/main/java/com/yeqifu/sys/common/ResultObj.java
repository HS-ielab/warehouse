package com.yeqifu.sys.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 落亦-
 * @Date: 2019/11/21 21:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {

    public static final ResultObj LOGIN_SUCCESS=new ResultObj(Constast.OK,"登陆成功");
    public static final ResultObj LOGIN_ERROR_PASS=new ResultObj(Constast.ERROR,"用户名或密码错误");
    public static final ResultObj LOGIN_ERROR_CODE=new ResultObj(Constast.ERROR,"验证码错误");

    public static final ResultObj ADD_SUCCESS = new ResultObj(Constast.OK,"添加成功");
    public static final ResultObj ADD_ERROR = new ResultObj(Constast.ERROR,"添加失败");

    public static final ResultObj DELETE_SUCCESS = new ResultObj(Constast.OK,"删除成功");
    public static final ResultObj DELETE_ERROR = new ResultObj(Constast.ERROR,"删除失败");

    public static final ResultObj UPDATE_SUCCESS = new ResultObj(Constast.OK,"修改成功");
    public static final ResultObj UPDATE_ERROR = new ResultObj(Constast.ERROR,"修改失败");

    public static final ResultObj RESET_SUCCESS = new ResultObj(Constast.OK,"重置成功");
    public static final ResultObj RESET_ERROR = new ResultObj(Constast.ERROR,"重置失败");

    public static final ResultObj DISPATCH_SUCCESS = new ResultObj(Constast.OK,"分配成功");
    public static final ResultObj DISPATCH_ERROR = new ResultObj(Constast.ERROR,"分配失败");

    private Integer code;
    private String msg;

}