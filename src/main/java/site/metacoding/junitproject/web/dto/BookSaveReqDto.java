package site.metacoding.junitproject.web.dto;

import lombok.Setter;
import site.metacoding.junitproject.domain.Book;

@Setter // Controller 에서 Setter가 호출되면서 dto에 값이 채워짐
public class BookSaveReqDto {
    private String title;
    private String author;

    public Book toEntiry() {
        return Book.builder()
                .title(title)
                .author(author)
                .build();
    }
}
