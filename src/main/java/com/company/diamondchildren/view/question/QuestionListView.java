package com.company.diamondchildren.view.question;

import com.company.diamondchildren.entity.Question;

import com.company.diamondchildren.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "questions", layout = MainView.class)
@ViewController("Question.list")
@ViewDescriptor("question-list-view.xml")
@LookupComponent("questionsDataGrid")
@DialogMode(width = "64em")
public class QuestionListView extends StandardListView<Question> {
}