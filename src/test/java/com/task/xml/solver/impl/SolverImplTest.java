package com.task.xml.solver.impl;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import com.task.xml.solver.Solver;
import com.task.xml.solver.task.impl.Task1;
import com.task.xml.solver.task.impl.Task2;
import com.task.xml.solver.task.impl.Task3;
import com.task.xml.solver.task.impl.Task4;
import com.task.xml.solver.task.impl.Task5;
import com.task.xml.utility.DocReaderWriter;
import com.task.xml.utility.impl.DocReaderWriterImpl;

class SolverImplTest {
    static Solver solver;

    @BeforeAll
    static void setUp() throws TransformerException, ParserConfigurationException {
        DocReaderWriter readerWriter = new DocReaderWriterImpl();
        solver = new SolverImpl(readerWriter)
                .appendTask(new Task1(readerWriter))
                .appendTask(new Task2(readerWriter))
                .appendTask(new Task3(readerWriter))
                .appendTask(new Task4(readerWriter))
                .appendTask(new Task5(readerWriter));
    }

    @Test
    void testSolveAllTasks() throws TransformerException, SAXException, IOException {
        solver.openXml("test.xml").solveAllTasks().saveSolutions();
    }
}
