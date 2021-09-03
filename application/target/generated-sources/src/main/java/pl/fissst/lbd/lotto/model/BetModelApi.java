package pl.fissst.lbd.lotto.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import pl.fissst.lbd.lotto.model.CouponModelApi;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BetModelApi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-02T12:00:11.529248300+02:00[Europe/Belgrade]")
public class BetModelApi   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("creationDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;

  @JsonProperty("dayOfDraw")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dayOfDraw;

  @JsonProperty("coupons")
  @Valid
  private List<CouponModelApi> coupons = null;

  @JsonProperty("payment")
  private Long payment;

  public BetModelApi id(Long id) {
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

  public BetModelApi creationDate(OffsetDateTime creationDate) {
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

  public BetModelApi dayOfDraw(OffsetDateTime dayOfDraw) {
    this.dayOfDraw = dayOfDraw;
    return this;
  }

  /**
   * Get dayOfDraw
   * @return dayOfDraw
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDayOfDraw() {
    return dayOfDraw;
  }

  public void setDayOfDraw(OffsetDateTime dayOfDraw) {
    this.dayOfDraw = dayOfDraw;
  }

  public BetModelApi coupons(List<CouponModelApi> coupons) {
    this.coupons = coupons;
    return this;
  }

  public BetModelApi addCouponsItem(CouponModelApi couponsItem) {
    if (this.coupons == null) {
      this.coupons = new ArrayList<>();
    }
    this.coupons.add(couponsItem);
    return this;
  }

  /**
   * Get coupons
   * @return coupons
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CouponModelApi> getCoupons() {
    return coupons;
  }

  public void setCoupons(List<CouponModelApi> coupons) {
    this.coupons = coupons;
  }

  public BetModelApi payment(Long payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @ApiModelProperty(value = "")


  public Long getPayment() {
    return payment;
  }

  public void setPayment(Long payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetModelApi bet = (BetModelApi) o;
    return Objects.equals(this.id, bet.id) &&
        Objects.equals(this.creationDate, bet.creationDate) &&
        Objects.equals(this.dayOfDraw, bet.dayOfDraw) &&
        Objects.equals(this.coupons, bet.coupons) &&
        Objects.equals(this.payment, bet.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, dayOfDraw, coupons, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetModelApi {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    dayOfDraw: ").append(toIndentedString(dayOfDraw)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

