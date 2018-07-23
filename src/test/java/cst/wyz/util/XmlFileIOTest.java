package cst.wyz.util;

import org.dom4j.DocumentException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class XmlFileIOTest {

    private XmlFileIO xmlFileIO;

    @Test
    public void testRead(){
        try {
            xmlFileIO = XmlFileIO.getInstance("test.xml");
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        System.out.println(xmlFileIO.readDom("user"));

    }

}
