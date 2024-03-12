class Account
{
    private String username;
    private String password;
    private String accountType;
    private String name;
    private String address;
    private String contactNumber;
    private Flight flight;
    
    public Account()
    {
        
    }
    public Account(String username, String password, String accountType)
    {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }
    public Account(String username, String password, String accountType, String name, String address, String contactNumber, String cardNumber, String month, String year)
    {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        cardNumber = cardNumber;
        month = month;
        year = year;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setContactNumber(String contactNumber)
    {
        this.contactNumber = contactNumber;
    }
    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getContactNumber()
    {
        return contactNumber;
    }
    public Flight getFlight()
    {
        return flight;
    }
    public void viewAccountDetails()
    {
        System.out.println("Username: " + username);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber + "\n");
    }
    public void viewFlightDetails()
    {
        System.out.println("-Flight-");
    }
}