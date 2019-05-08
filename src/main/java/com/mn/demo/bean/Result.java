package com.mn.demo.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable
{
    private int code;
    private String msg;
    private Object data;

}
