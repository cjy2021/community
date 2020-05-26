package life.yuanma.community.dto;

import life.yuanma.community.model.User;
import lombok.Data;

/**
 * @author yd
 * @date 2020/5/19 21:20
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
