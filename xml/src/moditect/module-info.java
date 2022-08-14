module tools.jackson.jakarta.rs.xml {
    exports tools.jackson.jakarta.rs.xml;
    // CXF, RESTEasy, OpenAPI require reflective access
    opens tools.jackson.jakarta.rs.xml;

    requires tools.jackson.core;
    requires tools.jackson.databind;
    requires tools.jackson.dataformat.xml;
    requires tools.jackson.module.jakarta.xmlbind;

    requires tools.jackson.jakarta.rs.base;

    provides jakarta.ws.rs.ext.MessageBodyReader with
        tools.jackson.jakarta.rs.xml.JacksonXMLProvider;
    provides jakarta.ws.rs.ext.MessageBodyWriter with
        tools.jackson.jakarta.rs.xml.JacksonXMLProvider;
}
