package com.hcy;

import static org.junit.Assert.assertTrue;

import com.hcy.controller.EngineController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private Logger logger = LoggerFactory.getLogger(AppTest.class);
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        EngineController engineController = new EngineController();
        String process = engineController.process("10001", "man", 29);
        logger.info("测试结果：{}", process);
    }
}
