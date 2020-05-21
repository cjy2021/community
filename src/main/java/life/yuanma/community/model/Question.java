package life.yuanma.community.model;

import lombok.Data;

/**
 * @author yd
 * @date 2020/5/17 19:37
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;


}
