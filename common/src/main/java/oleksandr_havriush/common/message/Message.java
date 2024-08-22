package oleksandr_havriush.common.message;

import lombok.NoArgsConstructor;
import oleksandr_havriush.common.bean.Source;
import oleksandr_havriush.common.bean.Type;

@NoArgsConstructor
public class Message {
    protected Type type;
    protected Source source;

    public String getCode(){
        return source.name() + "_" + type.name();
    }
}
