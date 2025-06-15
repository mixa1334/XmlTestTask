package com.task.xml.utility;

import java.io.IOException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public interface DocReaderWriter {
    Document read(String fileName) throws SAXException, IOException;

    void write(String fileName, Document document) throws TransformerException;

    Document copy(Document original) throws TransformerException;

    Document createEmpty();
}
