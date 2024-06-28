package com.rudiger.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerNotFoundExceptions extends  RuntimeException{
    private final String msg;
}
