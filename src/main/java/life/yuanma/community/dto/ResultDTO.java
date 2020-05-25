package life.yuanma.community.dto;

import life.yuanma.community.exception.CustomizeErrorCode;
import lombok.Data;

/**
 * @author yd
 * @date 2020/5/24 21:46
 */
@Data
public class ResultDTO {
    private Integer code;
    private String message;

    public static ResultDTO errorOf(Integer code,String message){
        ResultDTO resultDTO =new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(),errorCode.getMessage());
    }
}
