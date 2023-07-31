package com.dokkaebi.domain;

import lombok.Data;

@Data
public class MemberResponseDTO {
  private Long id;
  private String email;
  private String nickname;
  private Integer iconNumber;

  public MemberResponseDTO(Member member) {
    id = member.getId();
    email = member.getEmail();
    nickname = member.getNickname();
    iconNumber = member.getIconNumber();
  }
}