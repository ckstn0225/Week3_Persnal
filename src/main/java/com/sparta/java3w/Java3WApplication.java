package com.sparta.java3w;

import com.sparta.java3w.Entity.Post;
import com.sparta.java3w.Repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Java3WApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java3WApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo(PostRepository postRepository) {
        return (args) -> {

        };
    }

}
//새글 실험용 { "title": "새글입니당","contents":"화이팅입니다","auther":"관리자","pword":"비밀번호"}
//수정 실험용 { "title": "새글아닌뎅","contents":"이제 헌글인데","auther":"관리자2","pword":"비밀번호2"}
//id초기화용
//ALTER TABLE [테이블명] AUTO_INCREMENT=1;
//SET @COUNT = 0;
//UPDATE [테이블명] SET [AUTO_INCREMENT 열 이름] = @COUNT:=@COUNT+1;