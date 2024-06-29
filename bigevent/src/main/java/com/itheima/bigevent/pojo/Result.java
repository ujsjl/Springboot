package com.itheima.bigevent.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor //无参数的构造方法
@AllArgsConstructor //全参数的构造方法
@Data
public class Result<T> {
    private Integer code;// 业务状态码 0-成果，1-失败
    private String message;//提示信息

    private T data;//T代表泛型，可以指代对象，内容

    //返回成功响应（带相应数据）
    public static <E> Result<E> success(E data){
        return new Result<>(0,"操作成功",data);

    }

    //返回成功响应
    public static Result success(){
        return new Result<>(0,"操作成功",null);
    }

    public static Result error(String message){
        return new Result<>(1,message,null);
    }

}
