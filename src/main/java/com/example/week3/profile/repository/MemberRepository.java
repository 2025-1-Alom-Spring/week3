package com.example.week3.profile.repository;

import com.example.week3.profile.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
