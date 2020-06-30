package com.xizi.vo;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
public class Result {
    private Boolean status=true;
    private String msg;
}
