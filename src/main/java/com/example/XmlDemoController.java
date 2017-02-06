package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

/**
 * XmlDemoController
 */
@RestController
@RequestMapping("/xmldemo")
public class XmlDemoController {

    private static final Logger LOG = LoggerFactory.getLogger(XmlDemoController.class);


    @RequestMapping(
        value="",
        method=RequestMethod.GET
    )
    public @ResponseBody String testXml(

    ){
        LOG.debug("Test");
        return "<root>Test</root>";
    }



    @RequestMapping(
        value = "/postxml",
        method = RequestMethod.POST,
        produces = { MediaType.TEXT_XML_VALUE, MediaType.APPLICATION_XML_VALUE},
        consumes = { MediaType.TEXT_XML_VALUE, MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_HTML_VALUE} //MediaType.ALL_VALUE
    )public @ResponseBody String postXml (
        @RequestBody RootNode req
    ){
        LOG.debug("Started");
        List<N1Node> n1list = req.getN1NodeList();
        LOG.debug("Got n1 nodes: {}", n1list);
        for (N1Node n1: n1list){
            LOG.debug("N1: {}", n1);

            String n1Text = n1.getText();
            LOG.debug("Got N1 Text: {}", n1Text);

            List<N2Node> n2list = n1.getN2NodeList();
            LOG.debug("Got n2 nodes: {}", n2list);
            for (N2Node n2: n2list){
                LOG.debug("N2: {}", n2);
            }
        }
        LOG.debug("Finished");
        return "<root>postXML</root>";
    }


}
