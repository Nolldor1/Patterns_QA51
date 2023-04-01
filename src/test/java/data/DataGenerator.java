package data;

        import com.github.javafaker.Faker;
        import lombok.Data;

        import java.time.LocalDate;
        import java.util.Locale;
        import java.util.Random;


        import static java.time.format.DateTimeFormatter.ofPattern;

@Data
public class DataGenerator {

    public static class Registration {
        private Registration() {
        }


        public static ClientDataInfo generateClientPersonalData(String locale) {
            Faker faker = new Faker(new Locale("ru"));
            return new ClientDataInfo(
                    generateRandomCityFromTheList(),
                    faker.name().fullName(),
                    faker.phoneNumber().phoneNumber()
            );
        }

        public static String generateDateOfMeeting(int days) {
            return
                    LocalDate.now().plusDays(days).format(ofPattern("dd.MM.yyyy"));
        }

        public static String generateRandomCityFromTheList() {
            String[] cities = {
                    "Абакан", "Анадырь", "Архангельск", "Астрахань", "Барнаул", "Белгород", "Биробиджан", "Благовещенск", "Брянск",
                    "Великий Новгород", "Владивосток", "Владикавказ", "Владимир", "Волгоград", "Вологда", "Воронеж", "Горно-Алтайск",
                    "Грозный", "Екатеринбург", "Иваново", "Ижевск", "Иркутск", "Йошкар-Ола", "Казань", "Калининград", "Калуга", "Кемерово",
                    "Киров", "Кострома", "Краснодар", "Красноярск", "Курган", "Курск", "Кызыл", "Липецк", "Магадан", "Магас", "Майкоп",
                    "Махачкала", "Москва", "Мурманск", "Нальчик", "Нарьян-Мар", "Нижний Новгород", "Новосибирск", "Омск", "Орёл", "Оренбург",
                    "Пенза", "Пермь", "Петрозаводск", "Петропавловск-Камчатский", "Псков", "Ростов-на-Дону", "Рязань", "Салехард", "Самара",
                    "Санкт-Петербург", "Саранск", "Саратов", "Севастополь", "Симферополь", "Смоленск", "Ставрополь", "Сыктывкар",
                    "Тамбов", "Тверь", "Томск", "Тула", "Тюмень", "Улан-Удэ", "Ульяновск", "Уфа", "Хабаровск", "Ханты-Мансийск", "Чебоксары",
                    "Челябинск", "Черкесск", "Чита", "Элиста", "Южно-Сахалинск", "Якутск", "Ярославль"
            };
            Random random = new Random();
            return cities[random.nextInt(cities.length)];
        }
    }
}