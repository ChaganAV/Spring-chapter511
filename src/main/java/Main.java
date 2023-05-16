import service.CommentService;
import model.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        CommentService cs1 = context.getBean("commentService", CommentService.class);
//        CommentService cs2 = context.getBean("commentService", CommentService.class);
        CommentService cs = context.getBean(CommentService.class);
        UserService us = context.getBean(UserService.class);

        boolean b1 = cs.getCommentRepository() == us.getCommentRepository();
        System.out.println(b1);
    }
}
