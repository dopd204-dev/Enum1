enum HttpStatus {

    OK(200, "Успешно"),
    NOT_FOUND(404, "Не найдено"),
    BAD_REQUEST(400, "Неверный запрос"),
    INTERNAL_SERVER_ERROR(500, "Внутренняя ошибка сервера");

    private int code;
    private String description;

    HttpStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }


    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfo() {
        return code + " - " + description;
    }

    public static HttpStatus findByCode(int code) {
        for (HttpStatus status : HttpStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

    }
class Main {
    public static void main(String[] args) {

        int searchCode = 200;

        HttpStatus status = HttpStatus.findByCode(searchCode);

        if (status != null) {
            System.out.println(status.getInfo());
        } else {
            System.out.println("Статус с таким кодом не найден.");
        }
    }
}