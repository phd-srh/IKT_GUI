import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private final JLabel meinText;

    public MainWindow() {
        setTitle("Mein Fenster");
        setSize(400, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout( new BorderLayout() );

        meinText = new JLabel("Das ist langweiliger Text");
        JButton meinButton = new JButton("Button");
        add( meinText, BorderLayout.NORTH );
        add( meinButton, BorderLayout.SOUTH );
        meinButton.addActionListener( this::buttonKlicked );

        setVisible(true);
    }

    void buttonKlicked(ActionEvent e) {
        meinText.setFont(
                new Font(
                        meinText.getFont().getFontName(),
                        meinText.getFont().getStyle(),
                        meinText.getFont().getSize()-1
                ));
    }
}
