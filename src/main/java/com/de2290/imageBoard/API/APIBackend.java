package com.de2290.imageBoard.API;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class APIBackend {


    private ArrayList<Login> logins = new ArrayList<>();
    private ArrayList<Post> posts = new ArrayList<>();

    @GetMapping("/api/getLogins")
    public ArrayList<Login> getLogins() {
        return this.logins;
    }

    public void setLogins(ArrayList<Login> logins) {
        this.logins = logins;
    }


    @PostMapping("/api/login")
    public Login auth(@RequestBody LoginForm l) {
        for (Login login : logins) {
            if (login.getUsername().equals(l.getUsername()) && login.getPassword().equals(l.getPassword())) {
                return login;
            }
        }
        return null;
    }

    @PostMapping("/api/loginbyUUID")
    public Login authbyUUID(@RequestBody UUIDForm uuidform) {
        for (Login login : logins) {
            if (login.getUUID().equals(uuidform.getUuid())) {
                return login;
            }
        }

        return null;
    } 


    @PostMapping("/api/createNewPost")
    public HttpStatus createPost(@RequestBody PostForm post) {
        posts.add(new Post(post.getUsername(), post.getUrl(), post.getCaption()));
        return HttpStatus.OK;
    }

    @GetMapping("/api/getAllPosts")
    public ArrayList<Post> getPosts() {
        return this.posts;
    }
    


    @PostMapping("/api/register")
    public HttpStatus register(@RequestBody LoginForm l) {
        logins.add(new Login(l.getUsername(), l.getPassword()));
        return HttpStatus.OK;
    }







    
}