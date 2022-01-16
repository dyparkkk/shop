package myproj.shop.member.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import myproj.shop.member.domain.Member;

@Data
@NoArgsConstructor
public class MemberDto {
    private String memberId;
    private String memberPw;
    private String name;
    private String memberPwCheck;

    public Member toEntity() {
        return new Member(this.memberId, this.memberPw, this.name);
    }
}
