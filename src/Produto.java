public class Produto {

    private String cod;
    private String descri;
    private String uni;
    private String gtd;
    private String preco;


    public Produto(String cod, String descri) {
        this.cod = cod;
        this.descri = descri;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getGtd() {
        return gtd;
    }

    public void setGtd(String gtd) {
        this.gtd = gtd;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public Object getQtd() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getQtd'");
    }
}
