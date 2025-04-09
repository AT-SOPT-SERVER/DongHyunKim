package org.sopt.contoller;

import org.sopt.domain.Post;
import org.sopt.service.PostService;

import java.util.List;

public class PostController {

    // 요청이 들어왔을 떄, 아 이 요청은 이 서비스를 이용해여갰구나를 결정하는 공간

    private PostService postService = new PostService();

    // 각각의 게시글 id를 수정하는 부분
    private int postId;

    // 2, 게시글 작성 -> service에서 정의해둔 save를 사용하는 부분
    public boolean createPost(String title) {
        return postService.createPost(title);
    }

    // 3. 레포지토리에서 던진 값 받는 부분
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    public Post getPostById(int id) {
        return postService.getPostById(id);
    }

    public boolean deletePostById(int id) {
        return true;
    }

    public boolean updatePostTitle(int updateId, String newTitle) {
        Post updatePost = postService.updatePostTitle(updateId, newTitle);
        return updatePost != null;
    }
}