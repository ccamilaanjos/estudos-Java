package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<Comment>();
	
	
	public Post(String title, String content) {
		this.moment = LocalDateTime.now();
		this.title = title;
		this.content = content;
		this.likes = 0;
	}

	private String getComments() {
		String commentString = "";
		
		for (Comment comment : comments) {
			commentString += comment.toString() + "\n";			
		}
		
		return commentString;
	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
		
	public void setLikes(Integer likes) {
		this.likes = likes;
		
	}
	
	@Override
	public String toString() {
		return this.title + "\n" +
				this.likes + " likes - " +
				this.moment + "\n" +
				this.content + "\n" +
				"Comments:" + "\n" +
				this.getComments();
	}
	
}
