public class SpaceWork {
    public static void main(String[] args) {
        String mMount = "Июль";
        if (mMount.equals("Январь") || mMount.equals("Февраль") || mMount.equals("Декабрь")){
            System.out.println("Зима");
        }else if(mMount.equals("Март") || mMount.equals("Апрель") || mMount.equals("Май")){
            System.out.println("Весна");
        }else if (mMount.equals("Июнь") || mMount.equals("Июль") || mMount.equals("Август")){
            System.out.println("Лето");
        }
        else if(mMount.equals("Сентябрь") || mMount.equals("Октябрь") || mMount.equals("Ноябрь")){
            System.out.println("Осень");
        }
        else {
            System.out.println("Такого месяца не существует");
        }
        int mNumersOnMount = 5;

        switch (mNumersOnMount){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Месяц не существует");
                break;
        }

        String[] mWeek = {"Понедельник", "Вторник",
                "Cреда", "Четверг",
                "Пятница", "Суббота",
                "Воскресенье"};

        String mInfoWeek = "";

        for (int i = 0; i < mWeek.length; i++) {
            mInfoWeek += mWeek[i];
            if (i == mInfoWeek.length()-1){
                mInfoWeek = ".";
            }else{
                mInfoWeek = ", ";
            }
            System.out.println(mInfoWeek);
        }
    }
}
