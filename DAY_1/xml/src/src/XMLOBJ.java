package src;
public class XMLOBJ{
    int Id;
    String Name;
    String Role;
    String Salary;
    String Currency;
    String Bio;
   public XMLOBJ( String Id,String Name,String Role,String Salary,String Currency,String Bio){
        this.Id = Integer.parseInt(Id);
        this.Name=Name;
        this.Role=Role;
        this.Salary=Salary;
        this.Currency=Currency;
        this.Bio=Bio;
    }
    @Override
    public String toString(){
        return "\nID           :   "+ Id +"\nName         :   "+Name+"\nRole         :   "+Role+"\nSalary ["+Currency+"]   :   "+Salary+"\nBio          :   "+Bio+"\n";
    }
}