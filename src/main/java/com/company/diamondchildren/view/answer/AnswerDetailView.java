package com.company.diamondchildren.view.answer;

import com.company.diamondchildren.entity.Answer;

import com.company.diamondchildren.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "answers/:id", layout = MainView.class)
@ViewController("Answer.detail")
@ViewDescriptor("answer-detail-view.xml")
@EditedEntityContainer("answerDc")
public class AnswerDetailView extends StandardDetailView<Answer> {
}