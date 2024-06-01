package com.lizana.user_management.applications.user_dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDtoLoginRequest {
  private String UserName;
  private String UserPassword;
}
