package com.yash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yash.entity.Comment;
import com.yash.entity.Post;
import com.yash.repository.PostRepo;

@SpringBootApplication
public class OneToManyRelationApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OneToManyRelationApplication.class, args);
		
		System.out.println("this is uploaded on git repository");
}

	@Autowired    
	private PostRepo postrepo;
	@Override
	public void run(String... args) throws Exception {
		
		Post post=new Post("MyFirstPost", "MyFirstPost");
      Comment coment=new Comment("Good");
      Comment coment1=new Comment("VeryGood");
      Comment coment2=new Comment("ExcellentGood");
      
      post.getComments().add(coment);
      post.getComments().add(coment1);
      post.getComments().add(coment2);
      
      
      this.postrepo.save(post);

		
	}

}
