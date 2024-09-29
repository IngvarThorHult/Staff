public class StaffHiring extends Staff{
    public StaffHiring(int staffNumber, String location) {
        super(staffNumber, location);
    }
    public void printStaffHiring(){
        System.out.println();
        System.out.println("STAFF HIRING REPORT");
        System.out.println("*******************");
        System.out.println("STAFF NUMBER: " + getStaffNumber() + "\n" +
                "LOCATION: " + getStaffLocation() + "\n" +
                "HIRE STAFF: " + getStaffHiringProcess());
    }
}