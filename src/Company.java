import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Tariff> tariffs;

    public Company(String name) {
        this.name = name;
        this.tariffs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tariff> getTariffs() {
        return tariffs;
    }

    public void addTariff(Tariff tariff) {
        tariffs.add(tariff);
    }

    public Subscriber findSubscriberByPhoneNumber(String phoneNumber) {
        for (Tariff tariff : tariffs) {
            for (Subscriber subscriber : tariff.getSubscribers()) {
                if (subscriber.getPhoneNumber().equals(phoneNumber)) {
                    return subscriber;
                }
            }
        }
        return null;
    }
}
