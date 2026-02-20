//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (Region region : Region.values()) {
            switch (region) {
                case BISHKEK ->
                        System.out.println(region.getName() + ": " + region.getFeature() + ", Население: " + region.getPopulation());
                case BATKEN ->
                        System.out.println(region.getName() + ": " + region.getFeature() + ", Население: " + region.getPopulation());
                case TALAS ->
                        System.out.println(region.getName() + ": " + region.getFeature() + ", Население: " + region.getPopulation());
                case NARYN ->
                        System.out.println(region.getName() + ": " + region.getFeature() + ", Население: " + region.getPopulation());
                case ISSYK_KUL ->
                        System.out.println(region.getName() + ": " + region.getFeature() + ", Население: " + region.getPopulation());
                case MANAS ->
                        System.out.println(region.getName() + ": " + region.getFeature() + ", Население: " + region.getPopulation());
                case OSH ->
                        System.out.println(region.getName() + ": " + region.getFeature() + ", Население: " + region.getPopulation());
            }
        }
    }

    }

