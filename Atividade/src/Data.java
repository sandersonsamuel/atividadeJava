public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getDataFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
