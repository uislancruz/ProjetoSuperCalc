/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author uisla
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1>n2)? 0:1;
        System.out.println(r);*/
        
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        //String res = (nome1.equals(nome3))?"igual":"diferente";//confere o conteudo
        String res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
    }
    
}
