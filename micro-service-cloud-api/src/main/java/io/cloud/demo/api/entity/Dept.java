package io.cloud.demo.api.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @Author Cloud_J
 * @Create 2023/2/10 16:29
 * @Description TODO
 */
@Data
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}
