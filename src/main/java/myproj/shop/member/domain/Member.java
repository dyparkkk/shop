package myproj.shop.member.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String memberId;

    private String memberPw;

    private String name;

    public Member(String memberId, String memberPw, String name) {
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.name = name;
    }

}
