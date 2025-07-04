import java.time.LocalDateTime;

public class Building {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime opendatetime;
    private LocalDateTime closedatetime;
    public void setName(String aName){
        name=aName;
    }
    public String getName(){
        return name;
    }
     public void setArea(String aArea){
        name=aArea;
    }
    public double getArea(){
        return area;
    }
     public void setFloors(int aFloors){
        floors=aFloors;
    }
    public int getFloors(){
        return floors;
    }
    public void setOpendatetime(LocalDateTime aopendatetime){
        opendatetime=aopendatetime;
    }
    public LocalDateTime getopendatetime(){
        return opendatetime;
    }
     public void setClosedatetime(LocalDateTime aclosedatetime){
        closedatetime=aclosedatetime;
    }
    public LocalDateTime getclosedatetime(){
        return closedatetime;
    }
    
    
}
