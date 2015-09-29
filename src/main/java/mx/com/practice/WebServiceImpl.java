package mx.com.practice;

import mx.com.practice.Data.Cliente;

import javax.jws.WebParam;

/**
 * Created by jrodriguez on 27/09/15.
 */
public class WebServiceImpl implements WebServiceInterface {

    @Override
    public Cliente testService(Cliente cliente){
        return  cliente;
    }

    @Override
    public Cliente testServiceClient(@WebParam(name = "cliente") Cliente cliente) {
        cliente.setAge(cliente.getAge() + 5);
        return cliente;
    }
}
