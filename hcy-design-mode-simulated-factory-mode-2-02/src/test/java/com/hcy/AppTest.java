package com.hcy;

import static org.junit.Assert.assertTrue;

import com.hcy.factory.JDKProxy;
import com.hcy.factory.impl.EGMCacheAdapter;
import com.hcy.factory.impl.IIRCacheAdapter;
import com.hcy.service.CacheService;
import com.hcy.service.impl.CacheServiceImpl;
import org.junit.Test;

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
    public void test() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("10001","晓寻遥");
        String val01 = proxy_EGM.get("10001");
        System.out.println(val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("10002","晓寻遥");
        String val02 = proxy_IIR.get("10002");
        System.out.println(val02);
    }
}
