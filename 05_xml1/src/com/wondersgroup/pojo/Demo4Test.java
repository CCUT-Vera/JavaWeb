package com.wondersgroup.pojo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @description:
 * @author: Wei Tengfei
 * @date: Created in 2021/2/4 10:54 下午
 * @version: v1.0
 */
public class Demo4Test {
    @Test
    public void test1() throws DocumentException {
        //创建一个saxreader流，去读区xml配置文件，生成doucument对象
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/book.xml");

        System.out.println(document);
    }
    /**
     * @Author Wei Tengfei
     * @Description //读取book.xml文件生成book类
     * @Date 11:06 下午 2021/2/4
     * @Param []
     * @return void
     **/

    @Test
    public void test2() throws DocumentException {
        //读取xml文件
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/book.xml");
        //通过doucument对象获取跟元素
        Element element = document.getRootElement();
        //通过根元素获取book标签
        List<Element> books = element.elements("book");
        //便利，处理每一个book标签转换为Book类
        for (Element book : books) {
            Element name = book.element("name");
            String nameText = name.getText();
            //直接获取标签名的文本内容
            String price = book.elementText("price");
            String author = book.elementText("author");
            String sn = book.attributeValue("sn");
            //封装对象
            Book booksBook1 = new Book(sn,nameText,author,Double.parseDouble(price));
            System.out.println(booksBook1);
        }


    }


}
