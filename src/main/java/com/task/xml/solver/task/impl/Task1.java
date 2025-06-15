package com.task.xml.solver.task.impl;

import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.task.xml.solver.task.Task;
import com.task.xml.utility.DocReaderWriter;

// 1. Удаление узлов дерева:
//    1.1. Удалить узлы Procedure и Function, у которых нету дочерних элементов.
//    1.2. Удалить все ПУСТЫЕ атрибуты java_package из всех узлов дерева.
public class Task1 implements Task {
    private static final String PROCEDURE = "Procedure";
    private static final String FUNCTION = "Function";
    private static final String JAVA_PACKAGE = "java_package";
    private final DocReaderWriter readerWriter;

    public Task1(DocReaderWriter readerWriter) {
        this.readerWriter = readerWriter;
    }

    @Override
    public Document solve(Document document) throws TransformerException {
        Document result = readerWriter.copy(document);
        walkThrough(result.getDocumentElement());
        return result;
    }

    private void walkThrough(Node node) {
        if (isProcedureOrFunctionToDelete(node)) {
            node.getParentNode().removeChild(node);
            return;
        }
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            if (isJavaPackageAttrEmpty(element)) {
                element.removeAttribute(JAVA_PACKAGE);
            }
        }
        NodeList kids = node.getChildNodes();
        for (int i = 0; i < kids.getLength(); i++) {
            walkThrough(kids.item(i));
        }
    }

    private boolean isProcedureOrFunctionToDelete(Node node) {
        return !node.hasChildNodes()
                && (node.getNodeName().equals(PROCEDURE) || node.getNodeName().equals(FUNCTION));
    }

    private boolean isJavaPackageAttrEmpty(Element element) {
        return element.getAttribute(JAVA_PACKAGE).strip().isEmpty();
    }

}