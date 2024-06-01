package com.lizana.user_management.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String userId;
  private String userPassword;
  private String userName;
  private String userLastName;
  private String userEmail;
  private String userPhone;
  private String userUrlPhoto;

}
