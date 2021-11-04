package com.it.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: springcloud
 * @description: 实体类
 * @author: wf
 * @create: 2021-11-04 13:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = -5442424141819514836L;

    private Long id;
    private String serial;
}
