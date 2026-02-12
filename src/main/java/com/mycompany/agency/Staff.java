package com.mycompany.agency;

public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Chloe", "31 grant ave", "631-8605","123-45-8907", 2300.00);
        staffList[1] = new Executive("Tyler", "80 Brentwood St", "641-8094", "134-64-8908", 250.00);
        staffList[2] = new Executive("Bryan", "94 Baywood Road", "457-9007", "135-54-9076", 150.00);
        staffList[3] = new TempEmploee("Brianna", "1430 BayShore Road", "001-5670", "245-09-0097", 300.00);
        staffList[4] = new Executive("Jasmine", "6 Mckinley Ave", "547-3789", "975-07-9362", 350.00);
        staffList[5] = new Executive("Gabe", "80 Floyd St", "671-9264", "186-24-7534", 280.00);
        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
