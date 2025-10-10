import java.awt.*;
import javax.swing.JPanel; //کلاس پایه پنل Swing
public class MyPanel extends JPanel {
    @Override  //بازنویسی می‌کند.
    public void  paintComponent (Graphics g) {   //این نام متد استاندارد Swing  برای رسم محتوا است.(paintComponent)
        //این متد، متد عمومی رسم در AWT و Swing است اگر این خط نباشد اصلا هیچ چیزی را نمیتوانیم نمایش دهیم.
        super.paintComponent(g); //این خط به نسخه اصلی JPanel از paintComponent می‌گوید: «اول محتوای پیش‌فرض خودت  را رسم کن».
        int w=getWidth();
        int h=getHeight();
        g.drawLine(0,0,w,h); //جی اختصار common و استاندارد است برای Graphics.
                                         //از طریق g می‌توانیم رنگ، فونت، ضخامت خطوط و شکل‌ها را کنترل کنیم.
        g.setColor(Color.BLUE);


    }

}
