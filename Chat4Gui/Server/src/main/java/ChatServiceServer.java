import java.util.List;

public interface ChatServiceServer {
    String writeMessage(String message, String id);
    List <String> getMessages(String id);
    boolean isChanged();
    void setChanged(boolean changed);
    String getLastMessage();
    void setLastMessage(String lastMessage);
}