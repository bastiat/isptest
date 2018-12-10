package org.app;

import org.bar.ServiceImpl;
import org.baz.ClientOfService;
import org.foo.Service;

public class App {

    public static void main(String[] args) {
        Service service = new ServiceImpl();
        ClientOfService clientOfService = new ClientOfService(service);
        System.out.println("App.main() :: calling clientOfService.doWorkCallingDoAFromService");
        clientOfService.doWorkCallingDoAFromService();
        System.out.println("App.main() :: end of main");
    }

}
