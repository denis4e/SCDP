package com.demo.scdp;


import com.demo.scdp.User;
import com.demo.scdp.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.mock;

@RunWith(SpringJUnit4ClassRunner.class)
class SimpleTest {

    UserService userService = mock(UserService.class);
    User userUser = mock(User.class);

    @Test
    public void whenUserHasFullName_returnName() {
        System.out.println("******************* Java test **********************");
        Mockito.when(userService.getUserFullName(userUser)).thenReturn("Denys Sosuliev");
        User realUser = new User("Denys", "Sosuliev");
        Assert.assertEquals(realUser.getName() + " " + realUser.getLastName(), userService.getUserFullName(userUser));
    }
}
