/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package pl.fissst.lbd.lotto.api;

import pl.fissst.lbd.lotto.model.BetListModelApi;
import pl.fissst.lbd.lotto.model.BetModelApi;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-09-02T12:00:11.529248300+02:00[Europe/Belgrade]")
@Validated
@Api(value = "bet", description = "the bet API")
public interface BetApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /bet : Add new bet
     *
     * @param betModelApi  (optional)
     * @return  (status code 200)
     */
    @ApiOperation(value = "Add new bet", nickname = "addBet", notes = "", response = BetModelApi.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = BetModelApi.class) })
    @PostMapping(
        value = "/bet",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<BetModelApi> addBet(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) BetModelApi betModelApi) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"coupons\" : [ { \"numbers\" : [ 12, 12, 12, 12, 12 ], \"id\" : 5, \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"numberOfHits\" : 7 }, { \"numbers\" : [ 12, 12, 12, 12, 12 ], \"id\" : 5, \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"numberOfHits\" : 7 } ], \"payment\" : 9, \"id\" : 5, \"dayOfDraw\" : \"2000-01-23T04:56:07.000+00:00\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /bet : get bets
     *
     * @param sort  (optional, default to id)
     * @param order  (optional, default to desc)
     * @param limit  (optional, default to 50)
     * @param page  (optional, default to 0)
     * @return  (status code 200)
     */
    @ApiOperation(value = "get bets", nickname = "getBets", notes = "", response = BetListModelApi.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = BetListModelApi.class) })
    @GetMapping(
        value = "/bet",
        produces = { "application/json" }
    )
    default ResponseEntity<BetListModelApi> getBets(@ApiParam(value = "", defaultValue = "id") @Valid @RequestParam(value = "sort", required = false, defaultValue="id") String sort,@ApiParam(value = "", defaultValue = "desc") @Valid @RequestParam(value = "order", required = false, defaultValue="desc") String order,@ApiParam(value = "", defaultValue = "50") @Valid @RequestParam(value = "limit", required = false, defaultValue="50") Long limit,@ApiParam(value = "", defaultValue = "0") @Valid @RequestParam(value = "page", required = false, defaultValue="0") Integer page) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"startElement\" : 0, \"count\" : 1, \"totalCount\" : 6, \"results\" : [ { \"coupons\" : [ { \"numbers\" : [ 12, 12, 12, 12, 12 ], \"id\" : 5, \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"numberOfHits\" : 7 }, { \"numbers\" : [ 12, 12, 12, 12, 12 ], \"id\" : 5, \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"numberOfHits\" : 7 } ], \"payment\" : 9, \"id\" : 5, \"dayOfDraw\" : \"2000-01-23T04:56:07.000+00:00\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\" }, { \"coupons\" : [ { \"numbers\" : [ 12, 12, 12, 12, 12 ], \"id\" : 5, \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"numberOfHits\" : 7 }, { \"numbers\" : [ 12, 12, 12, 12, 12 ], \"id\" : 5, \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"numberOfHits\" : 7 } ], \"payment\" : 9, \"id\" : 5, \"dayOfDraw\" : \"2000-01-23T04:56:07.000+00:00\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
