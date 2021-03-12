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
        
        Assertions.assertThrows(NumberFormatException.class,()->productionGenerator.createProduction('a',7));
    }

    @Test
    void createProductionTest4(){
        
        Assertions.assertThrows(NumberFormatException.class,()->productionGenerator.createProduction(-9,95));
    }

    @Test
    void createProductionTest5(){
        
        Assertions.assertThrows(NumberFormatException.class,()->productionGenerator.createProduction(93,2));
    }

}
