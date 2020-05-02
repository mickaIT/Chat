import java.util.*;

public class ChatServiceServerImpl implements ChatServiceServer {

    List<String> messageListToSend = new ArrayList<>();
    HashMap<String, List<String>> users = new HashMap<>();

    @Override
    public String writeMessage(String message, String id) {

        if (!users.containsKey(id)) {
            users = MessageStorage.addNewUser(id, users);
        }
        users.entrySet().stream().forEach(item->item.getValue().add(id + ": " + message));
        System.out.println("--SERVER--");
        System.out.println(id + " wrote: ");
        System.out.println(message);
        return "Hello from server: " + message;
    }

    @Override
    public List<String> getMessages(String id) {
        messageListToSend = users.get(id);
        return messageListToSend;
    }

}

