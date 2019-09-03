/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Conta {

    String nomeDono;
    int numConta;
    double saldo;

    public Conta() {
    }

    public Conta(String nomeDono, int numConta, double saldo) {
        this.nomeDono = nomeDono;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        this.saldo +=valor;
        return this.saldo;
    }

    public double sacar(double valor) {
        this.saldo -=valor;
        return this.saldo;
    }
    
    public void Trasferir(Conta Trasfere, Conta Destino,double valor){
        Trasfere.saldo -=valor;
        Destino.saldo +=valor;
    }
 
}
