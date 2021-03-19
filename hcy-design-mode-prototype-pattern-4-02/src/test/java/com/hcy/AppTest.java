package com.hcy;

import static org.junit.Assert.assertTrue;

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
    public void shouldAnswerWithTrue() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("张三", "2019002101"));
        System.out.println(questionBankController.createPaper("李四", "2019002102"));
        System.out.println(questionBankController.createPaper("王五", "2019002103"));
    }
}
