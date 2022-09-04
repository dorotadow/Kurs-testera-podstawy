public class Main {
    public static void main(String[] args) {
        Lek lek = new Lek("Apap",2021, 2022, "przeciwbolowy",false);
        System.out.println(lek.getName());
        System.out.println(lek.getProductionData());
        System.out.println(lek.getExpiryDate());
        System.out.println(lek.getDestination());
        System.out.println(lek.isPrescription());
    }
}