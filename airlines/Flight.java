class Flight
{
    private String flightCode;
    private String flightLocation;
    private double flightPrice;
   
     public Flight()
    {
        
    }
    public Flight(String flightCode, String flightLocation, double flightPrice)
    {
        this.flightCode = flightCode;
        this.flightLocation = flightLocation;
        this.flightPrice = flightPrice;
    }
    public void setFlightLocation(String FlightLocation)
    {
        this.flightLocation = flightLocation;
    }
    public void setflightPrice(double flightPrice)
    {
        this.flightPrice = flightPrice;
    }
    public String getFlightCode()
    {
        return this.flightCode;
    }
    public String getFlightLocation()
    {
        return this.flightLocation;
    }
    public double getFlightPrice()
    {
        return this.flightPrice;
    }
}