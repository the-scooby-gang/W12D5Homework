public enum Plane {
    YERMAWSTINX(15, 150),
    YERMAW(20, 200),
    YERPASADK(25, 250),
    YERPA(30, 300);

    private final int capacity;
    private final int totalWeight;

    Plane(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
