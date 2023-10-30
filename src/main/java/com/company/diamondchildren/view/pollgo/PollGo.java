package com.company.diamondchildren.view.pollgo;


import com.company.diamondchildren.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "PollGo", layout = MainView.class)
@ViewController("PollGo")
@ViewDescriptor("poll-go.xml")
public class PollGo extends StandardView {
}