package life.yuanma.community.dto;

import lombok.Data;

/**
 * @author yd
 * @date 2020/5/24 20:26
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
