package designpattern.facade;

public class SecureFacade {
    private Camera camera;
    private Light light;

    public SecureFacade() {
        this.camera = new Camera();
        this.light = new Light();
    }

    public void activate() {
        camera.turnOn();
        light.turnOn();
    }

    public void deActivate() {
        camera.turnOff();
        light.turnOff();
    }
}
