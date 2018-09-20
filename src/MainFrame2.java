import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame2 extends JFrame {
    private Container cp;
    private JLabel jl = new JLabel("game");
    private JPanel jp1 = new JPanel(new GridLayout(1, 1, 3, 3));
    private JPanel jp2 = new JPanel(new GridLayout(3, 3, 3, 3));
    private JButton jb1 = new JButton();
    private JButton jb2 = new JButton();
    private JButton jb3 = new JButton();
    private JButton jb4 = new JButton();
    private JButton jb5 = new JButton();
    private JButton jb6 = new JButton();
    private JButton jb7 = new JButton();
    private JButton jb8 = new JButton();
    private JButton jb9 = new JButton();
    private int x = 0;

    public MainFrame2() {
        init2();
    }

    private void init2() {
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(jp1, BorderLayout.NORTH);
        cp.add(jp2, BorderLayout.CENTER);
        jl.setOpaque(true);
        jl.setBackground(new Color(255, 255, 0));
        jl.setFont(new Font(null, Font.BOLD, 20));
        jb1.setFont(new Font(null, Font.PLAIN, 40));
        jb2.setFont(new Font(null, Font.PLAIN, 40));
        jb3.setFont(new Font(null, Font.PLAIN, 40));
        jb4.setFont(new Font(null, Font.PLAIN, 40));
        jb5.setFont(new Font(null, Font.PLAIN, 40));
        jb6.setFont(new Font(null, Font.PLAIN, 40));
        jb7.setFont(new Font(null, Font.PLAIN, 40));
        jb8.setFont(new Font(null, Font.PLAIN, 40));
        jb9.setFont(new Font(null, Font.PLAIN, 40));
        jp1.add(jl);
        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);
        jp2.add(jb7);
        jp2.add(jb8);
        jp2.add(jb9);
        jb1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                x++;
            }
        });
        jb1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                jb1.setEnabled(false);
                x++;
                check();
            }
        });
        jb2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                x++;
                jb2.setEnabled(false);
                check();
            }
        });
        jb3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                x++;
                jb3.setEnabled(false);
                check();
            }
        });
        jb4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                x++;
                jb4.setEnabled(false);
            }
        });
        jb5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                x++;
                jb5.setEnabled(false);
            }
        });
        jb6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                jb6.setEnabled(false);
                x++;
            }
        });
        jb7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                jb7.setEnabled(false);
                x++;
            }
        });
        jb8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                x++;
                jb8.setEnabled(false);
            }
        });
        jb9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmp = (JButton) e.getSource();
                if (x % 2 == 0) {
                    tmp.setText("O");
                } else {
                    tmp.setText("X");
                }
                x++;
                jb9.setEnabled(false);
            }
        });
    }

    private void check() {
        if (jb1.getText().equals(jb2.getText()) && jb2.getText().equals(jb3.getText()) && jb1.getText().equals(jb3.getText()) && !jb1.getText().equals("")) {
            if (jb1.getText().equals("O")) {
                jl.setText("play1 win");
            } else {
                jl.setText("play2 win");
            }
        }
        if (jb1.getText().equals(jb2.getText()) && jb2.getText().equals(jb3.getText()) && jb1.getText().equals(jb3.getText()) && !jb1.getText().equals("")) {
            if (jb1.getText().equals("O")) {
                jl.setText("play1 win");
            } else {
                jl.setText("play2 win");
            }

        }
    }
}
