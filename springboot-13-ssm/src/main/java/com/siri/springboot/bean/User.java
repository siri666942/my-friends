package com.siri.springboot.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 */
@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private String cardNumber;

    private String birthday;

    private static final long serialVersionUID = 1L;
}