public class Main {
    public static void main(String[] args) {
        // Создание объектов компании
        Company company1 = new Company("Company1");
        Company company2 = new Company("Company2");

        // Создание тарифов и добавление их в компании
        Tariff tariff1 = new Tariff("Tariff1");
        Tariff tariff2 = new Tariff("Tariff2");
        company1.addTariff(tariff1);
        company2.addTariff(tariff2);

        // Создание абонентов и добавление их к тарифам
        Subscriber subscriber1 = new Subscriber("Alice", "1234567890");
        Subscriber subscriber2 = new Subscriber("Bob", "2345678901");
        Subscriber subscriber3 = new Subscriber("Charlie", "3456789012");

        tariff1.addSubscriber(subscriber1);
        tariff1.addSubscriber(subscriber2);
        tariff2.addSubscriber(subscriber3);

        // Пополнение счета абонента и вывод информации
        subscriber1.replenishAccount(50.0);
        System.out.println("Subscriber 1: " + subscriber1.getName() + ", Balance: " + subscriber1.getAccountBalance());

        // Поиск абонента по номеру телефона
        Subscriber foundSubscriber = company1.findSubscriberByPhoneNumber("1234567890");
        if (foundSubscriber != null) {
            System.out.println("Found Subscriber: " + foundSubscriber.getName() + ", Tariff: " + foundSubscriber.getTariff().getName());
        } else {
            System.out.println("Subscriber not found.");
        }
    }
}

