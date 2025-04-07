package org.sopt.repository;

import org.sopt.domain.Post;

import java.util.ArrayList;
import java.util.List;
// 저장, 삭제와 같은 기능 자체를 담당
// 데이터 가져다 쓰고 활용하는 공간
public class PostRepository {
    // post들이 들어갈 List를 정의해준 부분
    List<Post> postList = new ArrayList<>();

    // 2.post를 전달 받았을 때 추가해주는 부분. -> service에서 기능 구현이 될 예정
    public void save(Post post) {
        postList.add(post);
    }

    // 3. 전체 객체에 대한 조회를 담당하는 부분
    public List<Post> findAll() {
        return postList;
    }

    public Post getPostById(int id) {
        for (Post post : postList) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public Post deletePostById(int id){
        for (Post post : postList) {
            if (post.getId() == id) {
                postList.remove(post);
            }
        }
        return null;
    }

    public Post updatePostTitle(int updateId, String newTitle) {
        Post post = getPostById(updateId);
        if(post != null){
            post.setTitle(newTitle);
            return post;
        } return null;
    }
}
