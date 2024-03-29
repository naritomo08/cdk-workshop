package com.myorg;

import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;

public class JavaStack extends Stack {
    public JavaStack(final Construct parent, final String id) {
        this(parent, id, null);
    }

    public JavaStack(final Construct parent, final String id, final StackProps props) {
        super(parent, id, props);

    }
}
