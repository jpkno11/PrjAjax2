package com.green.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//@Controller+ @RequestMapping("/mvc"):.jsp,.mustache 을 찾고
//@Controller+ @RequestMapping + @responseBody
// : .jsp .mustache을 찾지않고 data를 출력한다 : 새로운 페이지에
//@Controller + @ ResponseBody:@RestController
// 모든 함수에 rResponseBody가 적용된다
// @Controller: view 파일을 리턴하고 
// @RestControoler : data를 리턴한다.


@Controller
public class MvcController {
	 @RequestMapping("/mvc")
	 public String mvc(Model model) {
		 model.addAttribute("username","카리나");
		 return "mvc";   // src/main/resources/templates  mvc.mustache
 }
	 @RequestMapping("/ajax1")
	 public String ajax1() {
		  String username = "카리나";
		  return username;   //카리나.mustache  404  No static resource 카리나
	 }
	 @RequestMapping("/ajax2")
	 @ResponseBody
	 public String ajax2() {
		  String username = "<h2>카리나</h2>";
		  return username;   //카리나.mustache  404  No static resource 카리나출력
	 }

}
