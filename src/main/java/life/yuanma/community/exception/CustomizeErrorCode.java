package life.yuanma.community.exception;

/**
 * @author yd
 * @date 2020/5/23 23:04
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND("你找到的问题不在了，可以换个试试！");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
