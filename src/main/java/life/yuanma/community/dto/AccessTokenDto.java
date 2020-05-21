package life.yuanma.community.dto;

import lombok.Data;

/**
 * @author yd
 * @date 2020/5/13 11:01
 */
@Data
public class AccessTokenDto {
    private  String client_id;
    private  String client_secret;
    private  String code;
    private  String redirect_uri;
    private  String state;


}
