package life.yuanma.community.dto;

import life.yuanma.community.model.User;
import lombok.Data;

/**
 * @author yd
 * @date 2020/5/25 21:22
 */
@Data
public class CommentDTO {

        private Long id;
        private Long parentId;
        private Integer type;
        private Long commentator;
        private Long gmtCreate;
        private Long gmtModified;
        private Long likeCount;
        private Integer commentCount;
        private String content;
        private User user;
}
