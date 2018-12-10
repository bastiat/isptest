package org.baz;

import org.foo.Service;

public class ClientOfService {

    private Service service;

    public ClientOfService(Service service) {
        this.service = service;
    }

    public void doWorkCallingDoAFromService() {
        System.out.println("ClientOfService.doWorkCallingDoAFromService() :: this is doWorkCallingDoAFromService() implementation in ClientOfService class");
        System.out.println("now I will call doA on my private Service service; I don't know the implementing class, I only use method doA from this interface.");
        service.doA();
        System.out.println("ClientOfService.doWorkCallingDoAFromService() :: method end");
    }

}
