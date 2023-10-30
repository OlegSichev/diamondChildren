package com.company.diamondchildren.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "QUESTION", indexes = {
        @Index(name = "IDX_QUESTION_POLL", columnList = "POLL_ID")
})
@Entity
public class Question {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "NEW_QUESTION", nullable = false)
    @NotNull
    private String new_question;

    @Composition
    @OneToMany(mappedBy = "question")
    private List<Answer> answer;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "POLL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Poll poll;

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public String getNew_question() {
        return new_question;
    }

    public void setNew_question(String new_question) {
        this.new_question = new_question;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}