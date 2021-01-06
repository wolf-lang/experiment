public class classroom {
    private String id;
    private String is_alive;
    private int nums;

    public classroom(String id, String is_alive, int nums) {
        this.id = id;
        this.is_alive = is_alive;
        this.nums = nums;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIs_alive() {
        return is_alive;
    }

    public void setIs_alive(String is_alive) {
        this.is_alive = is_alive;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }
}
