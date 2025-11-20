import java.util.ArrayList;
import java.util.Scanner;

abstract class ParkingStatusUpdater {
    public abstract void updateStatus(ParkingSpot spot);
}

class SensorUpdater extends ParkingStatusUpdater {
    public void updateStatus(ParkingSpot spot) {
        spot.setOccupied(true);
        System.out.println("Sensor detected a vehicle in spot " + spot.getSpotId());
    }
}

class ManualUpdater extends ParkingStatusUpdater {
    public void updateStatus(ParkingSpot spot) {
        spot.setOccupied(false);
        System.out.println("Spot " + spot.getSpotId() + " manually released.");
    }
}
