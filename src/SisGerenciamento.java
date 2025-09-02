import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class SisGerenciamento {
    // Variáveis do programa
    public static ArrayList<Cliente> listacliente;
    public static ArrayList<Produto> listaproduto;
    public static ArrayList<Fornecedor> listafornecedor;

    public static JTable jtblcliente = new JTable();
    public static JScrollPane scrollcliente = new JScrollPane(jtblcliente);

    public static JTable jtblproduto = new JTable();
    public static JScrollPane scrollProduto = new JScrollPane(jtblproduto);

    public static JTable jtblfornecedor = new JTable();
    public static JScrollPane scrollFornecedor = new JScrollPane(jtblfornecedor);

    // Funções de manipulação dos dados
    public static void tblCliente() { // Atualiza os dados da tabela cliente
        DefaultTableModel modeloCli = new DefaultTableModel(new Object[] { "Matricula", "Nome", "Telefone", "Email" },
                0);
        for (int i = 0; i < listacliente.size(); i++) {
            Object linhaCli[] = new Object[] { listacliente.get(i).getMat(),
                    listacliente.get(i).getNome(),
                    listacliente.get(i).getFone(),
                    listacliente.get(i).getEmail() };
            modeloCli.addRow(linhaCli);
        }
        jtblcliente.setModel(modeloCli);
        jtblcliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jtblcliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtblcliente.getColumnModel().getColumn(1).setPreferredWidth(225);
        jtblcliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        jtblcliente.getColumnModel().getColumn(3).setPreferredWidth(142);
    }

    // Atualiza os dados da tabela produto
    public static void tblProduto() {
        DefaultTableModel modeloPro = new DefaultTableModel(
                new Object[] { "Codigo", "Descrição", "Unidade", "Quantidade", "Preço" }, 0);
        for (int i = 0; i < listaproduto.size(); i++) {
            Object linhaPro[] = new Object[] { listaproduto.get(i).getCod(),
                    listaproduto.get(i).getDescri(),
                    listaproduto.get(i).getUni(),
                    listaproduto.get(i).getQtd(),
                    listaproduto.get(i).getPreco() };
            modeloPro.addRow(linhaPro);
        }
        jtblproduto.setModel(modeloPro);
        jtblproduto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jtblproduto.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtblproduto.getColumnModel().getColumn(1).setPreferredWidth(250);
        jtblproduto.getColumnModel().getColumn(2).setPreferredWidth(75);
        jtblproduto.getColumnModel().getColumn(3).setPreferredWidth(75);
        jtblproduto.getColumnModel().getColumn(4).setPreferredWidth(67);
    }

    // Atualiza os dados da tabela fornecedor
    public static void tblFornecedor() {
        DefaultTableModel modeloFor = new DefaultTableModel(
                new Object[] { "Código", "Nome", "Contato", "Telefone", "Email" }, 0);
        for (int i = 0; i < listafornecedor.size(); i++) {
            Object linhaFor[] = new Object[] { listafornecedor.get(i).getCod(),
                    listafornecedor.get(i).getNome(),
                    listafornecedor.get(i).getContato(),
                    listafornecedor.get(i).getFone(),
                    listafornecedor.get(i).getEmail() };
            modeloFor.addRow(linhaFor);
        }
        jtblfornecedor.setModel(modeloFor);
        jtblfornecedor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jtblfornecedor.getColumnModel().getColumn(0).setPreferredWidth(40);
        jtblfornecedor.getColumnModel().getColumn(1).setPreferredWidth(200);
        jtblfornecedor.getColumnModel().getColumn(2).setPreferredWidth(75);
        jtblfornecedor.getColumnModel().getColumn(3).setPreferredWidth(100);
        jtblfornecedor.getColumnModel().getColumn(4).setPreferredWidth(102);
    }

    public static void main(String[] args) throws Exception {

        FormPrincipal f1 = new FormPrincipal();

        listacliente = new ArrayList();
        listaproduto = new ArrayList();
        listafornecedor = new ArrayList();

        JTabbedPane jtpmenu = new JTabbedPane();
        jtpmenu.setSize(545, 500);
        jtpmenu.setLocation(20, 10);

        // Painel aba Cliente
        JPanel jpnlcliente = new JPanel();
        jpnlcliente.setLayout(null);
        // Painel aba Produto
        JPanel jpnlproduto = new JPanel();
        jpnlproduto.setLayout(null);
        // Painel aba Fornecedor
        JPanel jpnlfornecedor = new JPanel();
        jpnlfornecedor.setLayout(null);

        jtpmenu.addTab("Cliente", jpnlcliente);
        jtpmenu.addTab("Produto", jpnlproduto);
        jtpmenu.addTab("Fornecedor", jpnlfornecedor);

        f1.add(jtpmenu);

        scrollcliente.setSize(520, 118);
        scrollcliente.setLocation(10, 10);

        // Configuração do painel do cliente
        jpnlcliente.add(scrollcliente);

        JPanel jpnlcadastro = new JPanel();
        jpnlcliente.add(jpnlcadastro);

        jpnlcadastro.setSize(520, 318);
        jpnlcadastro.setLocation(10, 150);
        jpnlcadastro.setLayout(null);
        tblCliente();
        Border borda = BorderFactory.createLineBorder(Color.BLACK, 1);

        jpnlcadastro.setBorder(borda);

        // Declaração dos Labels
        JLabel jlblcodigo = new JLabel("Matricula: ");
        jlblcodigo.setSize(70, 20);
        jlblcodigo.setLocation(10, 20);
        jpnlcadastro.add(jlblcodigo);

        JLabel jlblnome = new JLabel("Nome: ");
        jlblnome.setSize(50, 20);
        jlblnome.setLocation(120, 20);
        jpnlcadastro.add(jlblnome);

        JLabel jlbltelefone = new JLabel("Telefone: ");
        jlbltelefone.setSize(100, 20);
        jlbltelefone.setLocation(10, 50);
        jpnlcadastro.add(jlbltelefone);

        JLabel jlblemail = new JLabel("Email: ");
        jlblemail.setSize(50, 20);
        jlblemail.setLocation(170, 50);
        jpnlcadastro.add(jlblemail);

        JLabel jlblendereco = new JLabel("Endereço: ");
        jlblendereco.setSize(50, 20);
        jlblendereco.setLocation(10, 80);
        jpnlcadastro.add(jlblendereco);

        // Declaração dos JTextFields
        JTextField jtfcodigo = new JTextField();
        jtfcodigo.setSize(50, 25);
        jtfcodigo.setLocation(70, 20);
        jpnlcadastro.add(jtfcodigo);

        JTextField jtfnome = new JTextField();
        jtfnome.setSize(230, 25);
        jtfnome.setLocation(160, 20);
        jpnlcadastro.add(jtfnome);

        JTextField jtftelefone = new JTextField();
        jtftelefone.setSize(90, 25);
        jtftelefone.setLocation(70, 50);
        jpnlcadastro.add(jtftelefone);

        JTextField jtfemail = new JTextField();
        jtfemail.setSize(180, 25);
        jtfemail.setLocation(210, 50);
        jpnlcadastro.add(jtfemail);

        JTextField jtfendereco = new JTextField();
        jtfendereco.setSize(320, 25);
        jtfendereco.setLocation(70, 80);
        jpnlcadastro.add(jtfendereco);

        // Declaração dos Botões
        JButton jbtnExcluirCliente = new JButton("Excluir");
        jbtnExcluirCliente.setSize(100, 25);
        jbtnExcluirCliente.setLocation(410, 20);
        jpnlcadastro.add(jbtnExcluirCliente);

        JButton jbtnsalvar = new JButton("Salvar");
        jbtnsalvar.setSize(100, 25);
        jbtnsalvar.setLocation(410, 60);
        jpnlcadastro.add(jbtnsalvar);

        JButton jbtnnovo = new JButton("Novo");
        jbtnnovo.setSize(100, 25);
        jbtnnovo.setLocation(410, 100);
        jpnlcadastro.add(jbtnnovo);

        JButton jbtncancelar = new JButton("Cancelar");
        jbtncancelar.setSize(100, 25);
        jbtncancelar.setLocation(410, 140);
        jpnlcadastro.add(jbtncancelar);

        JButton jbtneditar = new JButton("Editar");
        jbtneditar.setSize(100, 25);
        jbtneditar.setLocation(410, 180);
        jpnlcadastro.add(jbtneditar);
        // ---------------------------------------------------------------------------------

        // Produto

        scrollProduto.setSize(520, 118);
        scrollProduto.setLocation(10, 10);

        jpnlproduto.add(scrollProduto);

        // Configuração do painel
        JPanel jpnlcadastroproduto = new JPanel();
        jpnlproduto.add(jpnlcadastroproduto);

        jpnlcadastroproduto.setSize(520, 318);
        jpnlcadastroproduto.setLocation(10, 150);
        jpnlcadastroproduto.setLayout(null);

        jpnlcadastroproduto.setBorder(borda);

        tblProduto();

        // Declaração dos Labels do produto
        JLabel jlblcodproduto = new JLabel("Codigo: ");
        jlblcodproduto.setSize(50, 20);
        jlblcodproduto.setLocation(10, 20);
        jpnlcadastroproduto.add(jlblcodproduto);

        JLabel jlbldescriproduto = new JLabel("Descrição: ");
        jlbldescriproduto.setSize(250, 20);
        jlbldescriproduto.setLocation(10, 80);
        jpnlcadastroproduto.add(jlbldescriproduto);

        JLabel jlbluniproduto = new JLabel("Unidade: ");
        jlbluniproduto.setSize(100, 20);
        jlbluniproduto.setLocation(180, 20);
        jpnlcadastroproduto.add(jlbluniproduto);

        JLabel jlblqtdproduto = new JLabel("Quantidade: ");
        jlblqtdproduto.setSize(100, 20);
        jlblqtdproduto.setLocation(10, 50);
        jpnlcadastroproduto.add(jlblqtdproduto);

        JLabel jlblprecoproduto = new JLabel("Preço: ");
        jlblprecoproduto.setSize(100, 20);
        jlblprecoproduto.setLocation(215, 50);
        jpnlcadastroproduto.add(jlblprecoproduto);

        // Declaração dos JTextFields do produto
        JTextField jtfcodproduto = new JTextField();
        jtfcodproduto.setSize(95, 25);
        jtfcodproduto.setLocation(80, 20);
        jpnlcadastroproduto.add(jtfcodproduto);

        JTextField jtfdescriproduto = new JTextField();
        jtfdescriproduto.setSize(320, 25);
        jtfdescriproduto.setLocation(80, 80);
        jpnlcadastroproduto.add(jtfdescriproduto);

        JTextField jtfuniproduto = new JTextField();
        jtfuniproduto.setSize(165, 25);
        jtfuniproduto.setLocation(235, 20);
        jpnlcadastroproduto.add(jtfuniproduto);

        JTextField jtfqtdproduto = new JTextField("");
        jtfqtdproduto.setSize(125, 25);
        jtfqtdproduto.setLocation(80, 50);
        jpnlcadastroproduto.add(jtfqtdproduto);

        JTextField jtfprecoproduto = new JTextField("");
        jtfprecoproduto.setSize(145, 25);
        jtfprecoproduto.setLocation(255, 50);
        jpnlcadastroproduto.add(jtfprecoproduto);
        // ----------------------------------------------------------------

        // Fornecedor

        // Configuração do Painel do Fornecedor
        JPanel jpnlcadastrofornecedor = new JPanel();
        jpnlfornecedor.add(jpnlcadastrofornecedor);
        tblFornecedor();

        jpnlcadastrofornecedor.setSize(520, 318);
        jpnlcadastrofornecedor.setLocation(10, 150);
        jpnlcadastrofornecedor.setLayout(null);

        jpnlcadastrofornecedor.setBorder(borda);

        // Declaração dos Labels do Fornecedor
        JLabel jlblcodfornecedor = new JLabel("Codigo: ");
        jlblcodfornecedor.setSize(50, 20);
        jlblcodfornecedor.setLocation(10, 20);
        jpnlcadastrofornecedor.add(jlblcodfornecedor);

        JLabel jlblnomefornecedor = new JLabel("Empresa: ");
        jlblnomefornecedor.setSize(250, 20);
        jlblnomefornecedor.setLocation(10, 80);
        jpnlcadastrofornecedor.add(jlblnomefornecedor);

        JLabel jlblcontatofornecedor = new JLabel("Contato: ");
        jlblcontatofornecedor.setSize(100, 20);
        jlblcontatofornecedor.setLocation(180, 20);
        jpnlcadastrofornecedor.add(jlblcontatofornecedor);

        JLabel jlbltelefornecedor = new JLabel("Telefone: ");
        jlbltelefornecedor.setSize(100, 20);
        jlbltelefornecedor.setLocation(10, 50);
        jpnlcadastrofornecedor.add(jlbltelefornecedor);

        JLabel jlblemailfornecedor = new JLabel("Email: ");
        jlblemailfornecedor.setSize(100, 20);
        jlblemailfornecedor.setLocation(195, 50);
        jpnlcadastrofornecedor.add(jlblemailfornecedor);

        // Declaração do JTextField do Fornecedor
        JTextField jtfcodfornecedor = new JTextField();
        jtfcodfornecedor.setSize(95, 25);
        jtfcodfornecedor.setLocation(80, 20);
        jpnlcadastrofornecedor.add(jtfcodfornecedor);

        JTextField jtfnomefornecedor = new JTextField();
        jtfnomefornecedor.setSize(320, 25);
        jtfnomefornecedor.setLocation(80, 80);
        jpnlcadastrofornecedor.add(jtfnomefornecedor);

        JTextField jtfcontatofornecedor = new JTextField();
        jtfcontatofornecedor.setSize(165, 25);
        jtfcontatofornecedor.setLocation(235, 20);
        jpnlcadastrofornecedor.add(jtfcontatofornecedor);

        JTextField jtftelefornecedor = new JTextField();
        jtftelefornecedor.setSize(105, 25);
        jtftelefornecedor.setLocation(80, 50);
        jpnlcadastrofornecedor.add(jtftelefornecedor);

        JTextField jtfemailfornecedor = new JTextField();
        jtfemailfornecedor.setSize(165, 25);
        jtfemailfornecedor.setLocation(235, 50);
        jpnlcadastrofornecedor.add(jtfemailfornecedor);

        // Declaração dos Botões do Fornecedor
        JButton jbtnlimparfornecedor = new JButton("Excluir");
        jbtnlimparfornecedor.setSize(100, 25);
        jbtnlimparfornecedor.setLocation(410, 20);
        jpnlcadastrofornecedor.add(jbtnlimparfornecedor);

        JButton jbtnsalvarfornecedor = new JButton("Salvar");
        jbtnsalvarfornecedor.setSize(100, 25);
        jbtnsalvarfornecedor.setLocation(410, 60);
        jpnlcadastrofornecedor.add(jbtnsalvarfornecedor);

        JButton jbtnnovofornecedor = new JButton("Novo");
        jbtnnovofornecedor.setSize(100, 25);
        jbtnnovofornecedor.setLocation(410, 100);
        jpnlcadastrofornecedor.add(jbtnnovofornecedor);

        JButton jbtncancelarfornecedor = new JButton("Cancelar");
        jbtncancelarfornecedor.setSize(100, 25);
        jbtncancelarfornecedor.setLocation(410, 140);
        jpnlcadastrofornecedor.add(jbtncancelarfornecedor);

        JButton jbtneditarfornecedor = new JButton("Editar");
        jbtneditarfornecedor.setSize(100, 25);
        jbtneditarfornecedor.setLocation(410, 180);
        jpnlcadastrofornecedor.add(jbtneditarfornecedor);

        // Métodos de tratamento dos eventos
        // Botão Limpar do Cliente
        jbtnExcluirCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int op = JOptionPane.showConfirmDialog(null, "Você deseja realmente apagar esse cliente", "Apagar",
                        JOptionPane.YES_NO_OPTION);
                if (op == JOptionPane.YES_OPTION) {
                    int index = jtblcliente.getSelectedRow();
                    listacliente.remove(index);
                    tblCliente();
                }
            }

        });

        // Botão salvar do Cliente
        jbtnsalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = jtfcodigo.getText();
                String nome = jtfnome.getText();
                String telefone = jtftelefone.getText();
                String email = jtfemail.getText();

                int a = JOptionPane.showConfirmDialog(null, "Deseja realmente salvar essas informações?\n\n"
                        + "Matricula: " + cod
                        + "\nNome: " + nome
                        + "\nTelefone: " + telefone
                        + "\nEmail: " + email,
                        "confirmar", JOptionPane.YES_NO_OPTION);
                if (a == JOptionPane.YES_OPTION) {
                    Cliente cliente = new Cliente(cod, nome);
                    cliente.setFone(telefone);
                    cliente.setEmail(email);

                    listacliente.add(cliente);
                    tblCliente();
                }

            }
        });

        
        f1.setVisible(true);

    }
}
