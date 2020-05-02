
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import java.util.List;
import java.util.Scanner;

@Configuration
public class ClientHessian {

    @Bean
    HessianProxyFactoryBean hessianInvoker() {
        HessianProxyFactoryBean invoker = new HessianProxyFactoryBean();
        invoker.setServiceUrl("http://localhost:8080/chat");
        invoker.setServiceInterface(ChatServiceClient.class);
        return invoker;
    }

    public static ChatServiceClient Client() {
        ChatServiceClient service
                = SpringApplication.run(ClientHessian.class)
                .getBean(ChatServiceClient.class);
        return service;
//        Scanner scanner = new Scanner(System.in);
//        List<String> receivedMessages;
//        System.out.println("Enter your ID");
//        String id = scanner.nextLine();
//
//
//        while (true){
//            System.out.println("Type a message and hit enter");
//            String input = scanner.nextLine();
//            System.out.println(service.writeMessage(input, id));
//            receivedMessages  = service.getMessages(id);
//            for (String message  : receivedMessages) {
//                System.out.println(message + '\n');
//            }
//        }

    }
}
