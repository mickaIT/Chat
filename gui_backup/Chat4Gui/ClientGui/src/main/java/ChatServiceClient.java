import java.util.List;

public interface ChatServiceClient {
    String writeMessage(String message, String id);
    List <String> getMessages(String id);
}