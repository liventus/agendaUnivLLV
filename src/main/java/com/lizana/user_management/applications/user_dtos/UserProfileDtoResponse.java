package com.lizana.user_management.applications.user_dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileDtoResponse {

  private String userName;
  private String userLastName;
  private String userEmail;
  private String userPhone;
  private String userUrlPhoto;

}
