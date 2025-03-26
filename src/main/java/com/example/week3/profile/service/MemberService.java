package com.example.week3.profile.service;

import com.example.week3.profile.Member;
import com.example.week3.profile.dto.MemberRequest;
import com.example.week3.profile.dto.MemberResponse;
import com.example.week3.profile.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

  private final MemberRepository memberRepository;

  @Transactional
  public MemberResponse join(MemberRequest memberRequest) {

    // Member 객체 생성
    Member member = Member.builder()
        .username(memberRequest.getUsername())
        .password(memberRequest.getPassword())
        .build();

    // 데이터베이스 저장
    Member savedMember = memberRepository.save(member);

    return MemberResponse.builder()
        .username(savedMember.getUsername())
        .build();
  }
}
