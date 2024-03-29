package com.flores.testingandroid.domain.useCase;

import org.junit.Assert;
import org.junit.Test;
/**
 * UserUseCaseTest
 *
 * @author Bill Flores
 * @since 06/17/2019
 */
public class UserUseCaseTest {

    @Test
    public void validationUserTest(){
        Assert.assertTrue(UserUseCase.validationUser("jaime"));
        Assert.assertTrue(UserUseCase.validationUser("Bill.Flores"));
        Assert.assertTrue(UserUseCase.validationUser("BillFlores"));
        Assert.assertTrue(UserUseCase.validationUser("BillFlores123"));
    }

}
