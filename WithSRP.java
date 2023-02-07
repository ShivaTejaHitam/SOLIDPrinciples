class PostFeature{
  public CreatePostResponse createPost(CreatePostRequest createPostRequest){
    // create post logic
  }
  
  public DeletePostResponse deletePost(DeletePostRequest deletePostRequest){
    // delete post logic
  }
}

class LikesFeature{
  public LikePostResponse likePost(LikePostRequest likePostRequest){
    // like post logic
  }
  
  public DislikePostResponse dislikePost(DislikePostRequest dislikePostRequest){
    // dislike post logic
  }
}

class CommentsFeature{
  public CreateCommentResponse createComment(CreateCommentRequest createCommentRequest){
    // create comment logic
  }
  
  public DeleteCommentResponse deleteComment(DeleteCommentRequest deleteCommentRequest){
    // delete comment logic
  }
}
