package Server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.BankGrpcService;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)
                .addService(new BankGrpcService())
                .build();

        server.start();
        server.awaitTermination(); // the server keep working until you shutdown it
    }
}
