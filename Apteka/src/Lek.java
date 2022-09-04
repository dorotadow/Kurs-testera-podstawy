public class Lek {

    private String _name;
    private int _productionData;
    private int _expiryDate;
    private String _destination;
    private boolean _prescription;

    public Lek(String name, int productionData, int expiryDate, String destination, boolean prescription) {
        _name = name;
        _productionData = productionData;
        _expiryDate = expiryDate;
        _destination = destination;
        _prescription = prescription;
    }
    public String getName() {
        return _name;
    }
    public void setName(String name) {
        _name = name;
    }
    public int getProductionData() {
        return _productionData;
    }
    public void setProductionData(int productionData) {
        _productionData = productionData;
    }
    public int getExpiryDate() {
        return _expiryDate;
    }
    public void setExpiryDate(int expiryDate) {
        _expiryDate = expiryDate;
    }

    public String getDestination() {
        return _destination;
    }

    public void setDestination(String destination) {
        _destination = destination;
    }

    public boolean isPrescription() {
        return _prescription;
    }

    public void setPrescription(boolean prescription) {
        _prescription = prescription;
    }
}