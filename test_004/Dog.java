public class Dog {

    String name;

    public static void main(String[] args) {
        //Создаем объект Dog и получаем к ниму доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        //Создаем массив типа Dog
        Dog[] myDigs = new Dog[3];

        //Поместим в массив несколько элментов
        myDigs[0] = new Dog();
        myDigs[1] = new Dog();
        myDigs[2] = dog1;

        //Получим доступ к объекту Dog с помощью ссылок из массива
        myDigs[0].name = "Фрэд";
        myDigs[1].name = "Джордж";


        System.out.println(" Имя последней собаки: " + myDigs[2].name);

        //Переберем все элименты и вызовим для каждого bark
        int x = 0;
        while (x < myDigs.length){
            myDigs[x].bark();
            x = ++x;
        }
    }

    private void bark(){
        System.out.println(name + " сказал Гав");

    }
}
