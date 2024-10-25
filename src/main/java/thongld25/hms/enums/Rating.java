package thongld25.hms.enums;


public enum Rating {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int value;

    Rating(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int getValueFor(Rating rating) {
        return rating.getValue();
    }
}