/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.util.test;

import dat.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import static dat.util.MathUtility.*;
/**
 *
 * @author liemn and his friends
 */
public class MathUtilityTest {

    public MathUtilityTest() {
    }
    //viết ra nhứng việc cần làm getFac()
    //kiểm tra xem actual -- expected hay kh
    //dùng cho việc CI-continue Integration
    //dùng cho việc CD-continue Delivery
    //              CT - continue Regression Test
    //              Devops-Development and Operation
    //app liên tục ktr chất lượng code,build ra file .jar,.war
    //đẩy lên server trung gian
    //sau đó đẩy thẳng lên PRODUCTION SERVER, máy chạy thật nơi khách hàng
    // mọi việc sẽ bắt đầu kể từ lúc Developer push code liên tục len Git
    //mọi thứ tự động
    
    @Test // @ nay == public static void main
    // ham nay se show ra mau xanh do
    //Expected 
    public void getFactorial_RunWell_IfValidArgument(){
        assertEquals(1, getFactorial(1));//5! =? 120 co --> xanh
        assertEquals(1, getFactorial(0));
        assertEquals(9, getFactorial(5));
        assertSame("", "");
        
    }
    
    
}
