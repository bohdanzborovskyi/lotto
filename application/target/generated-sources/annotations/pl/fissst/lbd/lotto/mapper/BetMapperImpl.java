package pl.fissst.lbd.lotto.mapper;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.fissst.lbd.lotto.dto.BetDto;
import pl.fissst.lbd.lotto.dto.CouponDto;
import pl.fissst.lbd.lotto.dto.DrawDto;
import pl.fissst.lbd.lotto.model.Bet;
import pl.fissst.lbd.lotto.model.Bet.BetBuilder;
import pl.fissst.lbd.lotto.model.BetModelApi;
import pl.fissst.lbd.lotto.model.Coupon;
import pl.fissst.lbd.lotto.model.Coupon.CouponBuilder;
import pl.fissst.lbd.lotto.model.CouponModelApi;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-02T12:00:14+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Amazon.com Inc.)"
)
@Component
public class BetMapperImpl implements BetMapper {

    @Autowired
    private CouponMapper couponMapper;
    @Autowired
    private DrawMapper drawMapper;

    @Override
    public BetDto mapModelApiToDto(BetModelApi betModelApi) {
        if ( betModelApi == null ) {
            return null;
        }

        BetDto betDto = new BetDto();

        betDto.setId( betModelApi.getId() );
        betDto.setCreationDate( betModelApi.getCreationDate() );
        betDto.setCoupons( couponModelApiListToCouponDtoSet( betModelApi.getCoupons() ) );
        betDto.setPayment( betModelApi.getPayment() );

        return betDto;
    }

    @Override
    public BetModelApi mapDtoToModelApi(BetDto betDto) {
        if ( betDto == null ) {
            return null;
        }

        BetModelApi betModelApi = new BetModelApi();

        betModelApi.setDayOfDraw( betDtoDrawCreationDate( betDto ) );
        betModelApi.setId( betDto.getId() );
        betModelApi.setCreationDate( betDto.getCreationDate() );
        betModelApi.setCoupons( couponDtoSetToCouponModelApiList( betDto.getCoupons() ) );
        betModelApi.setPayment( betDto.getPayment() );

        return betModelApi;
    }

    @Override
    public BetDto mapEntityToDto(Bet bet) {
        if ( bet == null ) {
            return null;
        }

        BetDto betDto = new BetDto();

        betDto.setId( bet.getId() );
        betDto.setCreationDate( bet.getCreationDate() );
        betDto.setDraw( drawMapper.mapEntityToDto( bet.getDraw() ) );
        betDto.setCoupons( couponSetToCouponDtoSet( bet.getCoupons() ) );

        return betDto;
    }

    @Override
    public Bet mapDtoToEntity(BetDto betDto) {
        if ( betDto == null ) {
            return null;
        }

        BetBuilder bet = Bet.builder();

        bet.id( betDto.getId() );
        bet.creationDate( betDto.getCreationDate() );
        bet.draw( drawMapper.mapDtoToEntity( betDto.getDraw() ) );
        bet.coupons( couponDtoSetToCouponSet( betDto.getCoupons() ) );

        return bet.build();
    }

    protected Set<CouponDto> couponModelApiListToCouponDtoSet(List<CouponModelApi> list) {
        if ( list == null ) {
            return null;
        }

        Set<CouponDto> set = new HashSet<CouponDto>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( CouponModelApi couponModelApi : list ) {
            set.add( couponMapper.mapModelApiToDto( couponModelApi ) );
        }

        return set;
    }

    private OffsetDateTime betDtoDrawCreationDate(BetDto betDto) {
        if ( betDto == null ) {
            return null;
        }
        DrawDto draw = betDto.getDraw();
        if ( draw == null ) {
            return null;
        }
        OffsetDateTime creationDate = draw.getCreationDate();
        if ( creationDate == null ) {
            return null;
        }
        return creationDate;
    }

    protected List<CouponModelApi> couponDtoSetToCouponModelApiList(Set<CouponDto> set) {
        if ( set == null ) {
            return null;
        }

        List<CouponModelApi> list = new ArrayList<CouponModelApi>( set.size() );
        for ( CouponDto couponDto : set ) {
            list.add( couponMapper.mapDtoToModelApi( couponDto ) );
        }

        return list;
    }

    protected Set<Integer> integerArrayToIntegerSet(Integer[] integerArray) {
        if ( integerArray == null ) {
            return null;
        }

        Set<Integer> set = new HashSet<Integer>( Math.max( (int) ( integerArray.length / .75f ) + 1, 16 ) );
        for ( Integer integer : integerArray ) {
            set.add( integer );
        }

        return set;
    }

    protected CouponDto couponToCouponDto(Coupon coupon) {
        if ( coupon == null ) {
            return null;
        }

        CouponDto couponDto = new CouponDto();

        couponDto.setId( coupon.getId() );
        couponDto.setCreationDate( coupon.getCreationDate() );
        couponDto.setNumbers( integerArrayToIntegerSet( coupon.getNumbers() ) );

        return couponDto;
    }

    protected Set<CouponDto> couponSetToCouponDtoSet(Set<Coupon> set) {
        if ( set == null ) {
            return null;
        }

        Set<CouponDto> set1 = new HashSet<CouponDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Coupon coupon : set ) {
            set1.add( couponToCouponDto( coupon ) );
        }

        return set1;
    }

    protected Integer[] integerSetToIntegerArray(Set<Integer> set) {
        if ( set == null ) {
            return null;
        }

        Integer[] integerTmp = new Integer[set.size()];
        int i = 0;
        for ( Integer integer : set ) {
            integerTmp[i] = integer;
            i++;
        }

        return integerTmp;
    }

    protected Coupon couponDtoToCoupon(CouponDto couponDto) {
        if ( couponDto == null ) {
            return null;
        }

        CouponBuilder coupon = Coupon.builder();

        coupon.id( couponDto.getId() );
        coupon.creationDate( couponDto.getCreationDate() );
        coupon.numbers( integerSetToIntegerArray( couponDto.getNumbers() ) );

        return coupon.build();
    }

    protected Set<Coupon> couponDtoSetToCouponSet(Set<CouponDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Coupon> set1 = new HashSet<Coupon>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( CouponDto couponDto : set ) {
            set1.add( couponDtoToCoupon( couponDto ) );
        }

        return set1;
    }
}
