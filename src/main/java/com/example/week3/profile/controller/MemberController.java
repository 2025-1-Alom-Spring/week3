package com.example.week3.profile.controller;

import com.example.week3.profile.dto.MemberRequest;
import com.example.week3.profile.dto.MemberResponse;
import com.example.week3.profile.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

  private final MemberService memberService;

  @PostMapping("/api/member")
  public ResponseEntity<MemberResponse> join(@RequestBody MemberRequest memberRequest) {
    return ResponseEntity.ok(memberService.join(memberRequest));
  }

}
