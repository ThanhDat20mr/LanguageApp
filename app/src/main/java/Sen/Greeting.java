package Sen;

public class Greeting {
    private String En;
    private String Vn;

    public Greeting(String en,String vn) {
        this.En = en;
        this.Vn= vn;
    }
    public void setEn(String en){
        this.En = en;
    }
    public String getEn(){
        return En;
    }
    public void setVn(String vn){
        this.Vn = vn;
    }
    public String getVn(){
        return Vn;
    }
}
