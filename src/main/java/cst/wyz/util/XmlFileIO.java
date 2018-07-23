package cst.wyz.util;

import cst.wyz.entity.User;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
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

    public List<User> readDom(String prop){
        Element root = null;

        root = document.getRootElement();

        Element element = root.element(prop);

        List<Element> elements = element.elements("prop");

        List<User> users = new ArrayList<>();

        for(Element element1 : elements){
            User user = new User();
            user.setId(element1.attributeValue("id"));
            user.setName(element1.attributeValue("name"));
            user.setPassword(element1.attributeValue("password"));
            users.add(user);
        }

        return users;
    }



}
