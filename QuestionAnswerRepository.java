package Agri.AgricultureBot.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import Agri.AgricultureBot.model.QuestionAnswer;


	
	public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Long> {
	    Optional<QuestionAnswer> findByQuestionIgnoreCase(String question);
	}

