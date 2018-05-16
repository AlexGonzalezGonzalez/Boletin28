/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

import javax.swing.JOptionPane;

/**
 *
 * @author estudios
 */
public class Alumno {
    
    String nome;
    int nota;
    Enderezo end;

    public Alumno(String nome, int nota, Enderezo end) {
        this.nome = nome;
        this.nota = nota;
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnd() {
        return end;
    }

    public void setEnd(Enderezo end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", nota=" + nota + ", "+end;
    }
    public void cambiarNota(){
        this.nota=Integer.parseInt(JOptionPane.showInputDialog("Nota"));
    }
    
    public static class Enderezo {
        
        String rua;
        int numero;

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public Enderezo() {
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "rua=" + rua + ", numero=" + numero;
        }

    }
}
