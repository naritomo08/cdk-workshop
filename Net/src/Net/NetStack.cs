using Amazon.CDK;
using Amazon.CDK.AWS.SNS;
using Amazon.CDK.AWS.SNS.Subscriptions;
using Amazon.CDK.AWS.SQS;
using Constructs;

namespace Net
{
    public class NetStack : Stack
    {
        internal NetStack(Construct scope, string id, IStackProps props = null) : base(scope, id, props)
        {
             // The CDK includes built-in constructs for most resource types, such as Queues and Topics.
            var queue = new Queue(this, "NetQueue", new QueueProps
            {
                VisibilityTimeout = Duration.Seconds(300)
            });

            var topic = new Topic(this, "NetTopic");

            topic.AddSubscription(new SqsSubscription(queue));
        }
    }
}
