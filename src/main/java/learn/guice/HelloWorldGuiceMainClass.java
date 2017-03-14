package learn.guice;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

public class HelloWorldGuiceMainClass {
    @Inject
    HelloGuiceServer helloGuiceServer;

    private void helloWorldGuice(){
        String serverMethod = helloGuiceServer.serverMethod("Hello World");
        System.out.println(serverMethod);
    }

    public static void main(String[] args) {
        HelloWorldGuiceMainClass helloGuice = new HelloWorldGuiceMainClass();

        Module module = new HelloGuiceModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(helloGuice);

        helloGuice.helloWorldGuice();

    }
}
