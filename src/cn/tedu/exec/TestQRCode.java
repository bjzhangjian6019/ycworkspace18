package cn.tedu.exec;
import org.junit.Test;
import cn.tedu.qr.CreateQR;

/**
* @author ���ߣ�bjzhangjian
* @email  ���䣺bjzhangjian01@126.com
* @version v1.1.0
* @time   ʱ�䣺2021��1��11�� ����3:26:08
* @description ������
* ----------------------�м���Ϣ��15:40-----------------
*/
public class TestQRCode {
	
	//main����
	public static void main(String[] args) {
		System.out.println("���ɶ�ά��");
	}
	
	//��Ԫ���Է�����˫��ѡ�з�������,�Ҽ�run as ���е�ʱ���ҵ�Junit test
	@Test
	public void testQR() {
		System.out.println("��Ԫ���Է���1----testQR()");
		//String url = "�����������ʦ��ѧϰ";//��ά��ɨ�����������
		String url = "http://www.tedu.cn";//��ά��ɨ�����������
		//��ά���ŵı��ص�ַ+��ά��ͼƬ������.png
		String fileName = "E:\\ycworkspace\\work18\\ycworkspace18\\WebContent\\qr.png";
		//������ά��---��200����:200  
		CreateQR.create(200, 200, url, fileName);
		System.out.println("�����ɹ��Ķ�ά��");
	}
	
	@Test
	public void testWR() {
		System.out.println("��Ԫ���Է���2----testWR()");
	}
	
	
}
