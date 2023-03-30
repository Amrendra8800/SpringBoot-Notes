
class CarType{
    static final String HATCHBACK = "Hatchback";
    static final String SUV = "SUV";
    static final String SEDAN  = "Sedan";
    //
}

class Service {
    String serviceName;
    String serviceCode;
    Map<String,Integer> prices;

    Service(String serviceName, String serviceCode,int priceHatchback,int priceSedan,int priceSUV){
        this.serviceName = serviceName;
        this.serviceCode = serviceCode;
        prices = new HashMap<String,Integer>();
        prices.put(CarType.HATCHBACK, priceHatchback);
        prices.put(CarType.SUV, priceSUV);
        prices.put(CarType.SEDAN, priceSedan);
    }

    public int getPrice(String carType){
        return prices.get(carType);
    }
}


class ServiceStation {
    Map<String,Service> services;
    //addService
    ServiceStation(){
        services = new HashMap<String,Service>();
        services.put("BS01",new Service("BS01", "Basic Service", 2000, 4000, 5000));
        services.put("EF01",new Service("EF01", "Engine Fixing", 5000, 8000, 10000));
        services.put("CF01",new Service("CF01", "Clutch Fixing", 2000, 4000, 6000));
        services.put("BF01",new Service("BF01", "Break Fixing", 1000, 1500, 2500));
        services.put("GF01",new Service("GF01", "Gear Fixing", 3000, 6000, 8000));
    }

    void generateBill(String carType,ArrayList<String> serviceCodes){
        // Charges for Basic Servicing – ₹ 2000
        // Charges for Engine Fixing – ₹ 5000
        // Total Bill – ₹ 7000
        // BSO1
        int billAmount = 0;
        for(String serviceCode : serviceCodes){
            Service actualService = this.services.get(serviceCode);
            int currPrice = actualService.getPrice(carType);
            billAmount += currPrice;
            System.out.println("Charges for" + actualService.serviceName + " - ₹" +currPrice)
        }
        System.out.println("Total Bill - ₹" + billAmount)
    }   
    
}

public class Main{
    public static void main(String[] args){
        ServiceStation serviceStation = new ServiceStation();
        ArrayList arrayList = new ArrayList();
        arrayList.add("BS01");
        arrayList.add("EF01");
        generateBill(CarType.HATCHBACK,arrayList);
    }
}

