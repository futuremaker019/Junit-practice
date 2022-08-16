package site.metacoding.junitproject.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    // 책 등록
    @Test
    public void 책등록_test() {
        // given (데이터 준비)
        String title = "junit5";
        String author = "메타코딩";
        Book book = Book.builder()
                .title(title)
                .author(author)
                .build();

        // when (데이터 실행)
        Book bookPS = bookRepository.save(book);

        // then (검증)
        Assertions.assertEquals(title, bookPS.getTitle());
        Assertions.assertEquals(author, bookPS.getAuthor());
    }

    // 책 목록보기

    // 책 한건보기

    // 책 수정

    // 책 삭제

}