package academy.learnprogramming.model;

import lombok.*;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class TodoItem {

    // == fields ==
    private String title;
    private String details;
    private LocalDate deadLine;
    private int id;

    // == constructor ==
    public TodoItem(String title, String details, LocalDate deadLine) {
        this.title = title;
        this.details = details;
        this.deadLine = deadLine;
    }
}
