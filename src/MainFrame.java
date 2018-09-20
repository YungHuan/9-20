import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private Container cp ;
    private JButton jbn =new JButton("exit");
    private JButton jbn2 =new JButton("=");
    private JLabel jl =new JLabel("攝氏");
    private JLabel jl1 =new JLabel("華氏");
    private JTextField jtf =new JTextField();
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        cp = this.getContentPane();
        cp.add(jbn);
        cp.add(jbn2);
        cp.add(jl);
        cp.add(jl1);
        cp.add(jtf);
        jbn.setBounds(200,300,100,50);
        jl.setBounds(50,200,100,50);
        jtf.setBounds(150,200,100,50);
        jbn2.setBounds(250,200,100,50);
        jl1.setBounds(350,200,100,50);
        jbn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float x =Float.parseFloat(jtf.getText());
                x=x*9/5+32;
                jl1.setText(Float.toString(x)+"華氏");
            }
        });

    }
}
