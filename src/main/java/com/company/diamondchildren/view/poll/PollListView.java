package com.company.diamondchildren.view.poll;

import com.company.diamondchildren.entity.Poll;

import com.company.diamondchildren.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "polls", layout = MainView.class)
@ViewController("Poll.list")
@ViewDescriptor("poll-list-view.xml")
@LookupComponent("pollsDataGrid")
@DialogMode(width = "64em")
public class PollListView extends StandardListView<Poll> {
}