package pl.fissst.lbd.lotto.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import pl.fissst.lbd.lotto.model.BetModelApi;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BetListModelApi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-02T12:00:11.529248300+02:00[Europe/Belgrade]")
public class BetListModelApi   {
  @JsonProperty("startElement")
  private Long startElement;

  @JsonProperty("totalCount")
  private Long totalCount;

  @JsonProperty("count")
  private Long count;

  @JsonProperty("results")
  @Valid
  private List<BetModelApi> results = null;

  public BetListModelApi startElement(Long startElement) {
    this.startElement = startElement;
    return this;
  }

  /**
   * Get startElement
   * @return startElement
  */
  @ApiModelProperty(value = "")


  public Long getStartElement() {
    return startElement;
  }

  public void setStartElement(Long startElement) {
    this.startElement = startElement;
  }

  public BetListModelApi totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
  */
  @ApiModelProperty(value = "")


  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public BetListModelApi count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  @ApiModelProperty(value = "")


  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public BetListModelApi results(List<BetModelApi> results) {
    this.results = results;
    return this;
  }

  public BetListModelApi addResultsItem(BetModelApi resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<BetModelApi> getResults() {
    return results;
  }

  public void setResults(List<BetModelApi> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetListModelApi betList = (BetListModelApi) o;
    return Objects.equals(this.startElement, betList.startElement) &&
        Objects.equals(this.totalCount, betList.totalCount) &&
        Objects.equals(this.count, betList.count) &&
        Objects.equals(this.results, betList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startElement, totalCount, count, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetListModelApi {\n");
    
    sb.append("    startElement: ").append(toIndentedString(startElement)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

