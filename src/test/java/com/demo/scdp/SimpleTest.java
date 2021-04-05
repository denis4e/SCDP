package com.demo.scdp;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
class SimpleTest {

    UserServiceImpl userServiceImpl = mock(UserServiceImpl.class);
    User userUser = mock(User.class);

    @Test
    public void whenUserHasFullName_returnName() {
        System.out.println("******************* Java test **********************");
        Mockito.when(userServiceImpl.getUserFullName(userUser)).thenReturn("Denys Sosuliev");
        User realUser = new User("Denys", "Sosuliev");
        Assert.assertEquals(realUser.getName() + " " + realUser.getLastName(), userServiceImpl.getUserFullName(userUser));
    }

    @Test
    public void utilMethod() {
        Util util = Mockito.mock(Util.class);
        Mockito.doReturn(10).when(util).anIntMethod();
        Assert.assertEquals(util.anIntMethod(), 10);
    }
}
