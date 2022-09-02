package com.miro.trivy.test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Object, Object> {

    @Override
    public Object handleRequest(Object input, Context context) {
        System.out.println("Handler.handleRequest");
        return null;
    }
}
