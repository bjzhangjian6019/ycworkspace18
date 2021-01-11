package cn.tedu.exec;
import org.junit.Test;
import cn.tedu.qr.CreateQR;

/**
* @author 作者：bjzhangjian
* @email  邮箱：bjzhangjian01@126.com
* @version v1.1.0
* @time   时间：2021年1月11日 下午3:26:08
* @description 描述：
* ----------------------中间休息：15:40-----------------
*/
public class TestQRCode {
	
	//main方法
	public static void main(String[] args) {
		System.out.println("生成二维码");
	}
	
	//单元测试方法：双击选中方法的名,右键run as 运行的时候，找到Junit test
	@Test
	public void testQR() {
		System.out.println("单元测试方法1----testQR()");
		//String url = "今天跟着张老师在学习";//二维码扫码出来的内容
		String url = "http://www.tedu.cn";//二维码扫码出来的内容
		//二维码存放的本地地址+二维码图片的名称.png
		String fileName = "E:\\ycworkspace\\work18\\ycworkspace18\\WebContent\\qr.png";
		//创建二维码---宽：200、高:200  
		CreateQR.create(200, 200, url, fileName);
		System.out.println("创建成功的二维码");
	}
	
	@Test
	public void testWR() {
		System.out.println("单元测试方法2----testWR()");
	}
	
	
}
