import java.util.List;

public interface ChatServiceServer {
    String writeMessage(String message, String id);
    List <String> getMessages(String id);
}