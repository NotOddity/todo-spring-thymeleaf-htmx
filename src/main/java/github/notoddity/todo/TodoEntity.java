package github.notoddity.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoEntity {
  private Long id;
  private String description;
  private Timestamp insertedOn;
  private Timestamp finishedOn;
  private Timestamp deletedOn;
}