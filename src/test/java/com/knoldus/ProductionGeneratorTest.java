package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductionGeneratorTest {

    ProductionGenerator productionGenerator=new ProductionGenerator();

    @Test
    void createProductionTest1() {

        Assertions.assertEquals(6,productionGenerator.createProduction(1,3));
    }

    @Test
    void createProductionTest2(){
        Assertions.assertEquals(11,productionGenerator.createProduction(11,11));
    }

    @Test
    void createProductionTest3(){
        //Assertions.assertEquals("Invalid Number",productionGenerator.createProduction('a',7));
        Assertions.assertThrows(NumberFormatException.class,()->productionGenerator.createProduction('a',7));
    }

    @Test
    void createProductionTest4(){
        //Assertions.assertEquals(0,productionGenerator.createProduction(-9,95));
        Assertions.assertThrows(NumberFormatException.class,()->productionGenerator.createProduction(-9,95));
    }

    @Test
    void createProductionTest5(){
        //Assertions.assertEquals(0,productionGenerator.createProduction(93,2));
        Assertions.assertThrows(NumberFormatException.class,()->productionGenerator.createProduction(93,2));
    }

}