package com.company.diamondchildren.view.poll;

import com.company.diamondchildren.entity.Poll;

import com.company.diamondchildren.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "polls/:id", layout = MainView.class)
@ViewController("Poll.detail")
@ViewDescriptor("poll-detail-view.xml")
@EditedEntityContainer("pollDc")
public class PollDetailView extends StandardDetailView<Poll> {
}