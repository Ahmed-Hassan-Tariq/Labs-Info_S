public class labs {
    private String labName;
    private String labAttendant;
    private Computers computersList[];

    public labs(String labName, String labAttendant, int pcno) {
        this.labName = labName;
        this.labAttendant = labAttendant;
        this.computersList = new Computers[pcno];
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(String labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Computers[] getComputersList() {
        return computersList;
    }

    public void setComputersList(Computers[] computersList) {
        this.computersList = computersList;
    }


    public void pcCreator(){
      for (int i  = 0; i < computersList.length;i++) {
          if (computersList[i] == null) {
              computersList[i] = new Computers("IBM", i);

          }
      }
    }


    public void printpcs(){

        for (int i=0; i < computersList.length; i++) {

            if(computersList[i]!=null) {
                computersList[i].PrintPc();
            }

        }
    }

public void printLab(){
    System.out.println("Lab Name"+ "" + labName +""+ "Lab Attendant" + " "+ labAttendant);
}




}
