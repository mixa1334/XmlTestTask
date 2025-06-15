package com.task.xml.solver.task;

import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;

public interface Task {
    Document solve(Document document) throws TransformerException;
}
