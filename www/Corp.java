package xust.www;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * ũ������
 * @author BetterMe1
 *11/09:С��Ϸ����
 */
public class Corp extends JLabel{
	Icon icon=null;//ͼ�����
	public Corp(){
		super();
	}
	public void setIcon(String picture){
		icon=new ImageIcon(picture);//��ȡͼƬ��
		setIcon(icon);//�����齨Ҫ��ʾ��ͼ�꣬������ʾ����״̬
	}
}
