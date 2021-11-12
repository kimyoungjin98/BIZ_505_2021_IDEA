package com.callor.sec.controller;


import com.callor.sec.models.UserDetailsVO;
import com.callor.sec.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
@RequestMapping(value="/member")
public class MemberController {

    private final MemberService memberService;

    public MemberController(@Qualifier("memServiceV1") MemberService memberService) {
        this.memberService = memberService;
    }

    // login form 을 열기 위한 URL
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String login() {
        return "member/login";
    }


    @RequestMapping(value="/join",method=RequestMethod.GET)
    public String join() {
        return "member/join";
    }

    @RequestMapping(value="/join",method=RequestMethod.POST)
    public String join(UserDetailsVO userVO) {
        log.debug("회원가입 : {}", userVO.toString());
        return "member/join";
    }

    @RequestMapping(value="/idcheck", method = RequestMethod.GET)
    public String idCheck(String username){

        if(username.equalsIgnoreCase("callor")){
            return "callor";
        } else {
            return null;
        }
    }

}
