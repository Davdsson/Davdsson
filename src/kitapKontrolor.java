public class kitapKontrolor {
    private KitapModel model;
    private KitapViewer view;

    public kitapKontrolor(KitapModel model){
        this.model = model;
        this.view = view;
    }

    public String getKitap_adi(String name) {
        return model.getKitap_adi();
    }

    public void setKitap_adi(String kitap_adi) {
        model.setKitap_adi(kitap_adi);
    }

    public String getYazar_ozet(String kname) {
        return model.getYazar_ozet();
    }

    public void setYazar_ozet(String kitap_adi) {
        model.setKitap_adi(kitap_adi);
    }


}
