class Payment
{
    private Account account;
    private double cash;
    
    public void setAccount(Account account)
    {
        this.account = account;
    }
    public void setCash(double cash)
    {
        this.cash = cash;
    }
    public double getCash()
    {
        return this.cash;
    }
    public boolean creaditCardPayment(String cardNumber, String month, String year)
    {
        return true;
    }
    public boolean cashPayment(double cash)
    {
        if(cash <= 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}