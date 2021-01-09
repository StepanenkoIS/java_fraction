package ru.fraction.calculator;

class Main  {

    public static void main(String[] args) {
        test();
        Console.connect();
    }

    public static void test() {
        Fraction fractionINT1 = Fraction.convert(4);
        System.out.println("Получение дроби из целого числа " + fractionINT1.toString());
        Fraction fractionINT2 = Fraction.convert(-2);
        System.out.println("Получение дроби из целого числа " + fractionINT2.toString());

        Fraction fractionDOUBLE1 = Fraction.convert(4.58);
        System.out.println("Получение дроби из числа с плавающей точкой " + fractionDOUBLE1.toString());
        Fraction fractionDOUBLE2 = Fraction.convert(-1.088);
        System.out.println("Получение дроби из числа с плавающей точкой " + fractionDOUBLE2.toString());

        Fraction fractionSTRING1 = Fraction.convert("8/5");
        System.out.println("Получение дроби  из строкового представления " + fractionSTRING1.toString());
        Fraction fractionSTRING2 = Fraction.convert("-1/5");
        System.out.println("Получение дроби  из строкового представления " + fractionSTRING2.toString());
        Fraction fractionSTRING3 = Fraction.convert("7 5516/11820");
        System.out.println("Получение дроби  из строкового представления " + fractionSTRING3.toString());
        Fraction fractionSTRING4 = Fraction.convert("98 8/7");
        System.out.println("Получение дроби  из строкового представления " + fractionSTRING4.toString());

        System.out.println();

        Fraction fraction1 = Calculator.minus(Fraction.convert("1/2"), Fraction.convert("3/4"));
        System.out.println("Результат вычитания дробей " + fraction1.toString());

        fraction1 = Calculator.sum(Fraction.convert("1/2"), Fraction.convert("3/4"));
        System.out.println("Результат сложения дробей " + fraction1.toString());

        fraction1 = Calculator.divide(Fraction.convert("1/2"), Fraction.convert("3/4"));
        System.out.println("Результат деления дробей " + fraction1.toString());

        fraction1 = Calculator.multiply(Fraction.convert("1/2"), Fraction.convert("3/4"));
        System.out.println("Результат умножения дробей " + fraction1.toString());
    }

}






