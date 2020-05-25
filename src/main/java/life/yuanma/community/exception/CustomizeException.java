package life.yuanma.community.exception;

/**
 * @author yd
 * @date 2020/5/23 22:33
 */
public class CustomizeException extends RuntimeException {
    private String message;
    private Integer code;
    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }


    @Override
    public String getMessage() {
        return message; }

    public Integer getCode() {
        return code;
    }
}
