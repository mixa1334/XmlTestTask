package com.task.xml.solver.task.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.task.xml.solver.task.Task;

public abstract class AbstractTask implements Task {

    protected Stream<List<Element>> groupElementsByAttributeValue(NodeList nodes, String attribute) {
        HashMap<String, List<Element>> nodesByValue = new HashMap<>();
        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);
            String attributeValue = element.getAttribute(attribute);
            nodesByValue.compute(attributeValue, (a, l) -> {
                if (l == null) {
                    l = new ArrayList<>();
                }
                l.add(element);
                return l;
            });
        }
        return nodesByValue.values().stream();
    }

}
