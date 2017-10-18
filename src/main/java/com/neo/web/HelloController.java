package com.neo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Service、@Controller 和 @Component 将类标 识为Bean Spring 2.5
 *  在 @Repository的基础上增加了功能类似的额外
 *三个注解：@Component、@Service、@Constroller，它 们分别用于软件系统的不同层次：
 * @Component 是一个泛化的概念，仅仅表示一个组件 (Bean) ，可以作用在任何层次。
 * @Service 通 常 作 用 在 业 务 层 ， 但 是 目 前 该 功 能 与@Component 相同。
 * @Constroller 通常作用在控制层，但是目前该功能与 @Component 相同。
 *
 */

@Controller
public class HelloController {

	@RequestMapping("/hello")
	 public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
	
}















