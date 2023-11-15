package github.notoddity.todo;

import jakarta.annotation.Nonnull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.util.Arrays;

@Controller
@RequestMapping("/todos")
public class TodosController {
  @GetMapping
  public String todos(@Nonnull final Model model) {
    loadDefaults(model);
    return "todos";
  }

  private void loadDefaults(@Nonnull final Model model) {
    TodoEntity[] todos = {
          TodoEntity.builder()
              .id(0L)
              .description("Learn Spring MVC")
              .insertedOn(new Timestamp(System.currentTimeMillis()))
              .build(),
          TodoEntity.builder()
              .id(1L)
              .description("Learn Spring Boot")
              .insertedOn(new Timestamp(System.currentTimeMillis()))
              .build(),
          TodoEntity.builder()
              .id(2L)
              .description("Learn Spring Data JPA")
              .insertedOn(new Timestamp(System.currentTimeMillis()))
              .build(),
    };
    model.addAttribute("Todo", new TodoEntity());
    model.addAttribute("todos", Arrays.asList(todos));
  }
}
