package Bai2_PhanSO;

public class PHANSO {
    

    public int tuso;
    public int mauso;


    public PHANSO(){
    tuso = 0;
    mauso = 1;
}
     public PHANSO(PHANSO p){
    this.tuso =p.tuso;
    this.mauso =p.mauso;
}
    
    public PHANSO(int tuSo, int mauSo) {
        this.tuso = tuSo;
        this.mauso = mauSo;
    }

 
    public void chuanHoa() {
        if (mauso < 0) {
            tuso = -tuso;
            mauso = -mauso;
        }
    }


    private int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

 
    public void rutGon() {
        int ucln = timUCLN(this.tuso,this.mauso);
        tuso /= ucln;
        mauso /= ucln;
    }

  
    public PHANSO congPhanSo(PHANSO ps) {
        PHANSO result = new PHANSO();
        result.tuso = this.tuso * ps.mauso + ps.tuso * this.mauso;
        result.mauso = this.mauso * ps.mauso;
        result.rutGon();
        return result;
    }
    
    public PHANSO truPhanSo(PHANSO ps) {
        PHANSO hieu = new PHANSO();
        hieu.tuso = this.tuso * ps.mauso - ps.tuso * this.mauso;
        hieu.mauso = this.mauso * ps.mauso;
        hieu.rutGon();
        return hieu;
    }
    public PHANSO nhanPhanSo(PHANSO ps) {
        PHANSO tich = new PHANSO();
        tich.tuso = this.tuso *  ps.tuso ;
        tich.mauso = this.mauso * ps.mauso;
        tich.rutGon();
        return tich;
    }
    public PHANSO chiaPhanSo(PHANSO ps) {
        PHANSO thuong = new PHANSO();
        thuong.tuso = this.tuso * ps.mauso ;
        thuong.mauso = this.mauso * ps.tuso;
        thuong.rutGon();
        return thuong       ;
    }
    public void output() {
        if (tuso == 0) {
            System.out.println(tuso + "/" + mauso);
        } else if (mauso == 0) {
            System.out.println("Infinity");
        } else if (tuso < 0 && mauso < 0) {
            chuanHoa();
            System.out.println(tuso + "/" + mauso);
        } else {
            System.out.println(tuso + "/" + mauso);
        }
    }
}