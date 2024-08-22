package oleksandr_havriush.common.processor;

import com.google.gson.Gson;
import oleksandr_havriush.common.message.Message;

public class MessageConverter {

    private final Gson gson = new Gson();

    public String extractCode(String data){
        return gson.fromJson(data, Message.class).getCode();
    }

    public <T extends Message> T extractMessage(String data, Class<T> clazz){
        return gson.fromJson(data, clazz);
    }

    public String toJson(Object message){
        return gson.toJson(message);
    }
}
