package ads.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Pessoa> agenda= new ArrayList<>();

        lista.add("POO");
        lista.add("fome");
        lista.add("sono");
        lista.add("dormir");

        agenda.add(new Pessoa("antonio", "antoninho@hotmail.com"));
        agenda.add(new Pessoa("erik", "erik@rei.delas"));
        agenda.add(new Pessoa("bernardo", "bernardo@gmail.com"));
        agenda.add(new Pessoa("robson", "robson@dodoi.com"));

        for (String elemento : lista){
            System.out.println(elemento);
        }

        for (Pessoa elemento : agenda) {
            System.out.println(elemento);
        }

        lista.forEach(elemento-> System.out.println(elemento));
        lista.forEach(System.out::println);

        lista.removeIf(elemento-> elemento.equals("POO"));
        lista.forEach(System.out::println);

        agenda.removeIf(elemento-> elemento.getNome().equals("robson"));
        agenda.forEach(System.out::println);

        Pessoa p = agenda.stream().filter(elemento-> elemento.getNome().equals("robson")).findFirst().orElse(null);

        if (p != null) {
            String n = p.getNome();
            System.out.println(n);
        }else{
            System.out.println("Não encontrei");
        }
    }
}
