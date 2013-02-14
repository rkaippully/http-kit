package org.httpkit.server;

public class HttpServerAtta extends ServerAtta {

    public HttpServerAtta(int maxBody, int maxLine) {
        decoder = new RequestDecoder(maxBody, maxLine);
        
    }
    
    public final RequestDecoder decoder;
    AsyncChannel asycChannel;

    boolean keepalive;

    public boolean isKeepAlive() {
        return keepalive;
    }
}
