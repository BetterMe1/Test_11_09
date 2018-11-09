package xust.www;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 农作物类
 * @author BetterMe1
 *11/09:小游戏初步
 */
public class Corp extends JLabel{
	Icon icon=null;//图标对象；
	public Corp(){
		super();
	}
	public void setIcon(String picture){
		icon=new ImageIcon(picture);//获取图片；
		setIcon(icon);//设置组建要显示的图标，用于显示作物状态
	}
}
