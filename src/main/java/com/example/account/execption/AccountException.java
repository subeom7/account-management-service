package com.example.account.execption;

import com.example.account.type.ErrorCode;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountException extends RuntimeException{
    private ErrorCode errorcode;
    private String errorMessage;

    public AccountException(ErrorCode errorcode){
        this.errorcode = errorcode;
        this.errorMessage = errorcode.getDescription();
    }

}
