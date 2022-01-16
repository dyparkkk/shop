package myproj.shop.member.service;

import lombok.RequiredArgsConstructor;
import myproj.shop.member.domain.Member;
import myproj.shop.member.domain.MemberRepository;
import myproj.shop.member.dto.MemberDto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Long joinMember(MemberDto dto) {
        // pw check logic 구현 필요

        Member member = dto.toEntity();
        return memberRepository.save(member).getId();
    }
}
