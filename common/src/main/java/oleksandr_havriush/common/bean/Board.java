package oleksandr_havriush.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private String name;
    private String location;
    private Route route;
    private boolean busy;
    private double speed;
    private double x;
    private double y;
    private double angle;

    private boolean noBusy() {
        return !busy;
    }

    private void calculatePosition(RoutePath routeDirection) {
        double t = routeDirection.getProgress() / 100;

        double toX = (1 - t) * routeDirection.getFrom().getX() + t * routeDirection.getTo().getX();
        double toY = (1 - t) * routeDirection.getFrom().getY() + t * routeDirection.getTo().getY();

        double deltaX = this.x - toX;
        double deltaY = this.y - toY;

        this.angle = Math.toDegrees(Math.atan2(deltaY, deltaX));

        if (this.angle < 0) {
            this.angle += 360;
        }

        this.x = toX;
        this.y = toY;
    }
}
