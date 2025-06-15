package com.task.xml.solver.task.impl;

import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.task.xml.solver.task.Task;
import com.task.xml.utility.DocReaderWriter;

// 2. Во всех узлах дерева, в которых атрибута target_type ПУСТАЯ - нужно добавить значение "UNKNOWN" в эту же атрибуту:
//    Пример: <Function ID="11" ... target_type="UNKNOWN" .../>
public class Task2 implements Task {
    private static final String ALL_ELEMENTS = "*";
    private static final String TARGET_TYPE = "target_type";
    private static final String UNKNOWN = "UNKNOWN";
    private final DocReaderWriter readerWriter;

    public Task2(DocReaderWriter readerWriter) {
        this.readerWriter = readerWriter;
    }

    @Override
    public Document solve(Document document) throws TransformerException {
        Document result = readerWriter.copy(document);
        NodeList nodes = result.getElementsByTagName(ALL_ELEMENTS);
        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);
            if (isTargetTypeEmpty(element)) {
                element.setAttribute(TARGET_TYPE, UNKNOWN);
            }
        }
        return result;
    }

    private boolean isTargetTypeEmpty(Element element) {
        return element.hasAttribute(TARGET_TYPE)
                && element.getAttribute(TARGET_TYPE).strip().isEmpty();
    }

}
