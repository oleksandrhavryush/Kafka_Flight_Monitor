package oleksandr_havriush.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Route {
    private String boardName;
    private List<RoutePath> path = new ArrayList<>();

    public boolean notAssigned(){
        return boardName == null;
    }
}
