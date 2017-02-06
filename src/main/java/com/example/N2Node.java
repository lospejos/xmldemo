package com.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

/**
 * N2Node
 */
@JacksonXmlRootElement(localName = "n2")
public class N2Node {

    private String id;

    private String text;

    @JacksonXmlProperty(localName = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JacksonXmlText
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
