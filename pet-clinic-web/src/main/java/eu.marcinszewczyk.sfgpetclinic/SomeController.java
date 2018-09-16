package eu.marcinszewczyk.sfgpetclinic;

public class SomeController {
    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}
