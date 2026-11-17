import javax.swing.*;
import java.awt.*;
public class Latihan2_Gender extends JFrame {
    public Latihan2_Gender() {
        super("Salam");
        JTextField txt = new JTextField(12);
        JRadioButton l = new JRadioButton("Laki-laki"), p = new JRadioButton("Perempuan");
        ButtonGroup g = new ButtonGroup(); g.add(l); g.add(p);
        JButton btn = new JButton("Sapa");
        JLabel hasil = new JLabel(" ");
        btn.addActionListener(e -> {
            String nama = txt.getText().trim();
            if (nama.isEmpty()) { hasil.setText("Nama wajib diisi"); }
            else if (l.isSelected()) { hasil.setText("Halo, Bapak " + nama); }
            else if (p.isSelected()) { hasil.setText("Halo, Ibu " + nama); }
            else { hasil.setText("Pilih jenis kelamin dulu"); }
        });
        setLayout(new GridLayout(0, 1, 3, 3));
        add(new JLabel("Nama:")); add(txt); add(l); add(p); add(btn); add(hasil);
        pack(); setLocationRelativeTo(null); setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) { SwingUtilities.invokeLater(() -> new Latihan2_Gender().setVisible(true)); }
}
