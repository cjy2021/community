package life.yuanma.community.model;

import lombok.Data;

/**
 * @author yd
 * @date 2020/5/15 22:14
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}