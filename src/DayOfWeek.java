enum DayOfWeek {

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean isWeekend;

    DayOfWeek(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}
 class Main {
    public static void main(String[] args) {

        System.out.println("Жумуш күндөрү:");
        for (DayOfWeek day : DayOfWeek.values()) {
            if (!day.isWeekend()) {
                System.out.println(day);
            }
        }

        System.out.println("\nДем алыш күндөрү:");
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.isWeekend()) {
                System.out.println(day);
            }
        }
    }
}