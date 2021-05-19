package com.ck;

import static org.junit.Assert.assertTrue;

import com.ck.dao.impl.SusheDaoImpl;
import com.ck.entity.Sushe;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1(){
        List<Sushe> suSheList =
                new SusheDaoImpl().queryAll();
        System.out.println(suSheList);
    }
}
