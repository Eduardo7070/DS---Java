package ProjetoDS;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Eventos extends Agenda {

    private List<Agenda> eventos;

    public Eventos(String dia, String mes, String ano, String nome, String desc) {
        super(dia, mes, ano, nome, desc);
        eventos = new ArrayList<>();
    }

    public void Rotinas() {
        Object[] options = {"Agendar Evento", "Exibir Eventos", "Deletar Evento", "Sair"};

        JComboBox<Object> comboBox = new JComboBox<>(options);
        comboBox.setSelectedIndex(0);

        int option = JOptionPane.showOptionDialog(null, comboBox, "Selecione a Rotina", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (option == 0) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do evento", "Agendar Evento", JOptionPane.QUESTION_MESSAGE);
            String dia = JOptionPane.showInputDialog(null, "Digite o dia do evento", "Agendar Evento", JOptionPane.QUESTION_MESSAGE);
            String mes = JOptionPane.showInputDialog(null, "Digite o mês do evento", "Agendar Evento", JOptionPane.QUESTION_MESSAGE);
            String ano = JOptionPane.showInputDialog(null, "Digite o ano do evento", "Agendar Evento", JOptionPane.QUESTION_MESSAGE);
            String desc = JOptionPane.showInputDialog(null, "Digite a descrição do evento", "Agendar Evento", JOptionPane.QUESTION_MESSAGE);

            Agenda evento = new Agenda(dia, mes, ano, nome, desc);
            eventos.add(evento);

            JOptionPane.showMessageDialog(null, "Evento agendado com sucesso!", "Agenda", JOptionPane.INFORMATION_MESSAGE);

            Rotinas();
        } else if (option == 1) {
            if (eventos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum evento agendado.", "Eventos Agendados", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String eventosTexto = "Eventos Agendados:\n\n";
                for (Agenda evento : eventos) {
                    eventosTexto += "Evento: " + evento.getNome() + "\nData: " + evento.getDia() + "/" + evento.getMes() + "/" + evento.getAno() + "\nDescrição: " + evento.getDesc() + "\n\n";
                }
                JOptionPane.showMessageDialog(null, eventosTexto, "Eventos Agendados", JOptionPane.INFORMATION_MESSAGE);
            }

            Rotinas();
        } else if (option == 2) {
            if (eventos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum evento agendado para deletar.", "Deletar Evento", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String[] optionsDeletar = new String[eventos.size()];
                for (int i = 0; i < eventos.size(); i++) {
                    optionsDeletar[i] = eventos.get(i).getNome();
                }

                JComboBox<Object> comboBoxDeletar = new JComboBox<>(optionsDeletar);
                comboBoxDeletar.setSelectedIndex(0);

                int optionDeletar = JOptionPane.showOptionDialog(null, comboBoxDeletar, "Selecione o evento a ser deletado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsDeletar, optionsDeletar[0]);

                if (optionDeletar >= 0) {
                    eventos.remove(optionDeletar);
                    JOptionPane.showMessageDialog(null, "Evento deletado com sucesso!", "Deletar Evento", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            Rotinas();
        } else if (option == 3) {
            return;
        }
    }
}