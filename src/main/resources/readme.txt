1. Check GET request
curl -v http://localhost:8080/xmldemo

2. Check POST request
2.1. from file
curl -v -X POST -H "Content-Type: text/xml" -d @xmldemoreq.xml http://localhost:8080/xmldemo/postxml

2.2. from command line
curl -v -X POST -H "Content-Type: text/xml" -d "<root><n1 id=\"n1-0\">N1-0<n2 id=\"n2-0-0\">Node 0-0</n2><n2 id=\"n2-0-1\">Node 0-1</n2></n1><n1 id=\"n1-1\">N1-1<n2 id=\"n2-1-0\">Node 1-0</n2><n2 id=\"n2-1-1\">Node 1-1</n2></n1></root>" http://localhost:8080/xmldemo/postxml

<?xml version=\"1.0\" encoding=\"UTF-8\" ?>
<root><n1 id=\"n1-0\"><n2 id=\"n2-0-0\">Node 0-0</n2><n2 id=\"n2-0-1\">Node 0-1</n2></n1><n1 id=\"n1-1\"><n2 id=\"n2-1-0\">Node 1-0</n2><n2 id=\"n2-1-1\">Node 1-1</n2></n1></root>