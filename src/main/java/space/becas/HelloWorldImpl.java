
package space.becas;

import javax.jws.WebService;

@WebService(endpointInterface = "space.becas.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String name) {
        return "Hola Mundo SOAP JAX-WS Web Services " + name;
    }
}

