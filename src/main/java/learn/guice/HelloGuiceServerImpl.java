package learn.guice;

public class HelloGuiceServerImpl implements HelloGuiceServer {
    public String serverMethod(String msg) {
        return "Google server :" + msg;
    }
}
