package mapa;
import java.util.Map;
public class Main {
    public static void main(String[] args)
    {
        //Tworzenie nowego pustego hastMapa
        java.util.HashMap<Integer, String> mapa = new java.util.HashMap<>();

        mapa.put(1, "Adam");
        mapa.put(2, "Monika");
        mapa.put(3, "Łucja");
        mapa.put(4, "Stefan");

        System.out.println("Wyswietlenie zawartosci naszej haszMapy: ");

        for (Map.Entry m : mapa.entrySet())
        {
            System.out.println("Klucz = " + m.getKey() + ", Wartsc = " + m.getValue() + ".");
        }
    }
}
