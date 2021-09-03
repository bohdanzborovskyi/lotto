package pl.fissst.lbd.lotto.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CouponModelApi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-02T12:00:11.529248300+02:00[Europe/Belgrade]")
public class CouponModelApi   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("creationDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;

  @JsonProperty("numbers")
  @Valid
  private Set<Integer> numbers = null;

  @JsonProperty("numberOfHits")
  private Integer numberOfHits;

  public CouponModelApi id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CouponModelApi creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public CouponModelApi numbers(Set<Integer> numbers) {
    this.numbers = numbers;
    return this;
  }

  public CouponModelApi addNumbersItem(Integer numbersItem) {
    if (this.numbers == null) {
      this.numbers = new LinkedHashSet<>();
    }
    this.numbers.add(numbersItem);
    return this;
  }

  /**
   * Get numbers
   * @return numbers
  */
  @ApiModelProperty(value = "")

@Size(min=6,max=6) 
  public Set<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(Set<Integer> numbers) {
    this.numbers = numbers;
  }

  public CouponModelApi numberOfHits(Integer numberOfHits) {
    this.numberOfHits = numberOfHits;
    return this;
  }

  /**
   * Get numberOfHits
   * @return numberOfHits
  */
  @ApiModelProperty(value = "")


  public Integer getNumberOfHits() {
    return numberOfHits;
  }

  public void setNumberOfHits(Integer numberOfHits) {
    this.numberOfHits = numberOfHits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponModelApi coupon = (CouponModelApi) o;
    return Objects.equals(this.id, coupon.id) &&
        Objects.equals(this.creationDate, coupon.creationDate) &&
        Objects.equals(this.numbers, coupon.numbers) &&
        Objects.equals(this.numberOfHits, coupon.numberOfHits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, numbers, numberOfHits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponModelApi {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    numberOfHits: ").append(toIndentedString(numberOfHits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

