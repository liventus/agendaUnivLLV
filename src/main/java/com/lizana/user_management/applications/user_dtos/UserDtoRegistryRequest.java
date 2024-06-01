package com.lizana.user_management.applications.user_dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDtoRegistryRequest {

  private String userDtoId;
  private String userDtoPassword;
  private String userDtoName;
  private String userDtoLastName;
  private String userDtoEmail;
  private String userDtoPhone;
  private String userDtoUrlPhoto;

}
