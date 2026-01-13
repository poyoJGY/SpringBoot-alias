package me.jgy.b01.service;

import lombok.extern.log4j.Log4j2;
import me.jgy.b01.dto.ReplyDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class ReplyServiceTests {

    @Autowired
    private ReplyService replyService;

    @Test
    public void testRegister() {

        ReplyDTO replyDTO = ReplyDTO.builder()
                .replyText("ReplyDTO Text")
                .replier("replier")
                .bno(100L)
                .build();

        log.info(replyService.register(replyDTO));
    }
}
