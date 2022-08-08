package com.example.emoji

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.time.Instant

class EmojiRemoveFilterTest {

    @DisplayName("리플렉션 테스트")
    @Test
    fun `리플렉션 필터 확인`() {
        val 이모지_필터 = EmojiRemoveFilter()

        val 지금 = Instant.now()

        val 이모지_리퀘스트1 = RequestObject("\uD83D\uDE4F", "내용\uD83D\uDE4F", "to@gmail.com", 지금)
        val 이모지_리퀘스트2 = RequestObject("타이틀", "내용", "to@gmail.com", 지금)

        이모지_필터.doFilter(이모지_리퀘스트1)
        이모지_필터.doFilter(이모지_리퀘스트2)

        assertThat(이모지_리퀘스트1.title).isEqualTo("")
        assertThat(이모지_리퀘스트1.contents).isEqualTo("내용")
        assertThat(이모지_리퀘스트1.to).isEqualTo("to@gmail.com")
        assertThat(이모지_리퀘스트1.createdTime).isEqualTo(지금)

        assertThat(이모지_리퀘스트2.title).isEqualTo("타이틀")
        assertThat(이모지_리퀘스트2.contents).isEqualTo("내용")
        assertThat(이모지_리퀘스트2.to).isEqualTo("to@gmail.com")
        assertThat(이모지_리퀘스트2.createdTime).isEqualTo(지금)
    }
}