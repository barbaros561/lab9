package wizut.tpsi.lab9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

@Controller

public class BlogController {

    @Autowired
    public BlogRepository blogRepository;


    @RequestMapping("/")
    public String home(Model model, BlogPost blogPost)throws SQLException {
        List<BlogPost> posts= blogRepository.getAllPosts();
        model.addAttribute("posts", posts);
        return "index";
    }


    @PostMapping("/newpost")
    public String newPost(BlogPost post) throws SQLException {
        blogRepository.createPost(post);
        return "redirect:/";
    }

    @GetMapping("/{postid}")
    public  @ResponseBody String deletePost(@PathVariable(value = "postid") String postid, String id) throws SQLException {

        blogRepository.deletePost(id);
        return "<META HTTP-EQUIV='REFRESH' CONTENT='0; URL=http://localhost:8080/ '>";
    }



   

}
