public class Computers {
   private String model;
   private int id;

    public Computers(String model, int id) {
        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void PrintPc(){
        System.out.println(this.model+" "+this.id);
    }
}
