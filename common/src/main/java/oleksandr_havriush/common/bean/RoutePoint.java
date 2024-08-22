package oleksandr_havriush.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoutePoint {
    private String name;
    private double y;
    private double x;
}
