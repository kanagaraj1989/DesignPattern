package Singleton;

public class SNSClient {
    private static SNSClient instance;
    private final String apiClient;
    private SNSClient() {
        apiClient = "AWS SNS Api Client";
    }

    public static SNSClient getInstance() {
        if (instance == null) {
            synchronized (SNSClient.class) {
                if (instance == null) {
                    instance = new SNSClient();
                }
            }
        }
        return instance;
    }

    public void printHello() {
        System.out.println("Hello World");
    }
}
