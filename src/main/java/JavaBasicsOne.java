
public class JavaBasicsOne {
     public static void main (String[] args) {
          byte myByte = 127;
          short myShort =6666;
          int  myInt = 5;
          int  myIntTwo = 6;
          int maxInt = Integer.MAX_VALUE;
          float myFloat = 2.123f;
          double myDouble = 4.333;
          boolean myTrue = true;
          boolean myFalse = false;
          //Математические операторы:
          System.out.println("Сложение:myByte+myFloat = "+ (myByte+myFloat));
          System.out.println("Вычитание:"+myInt+"-"+ myFloat+ "="  + (myInt -myDouble));
          System.out.println("Умножение:"+myInt+"*"+ myFloat+ "="  + (myInt * myDouble));
          System.out.println("Деление:"+myByte+"/"+ myFloat+ "="  + (myByte / myDouble));
          System.out.println("Инкремент ++myInt=" + (++myInt));
          System.out.println("Декремент --myInt=" + (--myIntTwo));
          //Переполнения при вычислениях
          System.out.println("Переполнения при вычислениях =" + (++maxInt));
          //Логические операторы
          System.out.println("Логический И (&&) возвращает true, если оба операнда истинны myTrue && myFalse =" + (myTrue && myFalse));
          System.out.println("Логическое НЕ (!) используется для инвертирования !myFalse =" + (!myFalse));
          System.out.println("Логический ИЛИ (||) true, если хотя бы один из операндов истинен myTrue || myFalse =" + (myTrue || myFalse));





     }
}
