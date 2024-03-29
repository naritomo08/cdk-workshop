using Amazon.CDK;

namespace Net
{
    sealed class Program
    {
        public static void Main(string[] args)
        {
            var app = new App();
            new NetStack(app, "NetStack");

            app.Synth();
        }
    }
}
