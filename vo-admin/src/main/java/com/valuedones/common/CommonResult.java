package com.valuedones.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class CommonResult implements Serializable {
    private int resultCode;
    private String message;
    private String data;

    public static CommonResult SUCCESS(String data) {
        return new CommonResult(200, "OK", data);
    }
}
