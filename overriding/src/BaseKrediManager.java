public class BaseKrediManager {

    public double krediHesapla(double tutar){
        return tutar * 1.18;
    }

    //overriding
    public final void Hesapland─▒(){
        System.out.println("Kredi Hesapla");
    }
}
