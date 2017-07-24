package org.lyg.delegateBean;

import org.lyg.restService.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("HelloBean")
public class HelloBean {
    @Autowired
   // @Qualifier("HelloService")
    private HelloService helloService;
    private String say = "123";
    private int hello=123;
    private int n;

    public String saySomething(int n){
        this.n = n;
        helloService.testSample(hello);
        return say;
    }

}