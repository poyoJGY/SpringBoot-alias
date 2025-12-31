package me.jgy.b01.service;

import lombok.extern.log4j.Log4j2;
import me.jgy.b01.dto.BoardDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister() {

        log.info(boardService.getClass().getName());

        BoardDTO boardDTO = BoardDTO.builder()
                .title("Sample Title...")
                .content("Sample Content...")
                .writer("user00")
                .build();

        Long bno = boardService.register(boardDTO);

        log.info("bno: " + bno);
    }

    @Test
    public void testModify() {
        // 변경에 필요한 데이터만
        BoardDTO boardDTO = BoardDTO.builder()
                .bno(10L)
                .title("Updated....101")
                .content("Updated Content 101...")
                .build();

        boardService.modify(boardDTO);
    }
}
