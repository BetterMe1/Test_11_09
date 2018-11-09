package xust.www;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 * �������
 * @author BetterMe1
 *11/09:С��Ϸ����
 */
public class BackgroundPanel extends JPanel {
	private Image image;//����ͼƬ��
	//���췽��
	public BackgroundPanel(){
		super();
		setOpaque(false);
		setLayout(null);
	}
	//����ͼƬ�ķ���
	public void setImage(Image image){
		this.image=image;
	}
	protected void paintComponent(Graphics g){//��д�����齨���
		if(image!=null){
			int width=getWidth();//��ȡ�齨��С
			int height=getHeight();
			g.drawImage(image, 0, 0, width, height, this);//����ͼƬ���齨����С��ͬ		
		}
		super.paintComponent(g);//ִ�г��෽��
	}
}
