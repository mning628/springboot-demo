package com.mn.demo.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * Created by Administrator on 2019/5/8.
 */
@Data
public class Demo
{

    /**
     * 其他供参考的校验
     *
     * @null 验证对象是否为空
     * @notnull 验证对象是否为非空
     * @asserttrue 验证 boolean 对象是否为 true
     * @assertfalse 验证 boolean 对象是否为 false
     * @min 验证 number 和 string 对象是否大等于指定的值
     * @max 验证 number 和 string 对象是否小等于指定的值
     * @decimalmin 验证 number 和 string 对象是否大等于指定的值，小数存在精度
     * @decimalmax 验证 number 和 string 对象是否小等于指定的值，小数存在精度
     * @size 验证对象（array,collection,map,string）长度是否在给定的范围之内
     * @digits 验证 number 和 string 的构成是否合法
     * @past 验证 date 和 calendar 对象是否在当前时间之前
     * @future 验证 date 和 calendar 对象是否在当前时间之后
     * @pattern 验证 string 对象是否符合正则表达式的规则
     * @Email 验证邮箱
     */
    @NotEmpty(message = "名字不能为空")
    private String name;

    @Length(min = 6, message = "密码长度不能小于6位")
    private String password;

}
