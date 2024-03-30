from constructs import Construct
from aws_cdk import (
    Stack,
    aws_lambda as _lambda,
    aws_apigateway as apigw,
)

class PythonStack(Stack):

    def __init__(self, scope: Construct, id: str, **kwargs) -> None:
        super().__init__(scope, id, **kwargs)

        # lambda
        my_lambda = _lambda.Function(
            self, 'Hellohandler',
            runtime = _lambda.Runtime.PYTHON_3_12,
            code = _lambda.Code.from_asset('lambda'),
            handler='hello.handler',
        )

        # api gateway
        apigw.LambdaRestApi(
            self, 'Endpoint',
            handler=my_lambda,
        )

