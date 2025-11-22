class ManualUpdater extends ParkingStatusUpdater {
    @Override
    public void updateStatus(ParkingSpot spot) {
        spot.setOccupied(false);
        System.out.println("Spot " + spot.getSpotId() + " manually released.");
    }
}