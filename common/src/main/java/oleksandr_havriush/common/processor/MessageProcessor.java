package oleksandr_havriush.common.processor;

import oleksandr_havriush.common.message.Message;

public interface MessageProcessor<T extends Message> {

    void process(String jsonMessage);

}
