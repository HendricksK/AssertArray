/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.assertarray.service.Impl;

import cputgroup3a.assertarray.service.AssertArrayService;

/**
 *
 * @author kurvin
 */
public class AssertArrayServiceImpl implements AssertArrayService{
    
    int randomNum = 65;
    
    @Override
    public int sendNum(int x){
        return randomNum = randomNum + x;
    }
}
