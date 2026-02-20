public class DirectionExample {

    public enum Direction {
        NORTH("Север"),
        SOUTH("Юг"),
        EAST("Восток"),
        WEST("Запад");

        private String description;

        Direction(String description) {
            this.description = description;
        }


        public String getDescription() {
            return description;
        }


        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static Direction getOpposite(Direction dir) {
        if (dir == null) return Direction.NORTH;
        switch (dir) {
            case NORTH: return Direction.SOUTH;
            case SOUTH: return Direction.NORTH;
            case EAST:  return Direction.WEST;
            case WEST:  return Direction.EAST;
        }
        return Direction.NORTH;
    }
}




