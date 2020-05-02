import java.util.List;

public class ChatServiceClientImpl implements ChatServiceClient {

    @Override
    public String writeMessage(String message, String id) {
        message = System.console().readLine();
        System.out.println("-CLIENT-");
        System.out.println("Message sent");
        System.out.println(message);
        return "Hello from client" + message;
    }

    @Override
    public List<String> getMessages(String id) {
        return null;
    }

    @Override
    public boolean isChanged() {
        return isChanged();
    }

    @Override
    public void setChanged(boolean changed) {
        setChanged(changed);
    }

    @Override
    public String getLastMessage() {
        return getLastMessage();
    }

    @Override
    public void setLastMessage(String lastMessage) {
        setLastMessage(lastMessage);
    }

    @Override
    public void foo(){;}
}
