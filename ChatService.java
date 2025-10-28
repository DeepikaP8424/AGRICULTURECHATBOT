package Agri.AgricultureBot.service;

import org.springframework.stereotype.Service;

import Agri.AgricultureBot.dto.ChatResponse;
import Agri.AgricultureBot.repository.QuestionAnswerRepository;

@Service
public class ChatService {

    private final QuestionAnswerRepository repository;

    public ChatService(QuestionAnswerRepository repository) {
        this.repository = repository;
    }

    public ChatResponse getAnswer(String question) {
        return repository.findByQuestionIgnoreCase(question)
                .map(qa -> new ChatResponse(qa.getAnswer()))
                .orElse(new ChatResponse("Sorry, I don't know the answer for that question."));
    }
}
