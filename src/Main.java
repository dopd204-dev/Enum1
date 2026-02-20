//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (DirectionExample.Direction dir : DirectionExample.Direction.values()) {
            DirectionExample.Direction opposite = DirectionExample.getOpposite(dir);
            System.out.println(dir.getDescription() + " ↔ " + opposite.getDescription());
        }
        DirectionExample.Direction.NORTH.setDescription("Түндүк багыт");
        System.out.println("NORTH жаңыртылган сүрөттөлүшү: " + DirectionExample.Direction.NORTH.getDescription());

    }
}