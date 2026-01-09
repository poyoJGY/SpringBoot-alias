package me.jgy.b01.controller.repository.search;

import me.jgy.b01.controller.domain.Board;
import me.jgy.b01.dto.BoardListReplyCountDTO;
import me.jgy.b01.dto.PageRequestDTO;
import me.jgy.b01.dto.PageResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardSearch {

    Page<Board> search1(Pageable pageable);

    Page<Board> searchAll(String[] types, String keyword, Pageable pageable);

    Page<BoardListReplyCountDTO> searchWithReplyCount(String[] types, String keyword, Pageable pageable);
}
