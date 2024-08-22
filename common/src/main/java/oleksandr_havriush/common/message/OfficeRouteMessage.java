package oleksandr_havriush.common.message;

import lombok.Data;
import oleksandr_havriush.common.bean.Board;
import oleksandr_havriush.common.bean.Route;
import oleksandr_havriush.common.bean.Source;
import oleksandr_havriush.common.bean.Type;

@Data
public class OfficeRouteMessage extends Message {
    private Route route;

    public OfficeRouteMessage() {
        this.source = Source.OFFICE;
        this.type = Type.ROUTE;
    }

    public OfficeRouteMessage(Route route) {
        this();
        this.route = route;
    }
}
