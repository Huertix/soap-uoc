package huertix.uoc.soap;


import huertix.uoc.soap.controllers.HelloWorldController;
import org.jooby.Jooby;

public class JoobyApp extends Jooby {

    {
        port(8081);
        // 2
//        get("/", () -> "Hello World!");

        use(HelloWorldController.class);
    }

    public static void main(final String[] args) { run(JoobyApp::new, args); }
}
