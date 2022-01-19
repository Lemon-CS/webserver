package connector;

/**
 * @author 方鹏
 * @date 2022年01月19日 10:22 下午
 */
public enum HttpStatus {
    SC_OK(200, "OK"),
    SC_NOT_FOUND(404, "File Not Found");

    private int statusCode;
    private String reason;

    HttpStatus(int code, String reason) {
        this.statusCode = code;
        this.reason = reason;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getReason() {
        return reason;
    }
}
