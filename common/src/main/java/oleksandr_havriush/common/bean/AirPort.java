package oleksandr_havriush.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirPort {
    private String name;
    private List<String> boards = new ArrayList<>();
    private int x;
    private int y;

    private void addBoard(String boardName) {
        int index = boards.indexOf(boardName);
        if (index >= 0) {
            boards.set(index, boardName);
        } else {
            boards.add(boardName);
        }
    }

    private void removeBoard(String boardName) {
        boards.remove(boardName);
    }
}
