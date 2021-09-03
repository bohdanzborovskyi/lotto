package pl.fissst.lbd.lotto.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DrawSummaryModelApi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-02T12:00:11.529248300+02:00[Europe/Belgrade]")
public class DrawSummaryModelApi   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("numbers")
  @Valid
  private Set<Integer> numbers = null;

  @JsonProperty("numberOf0Hits")
  private Integer numberOf0Hits;

  @JsonProperty("numberOf1Hits")
  private Integer numberOf1Hits;

  @JsonProperty("numberOf2Hits")
  private Integer numberOf2Hits;

  @JsonProperty("numberOf3Hits")
  private Integer numberOf3Hits;

  @JsonProperty("numberOf4Hits")
  private Integer numberOf4Hits;

  @JsonProperty("numberOf5Hits")
  private Integer numberOf5Hits;

  @JsonProperty("numberOf6Hits")
  private Integer numberOf6Hits;

  public DrawSummaryModelApi id(Long id) {
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

  public DrawSummaryModelApi numbers(Set<Integer> numbers) {
    this.numbers = numbers;
    return this;
  }

  public DrawSummaryModelApi addNumbersItem(Integer numbersItem) {
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

  public DrawSummaryModelApi numberOf0Hits(Integer numberOf0Hits) {
    this.numberOf0Hits = numberOf0Hits;
    return this;
  }

  /**
   * Get numberOf0Hits
   * @return numberOf0Hits
  */
  @ApiModelProperty(value = "")


  public Integer getNumberOf0Hits() {
    return numberOf0Hits;
  }

  public void setNumberOf0Hits(Integer numberOf0Hits) {
    this.numberOf0Hits = numberOf0Hits;
  }

  public DrawSummaryModelApi numberOf1Hits(Integer numberOf1Hits) {
    this.numberOf1Hits = numberOf1Hits;
    return this;
  }

  /**
   * Get numberOf1Hits
   * @return numberOf1Hits
  */
  @ApiModelProperty(value = "")


  public Integer getNumberOf1Hits() {
    return numberOf1Hits;
  }

  public void setNumberOf1Hits(Integer numberOf1Hits) {
    this.numberOf1Hits = numberOf1Hits;
  }

  public DrawSummaryModelApi numberOf2Hits(Integer numberOf2Hits) {
    this.numberOf2Hits = numberOf2Hits;
    return this;
  }

  /**
   * Get numberOf2Hits
   * @return numberOf2Hits
  */
  @ApiModelProperty(value = "")


  public Integer getNumberOf2Hits() {
    return numberOf2Hits;
  }

  public void setNumberOf2Hits(Integer numberOf2Hits) {
    this.numberOf2Hits = numberOf2Hits;
  }

  public DrawSummaryModelApi numberOf3Hits(Integer numberOf3Hits) {
    this.numberOf3Hits = numberOf3Hits;
    return this;
  }

  /**
   * Get numberOf3Hits
   * @return numberOf3Hits
  */
  @ApiModelProperty(value = "")


  public Integer getNumberOf3Hits() {
    return numberOf3Hits;
  }

  public void setNumberOf3Hits(Integer numberOf3Hits) {
    this.numberOf3Hits = numberOf3Hits;
  }

  public DrawSummaryModelApi numberOf4Hits(Integer numberOf4Hits) {
    this.numberOf4Hits = numberOf4Hits;
    return this;
  }

  /**
   * Get numberOf4Hits
   * @return numberOf4Hits
  */
  @ApiModelProperty(value = "")


  public Integer getNumberOf4Hits() {
    return numberOf4Hits;
  }

  public void setNumberOf4Hits(Integer numberOf4Hits) {
    this.numberOf4Hits = numberOf4Hits;
  }

  public DrawSummaryModelApi numberOf5Hits(Integer numberOf5Hits) {
    this.numberOf5Hits = numberOf5Hits;
    return this;
  }

  /**
   * Get numberOf5Hits
   * @return numberOf5Hits
  */
  @ApiModelProperty(value = "")


  public Integer getNumberOf5Hits() {
    return numberOf5Hits;
  }

  public void setNumberOf5Hits(Integer numberOf5Hits) {
    this.numberOf5Hits = numberOf5Hits;
  }

  public DrawSummaryModelApi numberOf6Hits(Integer numberOf6Hits) {
    this.numberOf6Hits = numberOf6Hits;
    return this;
  }

  /**
   * Get numberOf6Hits
   * @return numberOf6Hits
  */
  @ApiModelProperty(value = "")


  public Integer getNumberOf6Hits() {
    return numberOf6Hits;
  }

  public void setNumberOf6Hits(Integer numberOf6Hits) {
    this.numberOf6Hits = numberOf6Hits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawSummaryModelApi drawSummary = (DrawSummaryModelApi) o;
    return Objects.equals(this.id, drawSummary.id) &&
        Objects.equals(this.numbers, drawSummary.numbers) &&
        Objects.equals(this.numberOf0Hits, drawSummary.numberOf0Hits) &&
        Objects.equals(this.numberOf1Hits, drawSummary.numberOf1Hits) &&
        Objects.equals(this.numberOf2Hits, drawSummary.numberOf2Hits) &&
        Objects.equals(this.numberOf3Hits, drawSummary.numberOf3Hits) &&
        Objects.equals(this.numberOf4Hits, drawSummary.numberOf4Hits) &&
        Objects.equals(this.numberOf5Hits, drawSummary.numberOf5Hits) &&
        Objects.equals(this.numberOf6Hits, drawSummary.numberOf6Hits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numbers, numberOf0Hits, numberOf1Hits, numberOf2Hits, numberOf3Hits, numberOf4Hits, numberOf5Hits, numberOf6Hits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawSummaryModelApi {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    numberOf0Hits: ").append(toIndentedString(numberOf0Hits)).append("\n");
    sb.append("    numberOf1Hits: ").append(toIndentedString(numberOf1Hits)).append("\n");
    sb.append("    numberOf2Hits: ").append(toIndentedString(numberOf2Hits)).append("\n");
    sb.append("    numberOf3Hits: ").append(toIndentedString(numberOf3Hits)).append("\n");
    sb.append("    numberOf4Hits: ").append(toIndentedString(numberOf4Hits)).append("\n");
    sb.append("    numberOf5Hits: ").append(toIndentedString(numberOf5Hits)).append("\n");
    sb.append("    numberOf6Hits: ").append(toIndentedString(numberOf6Hits)).append("\n");
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

