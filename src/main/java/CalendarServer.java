import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.example.CalendarThriftConfiguration.MeetingSvc;

public class CalendarServer {

    TServer server ;

    public void start() throws TTransportException
    {
        TServerTransport serverTransport = new TServerSocket(9090);

        server = new TSimpleServer(new TServer.Args(serverTransport).
                processor(new MeetingSvc.Processor<>(new MeetingHandler())));

        System.out.println("Starting the server.....");

        server.serve();

        System.out.println("done. ");
    }

    public void stop()
    {
        if(server != null && server.isServing())
        {
            System.out.println("Stopping the Server....");

            server.stop();

            System.out.println("done...");
        }
    }

}
