package pl.fissst.lbd.lotto.mapper;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.fissst.lbd.lotto.dto.DrawDto;
import pl.fissst.lbd.lotto.model.Draw;
import pl.fissst.lbd.lotto.model.Draw.DrawBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-02T12:00:14+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Amazon.com Inc.)"
)
@Component
public class DrawMapperImpl implements DrawMapper {

    @Override
    public DrawDto mapEntityToDto(Draw draw) {
        if ( draw == null ) {
            return null;
        }

        DrawDto drawDto = new DrawDto();

        drawDto.setId( draw.getId() );
        drawDto.setCreationDate( draw.getCreationDate() );
        drawDto.setNumbers( integerArrayToIntegerSet( draw.getNumbers() ) );

        return drawDto;
    }

    @Override
    public Draw mapDtoToEntity(DrawDto drawDto) {
        if ( drawDto == null ) {
            return null;
        }

        DrawBuilder draw = Draw.builder();

        draw.id( drawDto.getId() );
        draw.creationDate( drawDto.getCreationDate() );
        draw.numbers( integerSetToIntegerArray( drawDto.getNumbers() ) );

        return draw.build();
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
}
