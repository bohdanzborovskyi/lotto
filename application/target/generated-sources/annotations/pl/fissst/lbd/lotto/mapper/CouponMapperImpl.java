package pl.fissst.lbd.lotto.mapper;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.fissst.lbd.lotto.dto.CouponDto;
import pl.fissst.lbd.lotto.model.CouponModelApi;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-02T12:00:14+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Amazon.com Inc.)"
)
@Component
public class CouponMapperImpl implements CouponMapper {

    @Override
    public CouponDto mapModelApiToDto(CouponModelApi couponModelApi) {
        if ( couponModelApi == null ) {
            return null;
        }

        CouponDto couponDto = new CouponDto();

        couponDto.setId( couponModelApi.getId() );
        couponDto.setCreationDate( couponModelApi.getCreationDate() );
        Set<Integer> set = couponModelApi.getNumbers();
        if ( set != null ) {
            couponDto.setNumbers( new HashSet<Integer>( set ) );
        }
        couponDto.setNumberOfHits( couponModelApi.getNumberOfHits() );

        return couponDto;
    }

    @Override
    public CouponModelApi mapDtoToModelApi(CouponDto couponDto) {
        if ( couponDto == null ) {
            return null;
        }

        CouponModelApi couponModelApi = new CouponModelApi();

        couponModelApi.setId( couponDto.getId() );
        couponModelApi.setCreationDate( couponDto.getCreationDate() );
        Set<Integer> set = couponDto.getNumbers();
        if ( set != null ) {
            couponModelApi.setNumbers( new HashSet<Integer>( set ) );
        }
        couponModelApi.setNumberOfHits( couponDto.getNumberOfHits() );

        return couponModelApi;
    }
}
