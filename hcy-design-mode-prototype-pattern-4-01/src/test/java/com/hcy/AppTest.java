package com.hcy;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * 测试出现的试卷
     */
    @Test
    public void shouldAnswerWithTrue() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("张三", "2019002101"));
        System.out.println(questionBankController.createPaper("李四", "2019002102"));
        System.out.println(questionBankController.createPaper("王五", "2019002103"));
    }
}
