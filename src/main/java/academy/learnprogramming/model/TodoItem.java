package academy.learnprogramming.model;

import lombok.*;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class TodoItem {

    // == fields ==
    private String title;
    private String details;
    private LocalDate deadline;
    private int id;

    // == constructor ==
    public TodoItem(String title, String details, LocalDate deadline) {
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }
}
