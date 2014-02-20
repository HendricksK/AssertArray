/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.assertarray.configuration;

import cputgroup3a.assertarray.service.AssertArrayService;
import cputgroup3a.assertarray.service.Impl.AssertArrayServiceImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurvin
 */
public class ApppConfig {
    @Bean(name="AA")
    public AssertArrayService getService(){
        return new AssertArrayServiceImpl();
    } 
}
