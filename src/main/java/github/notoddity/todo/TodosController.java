package github.notoddity.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todos")
public class TodosController {
  @GetMapping
  public String todos() {
    return "todos";
  }
}
