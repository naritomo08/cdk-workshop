package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;

import software.amazon.awscdk.services.apigateway.LambdaRestApi;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;

public class JavaStack extends Stack {
    public JavaStack(final Construct parent, final String id) {
        this(parent, id, null);
    }

    public JavaStack(final Construct parent, final String id, final StackProps props) {
        super(parent, id, props);

        // Lambda
        final Function hello = Function.Builder.create(this, "HelloHandler")
            .runtime(Runtime.NODEJS_20_X)
            .code(Code.fromAsset("lambda"))
            .handler("hello.handler")
            .build();
        
        // API Gateway
        LambdaRestApi.Builder.create(this, "Endpoint")
            .handler(hello)
            .build();
    }
}
