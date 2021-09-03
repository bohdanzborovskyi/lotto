package lambda;

import java.time.OffsetDateTime;
import java.util.Set;

public class BetDto
{
    private Long id;
    private OffsetDateTime creationDate;
    private DrawDto draw;
    private Set<CouponDto> coupons;
    private Long payment;

    public BetDto(Long id, OffsetDateTime creationDate, DrawDto draw, Set<CouponDto> coupons, Long payment) {
        this.id = id;
        this.creationDate = creationDate;
        this.draw = draw;
        this.coupons = coupons;
        this.payment = payment;
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

    public DrawDto getDraw() {
        return draw;
    }

    public void setDraw(DrawDto draw) {
        this.draw = draw;
    }

    public Set<CouponDto> getCoupons() {
        return coupons;
    }

    public void setCoupons(Set<CouponDto> coupons) {
        this.coupons = coupons;
    }

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

}
