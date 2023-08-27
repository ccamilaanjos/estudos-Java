package application;

import entities.Comment;
import entities.Post;

public class Feed {

	public static void main(String[] args) {		
		
		Post post1;
		post1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!");
		Comment comment1 = new Comment("Have a nice trip");
		Comment comment2 = new Comment("Wow that's awesome");
		post1.setLikes(12);
		post1.addComment(comment1);
		post1.addComment(comment2);

		System.out.println(post1);
		
		Post post2;
		post2 = new Post("Good night guys", "See you tomorrow");
		Comment comment3 = new Comment("Good night");
		Comment comment4 = new Comment("May the force be with you");
		post2.setLikes(5);
		post2.addComment(comment3);
		post2.addComment(comment4);

		System.out.println(post2);
	}

}
