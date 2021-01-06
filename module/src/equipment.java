import java.text.SimpleDateFormat;
import java.util.Date;

public class equipment {
    private String e_id;
    private String e_type;
    private String e_name;
    private String is_damage;
    private SimpleDateFormat Purchase_date;

    public equipment(String e_id, String e_type, String e_name, String is_damage, Date purchase_date) {
        this.e_id = e_id;
        this.e_type = e_type;
        this.e_name = e_name;
        this.is_damage = is_damage;
        Purchase_date = new SimpleDateFormat("YYYY-MM-dd hh:mm:sss");
    }

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    public String getE_type() {
        return e_type;
    }

    public void setE_type(String e_type) {
        this.e_type = e_type;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getIs_damage() {
        return is_damage;
    }

    public void setIs_damage(String is_damage) {
        this.is_damage = is_damage;
    }

    public SimpleDateFormat getPurchase_date() {
        return Purchase_date;
    }

    public void setPurchase_date(SimpleDateFormat purchase_date) {
        Purchase_date = purchase_date;
    }
}
