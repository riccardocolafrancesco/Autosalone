public class Auto {
    private String targa;
    private String nome;
    private String azienda;
    private int anno_c;
    private int posti_auto;
    private double prezzo;

    public Auto(String targa, String nome, String azienda, int anno_c, int posti_auto, double prezzo) {
        this.targa = targa;
        this.nome = nome;
        this.azienda = azienda;
        this.anno_c = anno_c;
        this.posti_auto = posti_auto;
        this.prezzo = prezzo;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public int getAnno_c() {
        return anno_c;
    }

    public void setAnno_c(int anno_c) {
        this.anno_c = anno_c;
    }

    public int getPosti_auto() {
        return posti_auto;
    }

    public void setPosti_auto(int posti_auto) {
        this.posti_auto = posti_auto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
