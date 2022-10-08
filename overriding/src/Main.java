public class Main {

    public static void main(String[] args) {

        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {new TarimKrediManager(), new MemurKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager baseKrediManager : baseKrediManagers){
            System.out.println(baseKrediManager.krediHesapla(1000));
        }

        BaseKrediManager baseKrediManager = new OgrenciKrediManager();
        baseKrediManager.Hesaplandı();


    }
}
