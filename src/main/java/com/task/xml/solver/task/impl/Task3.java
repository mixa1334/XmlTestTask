package com.task.xml.solver.task.impl;

import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.task.xml.utility.DocReaderWriter;

// 3. Выполнить выборку узлов Procedure и Function, в которых атрибута Name повторяется, чтобы в результате получилось дерево следующего вида:
//    <root>
//       <Functions>
//          <!-- Список из функций с одинаковыми именами -->
//          <Function ...>
//             ...
//          </Function>
//       </Functions>
//       <Procedures>
//          <!-- Список из процедур с одинаковыми именами -->
//          <Procedure ...>
//             ...
//          </Procedure>
//       </Procedures>
//    </root>
public class Task3 extends AbstractTask {
    private static final String ROOT = "root";
    private static final String PROCEDURES = "Procedures";
    private static final String PROCEDURE = "Procedure";
    private static final String FUNCTIONS = "Functions";
    private static final String FUNCTION = "Function";
    private static final String NAME = "Name";
    private final DocReaderWriter readerWriter;
    private Document source;
    private Document result;

    public Task3(DocReaderWriter readerWriter) {
        this.readerWriter = readerWriter;
    }

    @Override
    public Document solve(Document document) {
        source = document;
        result = readerWriter.createEmpty();
        Element root = result.createElement(ROOT);
        result.appendChild(root);
        root.appendChild(findElementsWithDuplicateNames(PROCEDURE, PROCEDURES));
        root.appendChild(findElementsWithDuplicateNames(FUNCTION, FUNCTIONS));
        return result;
    }

    private Element findElementsWithDuplicateNames(String elementTagName, String outputGroupName) {
        Element duplicates = result.createElement(outputGroupName);
        NodeList nodes = source.getElementsByTagName(elementTagName);
        groupElementsByAttributeValue(nodes, NAME)
                .filter(l -> l.size() > 1)
                .flatMap(List::stream)
                .forEach(n -> duplicates.appendChild(result.importNode(n, true)));
        return duplicates;
    }
}
