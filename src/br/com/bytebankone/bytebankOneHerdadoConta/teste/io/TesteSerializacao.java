package br.com.bytebankone.bytebankOneHerdadoConta.teste.io;

import br.com.bytebankone.bytebankOneHerdadoConta.modelo.Cliente;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaCorrente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCpf("12345679895");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

//        Criação do objeto
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
