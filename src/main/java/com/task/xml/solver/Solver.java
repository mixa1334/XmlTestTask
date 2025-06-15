package com.task.xml.solver;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import com.task.xml.solver.task.Task;

public interface Solver {
    Solver openXml(String fileName) throws SAXException, IOException;

    Solver solveAllTasks() throws TransformerException;

    void saveSolutions() throws TransformerException;

    Solver appendTask(Task task);
}
