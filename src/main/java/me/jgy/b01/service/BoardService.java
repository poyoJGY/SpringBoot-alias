package me.jgy.b01.service;

import me.jgy.b01.dto.BoardDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);
    void modify(BoardDTO boardDTO);
    void remove(Long bno);
}
