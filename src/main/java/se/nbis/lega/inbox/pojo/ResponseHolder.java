package se.nbis.lega.inbox.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * Technical POJO for parsing JSON response from CEGA.
 */
@ToString
@Data
public class ResponseHolder {

    @JsonProperty("response")
    private ResultsHolder resultsHolder;

}
