package github.notoddity.todo;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
@AllArgsConstructor
public class EnvironmentAdvice {

  @Nonnull
  private final Environment environment;

  @ModelAttribute
  public void environmentAttributes(@Nonnull final Model model) {
    List<String> activeProfiles = Arrays.asList(environment.getActiveProfiles());
    model.addAttribute("liveReload", activeProfiles.contains("liveReload"));
  }
}
