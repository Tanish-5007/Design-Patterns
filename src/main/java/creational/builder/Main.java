package creational.builder;

public class Main {

    public static void main(String[] args) {

        URL urlBuilder = new URL.URLBuilder()
                .setProtocol("https://")
                .setHostname("store:")
                .setPort("9090/")
                .setPathParam("api/users")
                .setQueryParam("id=123&name=John")
                .build();

        System.out.println(urlBuilder.toString());

    }
}

