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

class ParkingSpot {
    private String spotId;
    private boolean isOccupied;

    public ParkingSpot(String spotId) {
        this.spotId = spotId;
        this.isOccupied = false;
    }

    public String getSpotId() { return spotId; }
    public boolean isOccupied() { return isOccupied; }
    public void setOccupied(boolean occupied) { this.isOccupied = occupied; }
}
