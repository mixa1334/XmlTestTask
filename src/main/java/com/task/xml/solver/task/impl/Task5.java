package com.task.xml.solver.task.impl;

import java.util.List;

import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.task.xml.utility.DocReaderWriter;

// 5. Для каждого узла Param, у которого атрибута Name повторяется с другими узлами Param, то необходимо объединить значения атрибут Name и pos:
//    Примеры: <Param ID="3" Name="p_LOGIN_ID1" pos="1" .../>
//             <Param ID="4" Name="p_UPDATE_DATE2" pos="2" .../>
//             ...
public class Task5 extends AbstractTask {
    private static final String PARAM = "Param";
    private static final String NAME = "Name";
    private static final String POS = "pos";
    private DocReaderWriter readerWriter;

    public Task5(DocReaderWriter readerWriter) {
        this.readerWriter = readerWriter;
    }

    @Override
    public Document solve(Document document) throws TransformerException {
        Document result = readerWriter.copy(document);
        NodeList nodes = result.getElementsByTagName(PARAM);
        groupElementsByAttributeValue(nodes, NAME)
                .filter(l -> l.size() > 1)
                .flatMap(List::stream)
                .forEach(e -> e.setAttribute(NAME, replaceName(e)));
        return result;
    }

    protected String replaceName(Element element) {
        return element.getAttribute(NAME) + element.getAttribute(POS);
    }

}
