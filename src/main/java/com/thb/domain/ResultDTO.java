package com.thb.domain;

import lombok.Data;

@Data
public class ResultDTO<T> {
    private Boolean result;
    private String message;
    private T data;

}
