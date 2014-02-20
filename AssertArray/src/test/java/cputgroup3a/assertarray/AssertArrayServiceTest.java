/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.assertarray;

import cputgroup3a.assertarray.service.AssertArrayService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cputgroup3a.assertarray.configuration.AppConfig;
import org.testng.Assert;

/**
 *
 * @author kurvin
 */
public class AssertArrayServiceTest {
    
    public AssertArrayServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    int [] data;
    int [] comp;
    public static AssertArrayService Aas;
    
    @Test
    public void checkSendNum(){
        data = new int[]{Aas.sendNum(56), Aas.sendNum(78)};
        comp = new int[]{Aas.sendNum(512), Aas.sendNum(785)};
        Assert.assertNotEquals(data, comp);
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Aas = (AssertArrayService) ctx.getBean("AA");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
