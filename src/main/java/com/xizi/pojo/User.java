package com.xizi.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@CrossOrigin
@Accessors(chain = true)
public class User {
    private String id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date bir;
    private String sex;
    private String address;
}
