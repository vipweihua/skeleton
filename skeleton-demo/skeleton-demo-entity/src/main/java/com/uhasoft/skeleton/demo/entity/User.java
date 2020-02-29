package com.uhasoft.skeleton.demo.entity;

import lombok.Data;

/**
 *@author Weihua
 *@since 1.0.0
 */
@Data
public class User extends BaseEntity {

  private String name;
  private String password;

}
