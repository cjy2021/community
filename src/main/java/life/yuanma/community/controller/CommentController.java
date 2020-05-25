package life.yuanma.community.controller;

import life.yuanma.community.dto.CommentDTO;
import life.yuanma.community.dto.ResultDTO;
import life.yuanma.community.exception.CustomizeErrorCode;
import life.yuanma.community.mapper.CommentMapper;
import life.yuanma.community.model.Comment;
import life.yuanma.community.model.User;
import life.yuanma.community.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yd
 * @date 2020/5/24 20:11
 */
@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
    @ResponseBody
    @RequestMapping(value = "/comment",method = RequestMethod.POST)
    public Object post(@RequestBody CommentDTO commentDTO,
                       HttpServletRequest request){
        User user =(User) request.getSession().getAttribute("user");
        if (user == null){
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);}
        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setCommentator(user.getId());
        comment.setLikeCount(0L);
        commentService.insert(comment);
        Map<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("messgae","成功");
        return objectObjectHashMap;
    }
}
