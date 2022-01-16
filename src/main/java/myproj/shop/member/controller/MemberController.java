package myproj.shop.member.controller;

import lombok.RequiredArgsConstructor;
import myproj.shop.member.dto.MemberDto;
import myproj.shop.member.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

//    @RequestMapping(value = "/join", method = {RequestMethod.GET, RequestMethod.POST})
//    public String join(@ModelAttribute("joinVO") MemberDto dto){
//        // model.addAttribute (view로 데이터 뿌림) 기능과 데이터 받아오기 둘다 함
//
//        return "member/join";
//    }

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String join_member(@ModelAttribute("joinMember") MemberVo)

}
