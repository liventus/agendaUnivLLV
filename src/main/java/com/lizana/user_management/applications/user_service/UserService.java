package com.lizana.user_management.applications.user_service;

import com.lizana.user_management.applications.user_dtos.UserDtoLoginRequest;
import com.lizana.user_management.applications.user_dtos.UserDtoRegistryRequest;
import com.lizana.user_management.applications.user_dtos.UserProfileDtoResponse;
import reactor.core.publisher.Mono;

public interface UserService {

  Mono <String> UserRegistryService(UserDtoRegistryRequest userDtoRegistryRequest);

  Mono<String> UserLoginService(UserDtoLoginRequest userDtoLoginRequest);

  Mono<UserProfileDtoResponse> GetProfileService(String userId);

  Mono<String> UserUpdateProfile(UserDtoRegistryRequest userDtoRegistryRequest);
}
