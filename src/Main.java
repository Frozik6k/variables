public class Main {
    public static void main(String[] args){
        // task 1
        System.out.println();
        int seedPumpkin = 7595145;
        System.out.println("Значение переменной seedPumpkin с типом int равно " + seedPumpkin);
        byte energetic = -34;
        System.out.println("Значение переменной energetic с типом byte равно " + energetic);
        short cats = 4875;
        System.out.println("Значение переменной cats с типом short равно " + cats);
        long molecules = 493746843534534622L;
        System.out.println("Значение переменной molecules с типом long равно " + molecules);
        float pi = 3.14f;
        System.out.println("Значение переменной pi с типом float равно " + pi);
        double weight = 51.8713758374;
        System.out.println("Значение переменной weight с типом double равно " + weight);

        //task 2
        float var1 = 27.12f;
        long var2 = 987678965549L;
        float var3 = 2.786f;
        short var4 = 569;
        short var5 = -159;
        short var6 = 27897;
        byte var7 = 67;

        //task 3
        System.out.println();
        byte classLP = 23; // Кол-во учеников в классе у Людмилы Павловны
        byte classAS = 27; // Кол-во учеников в классе у Анны Сергеевны
        byte classEA = 30; // Кол-во учеников в классе у Екатерины Андреевны
        short sheetsPaper = 480; // Кол-во листов бумаги купленное на все классы
        System.out.println("На каждого ученика рассчитано " + sheetsPaper/(classLP+classAS+classEA)+ " листов бумаги");

        //task 4
        System.out.println();
        byte bottle1min = 16 / 2;
        int bottle20min = bottle1min * 20;
        System.out.println("За 20 минут машина произвела " + bottle20min + " штук бутылок");
        int bottle1day = bottle1min * 60 * 24;
        System.out.println("За сутки машина произвела " + bottle1day + " штук бутылок");
        int bottle3day = bottle1day * 3;
        System.out.println("За 3 дня машина произвела " + bottle3day + " штук бутылок");
        int bottle1month = bottle1day * 30;
        System.out.println("За месяц машина произвела " + bottle1month + " штук бутылок");

        //task 5
        System.out.println();
        byte allPaintCan = 120; // Кол-во краски купленных на все классы
        byte whitePaintCanClass = 2; // Кол-во белой краски на один класс
        byte brownPaintCanClass = 4; // Кол-во коричневой краски на один класс
        int paintCansClass = whitePaintCanClass + brownPaintCanClass; // Всего краски на один класс
        int allClass = allPaintCan / paintCansClass; // кол-во классов
        int allBrownPaintCanClass = allClass * brownPaintCanClass; // кол-во коричновой краски на школу
        int allWhitePaintCanClass = allClass * whitePaintCanClass; // кол-во белой краски на школу
        System.out.println("В школе, где " + allClass + " классов, нунжно " + allWhitePaintCanClass + " банок белой краски и " + allBrownPaintCanClass + " банок коричневой краски.");

        //task 6
        System.out.println();
        byte bananaWeight = 80; // вес одного банана в граммах
        byte milk100mlWeight = 105; // вес 100мл молока в граммах
        byte iceCreamWeight = 100; // вес одного брикета мороженного в граммах
        byte eggWeight = 70; // вес одного сырого яйца в граммах
        int breakfastWeight = bananaWeight*5 + milk100mlWeight*2 + iceCreamWeight*2 + eggWeight*4; // вес завтрака в граммах
        float breakfastWeightKg = breakfastWeight / 1000f;
        System.out.println("Вес спортзавтрака в граммах: " + breakfastWeight);
        System.out.println("Вес спортзавтрака в киллограммах: " + breakfastWeightKg);

        //task 7
        System.out.println();
        byte allWeight = 7; // Вес в кг который надо скинуть спортсмену
        int allWeightGram = allWeight * 1000; // Все в граммах которое надо скинуть спортсмену
        short minWeight1day = 250; // Минимальный вес в граммах, который нужно скинуть спортсмену в 1 день
        short maxWeight1day = 500; // Максимальный вес в граммах, который нужно скинуть спортсмену в 1 день
        int maxDays = allWeightGram / minWeight1day; // Максимальное кол-во дней для похудения
        System.out.println("Максимальное кол-во дней требуемых для похудения спортсмена равно " + maxDays);
        int minDays = allWeightGram / maxWeight1day; // Минимальное кол-во дней для похудения
        System.out.println("Минимальное кол-во дней требуемых для похудения спортсмена равно " + minDays);
        int averageDays = (maxDays+minDays) / 2; // Среднее кол-во дней для похудения
        System.out.println("Среднее кол-во дней требуемых для похудения спортсмена равно " + averageDays);

        //task 8
        System.out.println();
        float mashaSalary = 67760; // Зарплата Маши в месяц
        float denisSalary = 83690; // Зарплата Дениса в месяц
        float kristinaSalary = 76230; // Зарплата Кристины в месяц
        float mashaSalaryAfter = mashaSalary + mashaSalary*0.1f; // Зарплата Маши после увеличения на 10%
        float denisSalaryAfter = denisSalary + denisSalary*0.1f; // Зарплата Дениса после увеличения на 10%
        float kristinaSalaryAfter = kristinaSalary + kristinaSalary*0.1f; // Зарплата Кристины после увеличения на 10%
        float mashaSalaryYearsBefore = mashaSalary*12f; // Годовая зарплата Маши до повышения зарплаты
        float denisSalaryYearsBefore = denisSalary*12f; // Годовая зарплата Дениса до повышения зарплаты
        float kristinaSalaryYearsBefore = kristinaSalary*12f; // Годовая зарплата Кристины до повышения зарплаты
        float mashaSalaryYearsAfter = mashaSalaryAfter*12f; // Годовая зарплата Маши после повышения зарплаты
        float denisSalaryYearsAfter = denisSalaryAfter*12f; // Годовая зарплата Дениса после повышения зарплаты
        float kristinaSalaryYearsAfter = kristinaSalaryAfter*12f; // Годовая зарплата Кристины после повышения зарплаты
        System.out.println("Маша теперь получает " + mashaSalaryAfter + " рублей. Годовой доход вырос на " +
                (mashaSalaryYearsAfter - mashaSalaryYearsBefore));
        System.out.println("Денис теперь получает " + denisSalaryAfter + " рублей. Годовой доход вырос на " +
                (denisSalaryYearsAfter - denisSalaryYearsBefore));
        System.out.println("Кристина теперь получает " + kristinaSalaryAfter + " рублей. Годовой доход вырос на " +
                (kristinaSalaryYearsAfter - kristinaSalaryYearsBefore));
    }
}
