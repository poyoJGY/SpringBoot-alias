package me.jgy.b01.service;

import me.jgy.b01.security.dto.MemberJoinDTO;

public interface MemberService {

    static class MidExistException extends Exception {
    }

    void join(MemberJoinDTO memberJoinDTO) throws MidExistException;
}
