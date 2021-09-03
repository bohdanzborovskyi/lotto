package pl.fissst.lbd.lotto.mapper;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.fissst.lbd.lotto.dto.DrawDto;
import pl.fissst.lbd.lotto.dto.DrawSummaryDto;
import pl.fissst.lbd.lotto.model.DrawSummaryModelApi;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-02T12:00:14+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Amazon.com Inc.)"
)
@Component
public class DrawSummaryMapperImpl implements DrawSummaryMapper {

    @Override
    public DrawSummaryModelApi mapDtoToModelApi(DrawSummaryDto drawSummaryDto) {
        if ( drawSummaryDto == null ) {
            return null;
        }

        DrawSummaryModelApi drawSummaryModelApi = new DrawSummaryModelApi();

        drawSummaryModelApi.setId( drawSummaryDtoDrawId( drawSummaryDto ) );
        Set<Integer> numbers = drawSummaryDtoDrawNumbers( drawSummaryDto );
        Set<Integer> set = numbers;
        if ( set != null ) {
            drawSummaryModelApi.setNumbers( new HashSet<Integer>( set ) );
        }
        drawSummaryModelApi.setNumberOf0Hits( drawSummaryDto.getNumberOf0Hits() );
        drawSummaryModelApi.setNumberOf1Hits( drawSummaryDto.getNumberOf1Hits() );
        drawSummaryModelApi.setNumberOf2Hits( drawSummaryDto.getNumberOf2Hits() );
        drawSummaryModelApi.setNumberOf3Hits( drawSummaryDto.getNumberOf3Hits() );
        drawSummaryModelApi.setNumberOf4Hits( drawSummaryDto.getNumberOf4Hits() );
        drawSummaryModelApi.setNumberOf5Hits( drawSummaryDto.getNumberOf5Hits() );
        drawSummaryModelApi.setNumberOf6Hits( drawSummaryDto.getNumberOf6Hits() );

        return drawSummaryModelApi;
    }

    private Long drawSummaryDtoDrawId(DrawSummaryDto drawSummaryDto) {
        if ( drawSummaryDto == null ) {
            return null;
        }
        DrawDto draw = drawSummaryDto.getDraw();
        if ( draw == null ) {
            return null;
        }
        Long id = draw.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Set<Integer> drawSummaryDtoDrawNumbers(DrawSummaryDto drawSummaryDto) {
        if ( drawSummaryDto == null ) {
            return null;
        }
        DrawDto draw = drawSummaryDto.getDraw();
        if ( draw == null ) {
            return null;
        }
        Set<Integer> numbers = draw.getNumbers();
        if ( numbers == null ) {
            return null;
        }
        return numbers;
    }
}
