package creational.builder;

public class URL {
    public final String protocol;
    public final String hostname;
    public final String port;
    public final String pathParam;
    public final String queryParam;

    private URL(URLBuilder builder){
        this.protocol = builder.protocol;
        this.hostname = builder.hostname;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.queryParam = builder.queryParam;
    }

    public static class URLBuilder{
        private String protocol;
        private String hostname;
        private String port;
        private String pathParam;
        private String queryParam;

        public URLBuilder setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public URLBuilder setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public URLBuilder setPort(String port) {
            this.port = port;
            return this;
        }
        public URLBuilder setPathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }
        public URLBuilder setQueryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }
        public URL build(){
            return new URL(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (protocol != null) {
            sb.append(protocol);
        }
        if (hostname != null) {
            sb.append(hostname);
        }
        if (port != null) {
            sb.append(port);
        }
        if (pathParam != null) {
            sb.append(pathParam);
        }
        if (queryParam != null) {
            sb.append("?").append(queryParam);
        }
        return sb.toString();
    }
}
