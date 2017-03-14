package learn.guice;


import com.google.inject.AbstractModule;

public class HelloGuiceModule extends AbstractModule {
    protected void configure() {
        //add configuration logic here.
        bind(HelloGuiceServer.class).to(HelloGuiceServerImpl.class);
    }
}
