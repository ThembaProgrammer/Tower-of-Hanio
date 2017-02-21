
import javax.swing.JFrame;
/**
 * @author thembalakhe
 */
public class Test extends JFrame
{
    public Test()
    {   
        setResizable(false);
        
        setTitle("Towers Of Hanoi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());
       
        java.awt.Image icon =new javax.swing.ImageIcon(getClass().getResource("/towers.png")).getImage();
        setIconImage(icon);
        
        
        SettingsPanel settings=new SettingsPanel();
        SidePane pane=new SidePane(settings);
        Playing playing=new Playing(pane);
        settings.initPlaying(playing);
        StartingPanel starting=new StartingPanel(playing);
        add(starting);
        add(playing);
        
    }
    
    /*public static void main(String[] args)
    {
        Test frame=new Test();
      
        
        frame.setVisible(true);*/
        
        public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } 
      catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } 
      catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } 
      catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } 
      catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
  
        /* Create and display the form */
      java.awt.EventQueue.invokeLater(
            new Runnable() {
               public void run() {
                   Test frame=new Test();
                   frame.setBackground(new java.awt.Color(0,150,255));
                   frame.setLocationRelativeTo(null);
                   frame. setSize(900,435);
                   frame.setVisible(true);
                   
               }
            });     
   }     
    //}
    
}
