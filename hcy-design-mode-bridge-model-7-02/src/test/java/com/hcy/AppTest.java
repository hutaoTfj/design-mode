package com.hcy;

import static org.junit.Assert.assertTrue;

import com.hcy.entity.AliPay;
import com.hcy.entity.Pay;
import com.hcy.entity.WeChatPay;
import com.hcy.model.PayFaceMode;
import com.hcy.model.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

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
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WeChatPay(new PayFaceMode());
        wxPay.transfer("we-chat-0-01", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new AliPay(new PayFingerprintMode());
        zfbPay.transfer("ali-0-01","100000109894",new BigDecimal(100));
    }
}
