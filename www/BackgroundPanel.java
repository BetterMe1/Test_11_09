package xust.www;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 * 背景面板
 * @author BetterMe1
 *11/09:小游戏初步
 */
public class BackgroundPanel extends JPanel {
	private Image image;//背景图片；
	//构造方法
	public BackgroundPanel(){
		super();
		setOpaque(false);
		setLayout(null);
	}
	//设置图片的方法
	public void setImage(Image image){
		this.image=image;
	}
	protected void paintComponent(Graphics g){//重写绘制组建外观
		if(image!=null){
			int width=getWidth();//获取组建大小
			int height=getHeight();
			g.drawImage(image, 0, 0, width, height, this);//绘制图片与组建大中小相同		
		}
		super.paintComponent(g);//执行超类方法
	}
}
