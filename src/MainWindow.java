import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Mein Fenster");
        setSize(400, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout( new BorderLayout() );

        JLabel meinText = new JLabel("Das ist langweiliger Text");
        JButton meinButton = new JButton("Button");
        add( meinText, BorderLayout.NORTH );
        add( meinButton, BorderLayout.SOUTH );
        meinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meinText.setFont(
                        new Font(
                                meinText.getFont().getFontName(),
                                meinText.getFont().getStyle(),
                                meinText.getFont().getSize()+1
                        ));
            }
        });

        setVisible(true);
    }
}
