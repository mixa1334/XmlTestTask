package com.task.xml.solver.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.task.xml.solver.Solver;
import com.task.xml.solver.task.Task;
import com.task.xml.utility.DocReaderWriter;

public class SolverImpl implements Solver {
    private static final String SOLUTION_FILE_NAME = "Task-%d.xsl";
    private final DocReaderWriter readerWriter;
    private Document document;
    private List<Task> tasks = new ArrayList<>();
    private List<Document> solutions = new ArrayList<>();

    public SolverImpl(DocReaderWriter readerWriter) {
        this.readerWriter = readerWriter;
    }

    @Override
    public Solver openXml(String fileName) throws SAXException, IOException {
        document = readerWriter.read(fileName);
        return this;
    }

    @Override
    public Solver solveAllTasks() throws TransformerException {
        solutions.clear();
        for (Task task : tasks) {
            solutions.add(task.solve(document));
        }
        return this;
    }

    @Override
    public void saveSolutions() throws TransformerException {
        for (int i = 0; i < solutions.size(); i++) {
            Document solution = solutions.get(i);
            String fileName = String.format(SOLUTION_FILE_NAME, i + 1);
            readerWriter.write(fileName, solution);
        }
    }

    @Override
    public Solver appendTask(Task task) {
        tasks.add(task);
        return this;
    }

}
