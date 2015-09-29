package mx.com.practice;

import mx.com.practice.Data.Cliente;

/**
 * Created by jrodriguez on 27/09/15.
 */
public class WebServiceImpl implements WebServiceInterface {

    @Override
    public Cliente testService(Cliente cliente){
        return  cliente;
    }
}
