class Menu extends Validation
{
    private int loginMenuChoice;
    private int adminMenuChoice;
    private int userMenuChoice;
    private int flightMenuChoice;
    private int paymentMenuChoice;
    
    public void setLoginMenu(int loginMenuChoice)
    {
        this.loginMenuChoice = loginMenuChoice;
    }
    public void setAdminMenuChoice(int adminMenuChoice)
    {
        this.adminMenuChoice = adminMenuChoice;
    }
    public void setUserMenuChoice(int userMenuChoice)
    {
        this.userMenuChoice = userMenuChoice;
    }
    public void setFlightMenuChoice(int flightMenuChoice)
    {
        this.flightMenuChoice = flightMenuChoice;
    }
    public void setPaymentMenuChoice(int paymentMenuChoice)
    {
        this.paymentMenuChoice = paymentMenuChoice;
    }
    public int getLoginMenuChoice()
    {
        return this.loginMenuChoice;
    }
    public int getAdminMenuChoice()
    {
        return this.adminMenuChoice;
    }
    public int getUserMenuChoice()
    {
        return this.userMenuChoice;
    }
    public int getFlightMenuChoice()
    {
        return this.flightMenuChoice;
    }
    public int getPaymentMenuChoice()
    {
        return this.paymentMenuChoice;
    }
    public void startingMenu()
    {
        System.out.println("\n-Welcome To Java Airlines-");
        System.out.println("[1]Login");
        System.out.println("[2]Exit");
    }
    public void adminMenu()
    {
        System.out.println("-Welcome Admin-\n");
        System.out.println("-Admin-");
        System.out.println("[1]Edit Flight Details");
        System.out.println("[2]Logout");
    }
    public void userMenu(boolean flightCheck)
    {
        System.out.println("-Welcome User-\n");
        System.out.println("-User-");
        System.out.println("[1]View Account");
        System.out.println("[2]Edit Account");
        System.out.println("[3]View Flight");
        if(flightCheck == false)
        {
            System.out.println("[4]Book Flight");
        }
        else
        {
            System.out.println("[4]Edit Flight");
        }
        System.out.println("[5]Payment");
        System.out.println("[6]Logout");
    }
    public void paymentMenu()
    {
        System.out.println("-Choose Payment Method-");
        System.out.println("[1]Credit Card");
        System.out.println("[2]Cash");
        System.out.println("[3]Back");
    }
}