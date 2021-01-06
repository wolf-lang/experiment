public class teacher {
    private String t_id;
    private String t_name;
    private int t_age;
    private String t_sex;
    private String t_phone;
    private String account;
    private String pwd;

    public teacher(String t_id, String t_name, int t_age, String t_sex, String t_phone) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_age = t_age;
        this.t_sex = t_sex;
        this.t_phone = t_phone;
    }

    public teacher(String t_id, String account, String pwd) {
        this.t_id = t_id;
        this.account = account;
        this.pwd = pwd;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public int getT_age() {
        return t_age;
    }

    public void setT_age(int t_age) {
        this.t_age = t_age;
    }

    public String getT_sex() {
        return t_sex;
    }

    public void setT_sex(String t_sex) {
        this.t_sex = t_sex;
    }

    public String getT_phone() {
        return t_phone;
    }

    public void setT_phone(String t_phone) {
        this.t_phone = t_phone;
    }

}
