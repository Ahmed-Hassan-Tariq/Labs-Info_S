import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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


    public void labsCreator() throws IOException {

        File f1 = new File("Labs.dat");

        FileWriter wlab = new FileWriter(f1, true);


        for(int i = 0; i < labsList.length; i++){
            if(labsList[i] == null){
                labsList[i] = new labs("C-"+i,"Luqman",10);
                wlab.write(
                        labsList[i].getLabName()+","+
                        labsList[i].getLabAttendant()+","+
                        labsList[i].getComputersList().length+"\n"
                        );
                labsList[i].pcCreator();

                System.out.println("Lab Created");
                wlab.close();
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

    public void loadLabs() throws FileNotFoundException {
        File f3 = new File("Labs.dat");
        Scanner reader = new Scanner(f3);

        String line;

        while(reader.hasNextLine()){
            line = reader.nextLine();
            System.out.println("Lab Name: "+line.split(",")[0]+" "+
                    "Lab Attendant: " + line.split(",")[1]+" "+
                    "PCs in Lab: " + line.split(",")[2]
                    );
        }




    }
}
