package com.example.banco.bogota.workflow.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StopFlowExecutionException extends RuntimeException {

    private static final long serialVersionUID = -3605107727888822422L;

    private final String message;

    public StopFlowExecutionException(String message) {
        super(message);
        this.message = message;
    }

}
