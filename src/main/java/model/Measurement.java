package java.model;

import java.util.List;

public class Measurement {
    public int id;
    public long Timestamp;
    public double Valor;
    public int idDispositivo;

    public Measurement(int id, long Timestamp, double Valor, int idDispositivo) {
        this.id = id;
        this.Timestamp = Timestamp;
        this.Valor = Valor;
        this.idDispositivo = idDispositivo;
    }

    public int getId() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public long getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(long Timestamp) {
        this.Timestamp = Timestamp;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(int idDispositivo) {
        this.idDispositivo = idDispositivo
    }
}