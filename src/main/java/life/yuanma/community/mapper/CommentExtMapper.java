package life.yuanma.community.mapper;

import life.yuanma.community.model.Comment;
import life.yuanma.community.model.CommentExample;
import life.yuanma.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {

    int incCommentCount(Comment comment);
}