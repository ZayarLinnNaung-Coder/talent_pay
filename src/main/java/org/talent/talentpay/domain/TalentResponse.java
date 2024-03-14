package org.talent.talentpay.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
public class TalentResponse<R> {

    private String message;
    private HttpStatus httpStatus;
    private int httpStatusCode;
    private LocalDateTime date;
    private R data;

    public TalentResponse(R data, String message, HttpStatus status){
        this.data = data;
        this.message = message;
        this.httpStatus = status;
        this.httpStatusCode = status.value();
        this.date = LocalDateTime.now();
    }

}
