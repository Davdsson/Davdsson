public class Client {

    public static void main(String[] args){
       String kitapname = "Bilgi";
       String kitapOzet = "Bilgi sistemleri";
        //****************Model *************
        KitapModel kitap = new KitapModel();
        kitap.setKitap_adi(kitapname);
        kitap.setYazar_ozet(kitapOzet);
         //****************Kontroller *************
        kitapKontrolor k = new kitapKontrolor(kitap);
        KitapViewer viewer = new KitapViewer();

        //****************View*************
        viewer.KitapGoster(kitap.getKitap_adi(),kitap.getYazar_ozet());


    }
}
