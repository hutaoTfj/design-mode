package com.hcy;

import static org.junit.Assert.assertTrue;

import com.hcy.service.CacheService;
import com.hcy.service.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue( true );
    }

    @Test
    public void test_CacheService(){
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("10001","晓寻遥",1);
        String s = cacheService.get("10001", 1);
        System.out.println(s);
    }
}
