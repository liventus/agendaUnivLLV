package com.lizana.user_management.infrastructure.controllers;

import com.lizana.user_management.applications.user_dtos.UserDtoLoginRequest;
import com.lizana.user_management.applications.user_dtos.UserDtoRegistryRequest;
import com.lizana.user_management.applications.user_dtos.UserProfileDtoResponse;
import com.lizana.user_management.applications.user_service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserControllers {


  private UserService userService;

  @PostMapping("register")
  public ResponseEntity<Mono<String>> getUser(
      @RequestBody UserDtoRegistryRequest userDtoRegistryRequest) {
    return new ResponseEntity<>(userService.UserRegistryService(userDtoRegistryRequest),
        HttpStatus.OK);
  }

  @PostMapping("login")
  public Mono<ResponseEntity<String>> userLogin(
      @RequestBody UserDtoLoginRequest userDtoLoginRequest) {
    return userService.UserLoginService(userDtoLoginRequest)
        .map(p -> new ResponseEntity<>(p, HttpStatus.OK))
        .switchIfEmpty(Mono.just(new ResponseEntity<>(HttpStatus.NOT_FOUND)));
  }

  @GetMapping("profile/{userId}")
  public ResponseEntity<Mono<UserProfileDtoResponse>> getUserProfile(
      @PathVariable("userId") String userID) {
    return new ResponseEntity<>(userService.GetProfileService(userID), HttpStatus.OK);
  }

  @PutMapping("profile")
  public ResponseEntity<Mono<String>> putUserData(
      @RequestBody UserDtoRegistryRequest userDtoRegistryRequest) {
    return new ResponseEntity<>(userService.UserUpdateProfile(userDtoRegistryRequest),
        HttpStatus.OK);
  }

}
