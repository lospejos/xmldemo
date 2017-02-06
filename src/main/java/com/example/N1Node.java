package com.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.util.List;

/**
 * N1Node
 */
@JacksonXmlRootElement(localName = "n1")
public class N1Node {
    private String id;
    private List<N2Node> n2NodeList;
    private String text;

    @JacksonXmlProperty(localName = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JacksonXmlElementWrapper(localName = "n2")
    public List<N2Node> getN2NodeList() {
        return n2NodeList;
    }

    public void setN2NodeList(List<N2Node> n2NodeList) {
        this.n2NodeList = n2NodeList;
    }

    @JacksonXmlText
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
