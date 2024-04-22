package com.green.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.dto.UserDto;

@RestController
//이페이지는 모든함수는 전부 @Responsebody 로 작동
// 1.데이터전송표준- soap protocal방식 : xml 
// 2,.데이터전송표준- rst api 방식 : json/xml
// @RestController : @Controller + @ResonseBody
public class DataServerController {
	@RequestMapping("/ajax3")
	public String ajax3() {
		String username="카리나";
		return username; // json으로 변경되어 출력
	}
	// UserDto class 를 추가한후 실행
	//자바객체 : new UserDto(userid, userpass, username)
	// json 라이브러리 javasonbinder 라이브러리가 작동함:
	// js 객체 : {"userid:"karin","userpass":"1234","username":"카리나"}
	
	@RequestMapping("/ajax4")
	public UserDto ajax4() {
		String  userid="karin";
		String  userpass="1234";
		String username="카리나";
	   UserDto user = new UserDto("userid",userpass,username); 
		return user;

}
}