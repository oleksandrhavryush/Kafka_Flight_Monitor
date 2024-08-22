package oleksandr_havriush.common.message;

import lombok.Data;
import oleksandr_havriush.common.bean.AirPort;
import oleksandr_havriush.common.bean.Source;
import oleksandr_havriush.common.bean.Type;

@Data
public class AirPortStateMessage extends Message {
    private AirPort airPort;

    public AirPortStateMessage() {
        this.source = Source.AIRPORT;
        this.type = Type.STATE;
    }

    public AirPortStateMessage(AirPort airPort) {
        this();
        this.airPort = airPort;
    }
}
