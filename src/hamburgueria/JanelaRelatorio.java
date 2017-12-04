package hamburgueria;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class JanelaRelatorio extends JFrame {

    private Controlador janelaMesa;
    private String linha;
    private StringBuilder bg;
    private JButton btnConfirma = new JButton("Voltar ao menu anterior");
    private JButton btnSalvar = new JButton("Salvar modificações");
    private JButton btnRelatorio = new JButton("Gerar Relatorio");
    private JPanel pnRelatorio = new JPanel();

    public JanelaRelatorio(Controlador j) throws HeadlessException {
        super("Relatório");
        setMinimumSize(new Dimension(1200, 600));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.janelaMesa = j;
        JTextArea txtRelatorio = new JTextArea("");

        //pnRelatorio.add();
        add(new JScrollPane(txtRelatorio), BorderLayout.CENTER);

        JPanel pnBotoes = new JPanel(new GridLayout(1, 1));
        pnBotoes.add(btnRelatorio);
        pnBotoes.add(btnConfirma);
        pnBotoes.add(btnSalvar);
        add(pnBotoes, BorderLayout.SOUTH);
        /*ESCREVE RELATORIO*/
        btnRelatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                FileReader arq = null;
                try {
                    arq = new FileReader("relatorio.txt");
                    BufferedReader br = new BufferedReader(arq);
                    StringBuilder sb = new StringBuilder();

                    try {
                        while ((linha = br.readLine()) != null) {
                            sb.append(linha).append("\n");

                        }

                    } catch (IOException ex) {
                        Logger.getLogger(JanelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    txtRelatorio.setText(sb.toString());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JanelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        arq.close();
                    } catch (IOException ex) {
                        Logger.getLogger(JanelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        });

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    FileWriter fw = new FileWriter("relatorio.txt");
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(txtRelatorio.getText());
                    bw.flush();
                    txtRelatorio.setText("");

                    JOptionPane.showMessageDialog(null, "Suas alterações foram efetuadas", "Suas alterações foram efetuadas", JOptionPane.OK_OPTION);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JanelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(JanelaRelatorio.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        btnConfirma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                janelaMesa.setVisible(true);
                dispose();

            }

        });

    }

}
