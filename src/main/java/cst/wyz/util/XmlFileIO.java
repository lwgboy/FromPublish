package cst.wyz.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XmlFileIO {

    private Document document;

    private XmlFileIO(Document document){
        this.document = document;
    }

    public static XmlFileIO getInstance(String filename) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        String filepath = XmlFileIO.class.getClassLoader().getResource(filename).getPath();
        File file = new File(filepath);
        Document document = saxReader.read(file);
        return new XmlFileIO(document);
    }

    public String readDom(String prop){
        Element root = null;

        root = document.getRootElement();

        Element element = root.element(prop);

        List<Element> elements = element.elements("prop");

        return elements.toString();
    }



}
