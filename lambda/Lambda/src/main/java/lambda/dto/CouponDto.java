package lambda.dto;

import java.time.OffsetDateTime;
import java.util.Set;

public class CouponDto
{
    private Long id;
    private OffsetDateTime creationDate;
    private Set<Integer> numbers;
    private Integer numberOfHits;

    public CouponDto(Long id, OffsetDateTime creationDate, Set<Integer> numbers, Integer numberOfHits) {
        this.id = id;
        this.creationDate = creationDate;
        this.numbers = numbers;
        this.numberOfHits = numberOfHits;
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

    public Integer getNumberOfHits() {
        return numberOfHits;
    }

    public void setNumberOfHits(Integer numberOfHits) {
        this.numberOfHits = numberOfHits;
    }
}
