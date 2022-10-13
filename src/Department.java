public class Department {
    private String Dname;
    private String HOD;
    private labs labsList[];


    public Department(String dname, String HOD, int labsno) {
        Dname = dname;
        this.HOD = HOD;
        this.labsList = new labs[labsno];

    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public String getHOD() {
        return HOD;
    }

    public void setHOD(String HOD) {
        this.HOD = HOD;
    }

    public labs[] getLabsList() {
        return labsList;
    }

    public void setLabsList(labs[] labsList) {
        this.labsList = labsList;
    }


    public void labsCreator(){
        for(int i = 0; i < labsList.length; i++){
            if(labsList[i] == null){
                labsList[i] = new labs("C-"+i,"Luqman",10);
                labsList[i].pcCreator();
                System.out.println("Lab Created");
                break;
            }
        }

    }
    public void labPrinter(){
        for (int i =0;i < labsList.length; i++){
            if(labsList[i] != null){
                labsList[i].printLab();
                labsList[i].printpcs();
            }
        }
    }
}
