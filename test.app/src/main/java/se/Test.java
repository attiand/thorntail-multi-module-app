package se;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class Test {

    @Inject
    Foo foo;    
}