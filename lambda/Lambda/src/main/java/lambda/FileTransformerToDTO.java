package lambda;

import java.io.InputStream;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class FileTransformerToDTO
{
    private static CouponDto transformToCouponDto(Set<Integer> numbers)
    {
        return new CouponDto(1L, OffsetDateTime.now(),numbers,0);
    }

    private static BetDto transformToBetDto(Set<CouponDto> coupons)
    {
        return new BetDto(1L,OffsetDateTime.now(),null,coupons,0L);
    }

    public static BetDto createBetDTO(InputStream stream)
    {
        Set<CouponDto>coupons = new LinkedHashSet<>();
        Scanner scanner = new Scanner(stream);
        while(scanner.hasNext())
        {
            if(Character.isDigit(scanner.nextLine().charAt(0)))
            {
                String currentLine = scanner.nextLine();
                HashSet<Integer> numbers = (HashSet<Integer>) Arrays.stream(currentLine.split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toSet());
                coupons.add(transformToCouponDto(numbers));
            }
        }
        return transformToBetDto(coupons);
    }

}
