package oleksandr_havriush.common.message;

import lombok.Data;
import oleksandr_havriush.common.bean.Source;
import oleksandr_havriush.common.bean.Type;

@Data
public class OfficeStateMessage extends Message {

    public OfficeStateMessage() {
        this.source = Source.OFFICE;
        this.type = Type.STATE;
    }
}
