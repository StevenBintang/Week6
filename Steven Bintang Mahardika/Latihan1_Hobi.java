import javax.swing.*;
import java.awt.*;
public class Latihan1_Hobi extends JFrame {
    public Latihan1_Hobi() {
        super("Hobi");
        JCheckBox a = new JCheckBox("Musik"), b = new JCheckBox("Olahraga"), c = new JCheckBox("Membaca"), d = new JCheckBox("Game");
        JButton btn = new JButton("Tampilkan");
        btn.addActionListener(e -> {
            String daftar = "";
            if (a.isSelected()) { daftar += "Musik "; }
            if (b.isSelected()) { daftar += "Olahraga "; }
            if (c.isSelected()) { daftar += "Membaca "; }
            if (d.isSelected()) { daftar += "Game "; }
            if (daftar.isEmpty()) { JOptionPane.showMessageDialog(this, "Belum memilih hobi."); }
            else { JOptionPane.showMessageDialog(this, "Hobimu: " + daftar.trim()); }
        });
        setLayout(new GridLayout(0, 1, 3, 3));
        add(a); add(b); add(c); add(d); add(btn);
        pack(); setLocationRelativeTo(null); setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) { SwingUtilities.invokeLater(() -> new Latihan1_Hobi().setVisible(true)); }
}
