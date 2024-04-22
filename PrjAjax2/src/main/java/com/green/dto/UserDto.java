package com.green.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 
 //@Data : @NoargsContstructor+ @Setter + @Tostring
// + hashCode() + equals()
 // @ALLArgsConstructor 추가되면 기본생성자 모든 인자생성자로 변경된다
  // @NoargsConstructor 를 추가해야한다.

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto { 
   private String userid;
   private String userpass;
   private String username;

}
