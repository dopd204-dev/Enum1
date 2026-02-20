import java.util.Scanner;

enum WeekDay {
    MONDAY("Дүйшөмбү"),
    TUESDAY("Шейшемби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшемби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");

    private String kyrgyzName;

    WeekDay(String kyrgyzName) {
        this.kyrgyzName = kyrgyzName;
    }

    public String getKyrgyzName() {
        return kyrgyzName;
    }

    public void setKyrgyzName(String kyrgyzName) {
        this.kyrgyzName = kyrgyzName;
    }
}

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Күндү жазыңыз (MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY,SATURDAY,SUNDAY): ");
        String input = scanner.nextLine().toUpperCase();

        WeekDay day = WeekDay.valueOf(input);

        System.out.println("Сиз тандаган күн: " + day.getKyrgyzName());

        switch (day) {
            case MONDAY:
                System.out.println("Дүйшөмбү күнү жава окуйм");
                break;
            case TUESDAY:
                System.out.println("Шейшемби күнү англис тили сабагын окуйм");
                break;
            case WEDNESDAY:
                System.out.println("Шаршемби күнү математика окуйм");
                break;
            case THURSDAY:
                System.out.println("Бейшемби күнү тарых окуйм");
                break;
            case FRIDAY:
                System.out.println("Жума күнү спорт менен машыгам");
                break;
            case SATURDAY:
                System.out.println("Ишемби күнү эс алам");
                break;
            case SUNDAY:
                System.out.println("Жекшемби күнү үй тапшырмасын жасайм");
                break;

        }

        scanner.close();
    }
}
