package oleksandr_havriush.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoutePath {
    private RoutePoint from;
    private RoutePoint to;
    private double progress;

    private void addProgress(double speed) {
        this.progress += speed;
        if (this.progress > 100) {
            this.progress = 100;
        }
    }

    private boolean done(){
        return this.progress == 100;
    }

    private boolean inProgress(){
        return this.progress < 100;
    }
}
