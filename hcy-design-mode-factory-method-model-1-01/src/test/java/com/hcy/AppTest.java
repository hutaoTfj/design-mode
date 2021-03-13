package com.hcy;

import static org.junit.Assert.assertTrue;

import com.alibaba.fastjson.JSON;
import com.hcy.controller.PrizeController;
import com.hcy.entity.AwardReq;
import com.hcy.entity.AwardRes;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

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
        assertTrue( true );
    }

    @Test
    public void test_PrizeController(){
        PrizeController prizeController = new PrizeController();
        System.out.println("\r\n 模拟发放优惠券的测试 \r\n");
        //开始模拟发放优惠券
        AwardReq req_01 = new AwardReq();
        req_01.setUId("10001");
        req_01.setAwardType(1);
        req_01.setAwardNumber("EGM12345678901234567890");
        req_01.setBizId("12313131321313");
        AwardRes awardRes_01 = prizeController.awardToUser(req_01);
        logger.info("请求参数：{}", JSON.toJSON(req_01));
        logger.info("测试结果：{}", JSON.toJSON(awardRes_01));

        System.out.println("\r\n 模拟发放实物商品的测试 \r\n");
        AwardReq req_02 = new AwardReq();
        req_02.setUId("10002");
        req_02.setAwardType(1);
        req_02.setAwardNumber("EGM12345678901234567890");
        req_02.setBizId("12313131321313");
        Map<String, String> extMap = new HashMap<>();
        extMap.put("consigneeUserName","飞机");
        extMap.put("consigneeUserPhone","12345678901");
        extMap.put("consigneeUserAddress","浙江省");
        req_02.setExtMap(extMap);

        AwardRes awardRes_02 = prizeController.awardToUser(req_02);
        logger.info("请求参数{}",JSON.toJSON(req_02));
        logger.info("测试结果{}",JSON.toJSON(awardRes_02));

        System.out.println("\r\n第三方兑换卡(爱奇艺)\r\n");
        AwardReq req03 = new AwardReq();
        req03.setUId("10001");
        req03.setAwardType(3);
        req03.setAwardNumber("AQY1xjkUodl8LO975GdfrYUio");

        AwardRes awardRes03 = prizeController.awardToUser(req03);
        logger.info("请求参数：{}", JSON.toJSON(req03));
        logger.info("测试结果：{}", JSON.toJSON(awardRes03));
    }
}
