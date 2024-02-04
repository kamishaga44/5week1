import java.util.List;
import java.util.ArrayList;
class Tariff {
    private String name;
    private List<Subscriber> subscribers;
    private Company company;

    public Tariff(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        subscriber.setTariff(this);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public int getNumberOfSubscribers() {
        return subscribers.size();
    }
}

