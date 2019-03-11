package com.springboot.mybatisdemo.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author : 石建雷
 * @date :2019/2/27
 */
@Data
public class User {
    //    注意对数据做校验时对于Integer和long要用@NotNull
    @NotNull
    private Integer id;
    @NotBlank(message = "用户名不能为空！")
    private String name;
    @NotNull
    private Integer age;

    public User() {
    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
