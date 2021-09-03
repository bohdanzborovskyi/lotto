package lambda;

import java.time.OffsetDateTime;
import java.util.Set;

public class DrawDto
{

    private Long id;
    private OffsetDateTime creationDate;
    private Set<Integer> numbers;

    public DrawDto(Long id, OffsetDateTime creationDate, Set<Integer> numbers) {
        this.id = id;
        this.creationDate = creationDate;
        this.numbers = numbers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }
}
