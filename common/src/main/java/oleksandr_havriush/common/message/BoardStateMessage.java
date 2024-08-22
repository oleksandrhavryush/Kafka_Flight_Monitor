package oleksandr_havriush.common.message;

import lombok.Data;
import oleksandr_havriush.common.bean.AirPort;
import oleksandr_havriush.common.bean.Board;
import oleksandr_havriush.common.bean.Source;
import oleksandr_havriush.common.bean.Type;

@Data
public class BoardStateMessage extends Message {
    private Board board;

    public BoardStateMessage() {
        this.source = Source.BOARD;
        this.type = Type.STATE;
    }

    public BoardStateMessage(Board board) {
        this();
        this.board = board;
    }
}
