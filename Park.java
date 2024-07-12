import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractionList;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractionList = new ArrayList<>();
    }

    public String getParkName() {
        return parkName.toUpperCase();
    }


    public void getAttractionInfo() {
        System.out.println("В нашем парке " + getParkName());
        System.out.println("Вас ждут лучшие аттракционы:");
        for (Attraction a : attractionList) {
            System.out.println(a.getAttractName());
            System.out.println(a.getWorkingHours());
            System.out.println(a.getPrice());
        }
    }

    public void addAttraction(String name, double price, String workingHours) {
        Attraction attraction = new Attraction(name, price, workingHours);
        attractionList.add(attraction);
    }

    public void deleteAttraction(int index) {
        if (index >= 0 && index < attractionList.size()) {
            attractionList.remove(index);
        } else {
            System.out.println("Некорректный индекс: " + index);
        }
    }

    public void updatePrice(String attractionName, double newPrice) {
        for (Attraction attraction : attractionList) {
            if (attraction.getAttractName().equals(attractionName)) {
                attraction.setPrice(newPrice);
            }
        }
    }

    ;

    public void updateWorkingHours(String attractionName, String newWorkingHours) {
        for (Attraction attraction : attractionList) {
            if (attraction.getAttractName().equals(attractionName)) {
                attraction.setWorkingHours(newWorkingHours);
            }
        }
    }


    private class Attraction {
        private String name;
        private double price;
        private String workingHours;

        public Attraction(String name, double price, String workingHours) {
            this.name = name;
            this.price = price;
            this.workingHours = workingHours;
        }

        String getAttractName() {
            return name;
        }

        double getPrice() {
            return price;
        }

        void setPrice(double price) {
            this.price = price;
        }

        String getWorkingHours() {
            return workingHours;
        }

        void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

    }

}
