package com.task.xml.utility.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.task.xml.utility.DocReaderWriter;

public class DocReaderWriterImpl implements DocReaderWriter {
    private Transformer copier;
    private Transformer writer;
    private DocumentBuilder reader;

    public DocReaderWriterImpl() throws TransformerException, ParserConfigurationException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        this.copier = transformerFactory.newTransformer();
        this.writer = transformerFactory.newTransformer();
        this.writer.setOutputProperty(OutputKeys.INDENT, "yes");
        this.reader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    }

    @Override
    public Document read(String fileName) throws SAXException, IOException {
        try (InputStream in = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream(fileName)) {
            if (in == null) {
                throw new FileNotFoundException("No such file");
            }
            return reader.parse(in);
        }
    }

    @Override
    public void write(String fileName, Document document) throws TransformerException {
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(fileName));
        writer.transform(source, result);
    }

    @Override
    public Document copy(Document original) throws TransformerException {
        DOMSource source = new DOMSource(original);
        DOMResult result = new DOMResult();
        copier.transform(source, result);
        return (Document) result.getNode();
    }

    @Override
    public Document createEmpty() {
        return reader.newDocument();
    }

}
