package com.task.xml.solver.task.impl;

import java.util.TreeSet;
import java.util.stream.Stream;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.task.xml.solver.task.Task;
import com.task.xml.utility.DocReaderWriter;

// 4. Выполнить выборку узлов Object, в которых атрибута ID является чётной, так же эти узлы Object необходимо отсортировать по возрастанию (значение атрибуты ID), чтобы в результате получилось дерево следующего вида:
//    <Objects>
//       <Object ID="8" ...>
//          ...
//       </Object>
//       <Object ID="10" ...>
//          ...
//       </Object>
//       ...
//    </Objects>
public class Task4 implements Task {
    private static final String OBJECTS = "Objects";
    private static final String OBJECT = "Object";
    private static final String ID = "ID";
    private final DocReaderWriter readerWriter;
    private Document result;

    public Task4(DocReaderWriter readerWriter) {
        this.readerWriter = readerWriter;
    }

    @Override
    public Document solve(Document document) {
        result = readerWriter.createEmpty();
        Element objects = result.createElement(OBJECTS);
        result.appendChild(objects);
        NodeList objectElements = document.getElementsByTagName(OBJECT);
        findEvenIdObjects(objectElements).forEach(objects::appendChild);
        return result;
    }

    private Stream<Element> findEvenIdObjects(NodeList objects) {
        TreeSet<Element> set = new TreeSet<>(
                (e1, e2) -> getId(e1) - getId(e2));
        for (int i = 0; i < objects.getLength(); i++) {
            Element element = (Element) objects.item(i);
            if (getId(element) % 2 == 0) {
                Element importedNode = (Element) result.importNode(element, true);
                set.add(importedNode);
            }
        }
        return set.stream();
    }

    private int getId(Element element) {
        return Integer.parseInt(element.getAttribute(ID));
    }

}
