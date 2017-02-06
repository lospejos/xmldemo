package com.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * RootNode
 */
@JacksonXmlRootElement(localName = "root")
public class RootNode {

    private List<N1Node> n1NodeList;

    @JacksonXmlElementWrapper(localName = "n1")
    public List<N1Node> getN1NodeList() {
        return n1NodeList;
    }

    public void setN1NodeList(List<N1Node> n1NodeList) {
        this.n1NodeList = n1NodeList;
    }
}
