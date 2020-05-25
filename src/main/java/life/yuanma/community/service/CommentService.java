package life.yuanma.community.service;

import life.yuanma.community.exception.CustomizeErrorCode;
import life.yuanma.community.exception.CustomizeException;
import life.yuanma.community.model.Comment;
import org.springframework.stereotype.Service;

/**
 * @author yd
 * @date 2020/5/24 22:38
 */
@Service
public class CommentService {
    public void insert(Comment comment) {
if (comment.getParentId() == null || comment.getParentId() == 0){
    throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOUND);
}
    }
}
