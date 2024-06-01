package com.lizana.user_management.applications.user_service_implements;

import com.lizana.user_management.applications.user_dtos.UserDtoLoginRequest;
import com.lizana.user_management.applications.user_dtos.UserDtoRegistryRequest;
import com.lizana.user_management.applications.user_dtos.UserProfileDtoResponse;
import com.lizana.user_management.applications.user_service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImplents implements UserService {
  @Override
  public Mono<String> UserRegistryService(UserDtoRegistryRequest userDtoRegistryRequest) {
    return Mono.just("Usuario registrado con exito");
  }

  @Override
  public Mono<String> UserLoginService(UserDtoLoginRequest userDtoLoginRequest) {
    return Mono.just("usuario LOgueado Correctamente");
  }

  @Override
  public Mono<UserProfileDtoResponse> GetProfileService(String userId) {
    return null;
  }

  @Override
  public Mono<String> UserUpdateProfile(UserDtoRegistryRequest userDtoRegistryRequest) {
    return Mono.just("Datos actualizaddos correctamente");
  }
}
