import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration

@EnableAutoConfiguration
public class Server {

    @Bean(name = "/chat")
    RemoteExporter bookingService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(new ChatServiceServerImpl());
        exporter.setServiceInterface( ChatServiceServer.class );
        return exporter;
    }

    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}