package com.kanahei.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ApiResponse {
    private boolean result;
    private String msg;
    private Object data;
}
