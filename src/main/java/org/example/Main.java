package org.example;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("1). Проверим добавление значений в начало списка и в конец, а также вывод всех значений на печать:");
        list.addInEnd(333);
        list.addInBeginning("Head");
        list.addInEnd(245);
        list.addInEnd(111);
        list.addInEnd("How are you?");
        list.addInEnd("Tail");
        list.printAll();

        System.out.println();
        System.out.println("2). Извлечение значения из начала списка без его удаления из списка:");
        Object i = list.extValueFromTheBeginningWithoutDeleting();
        System.out.println("Значение " + i + " извлекли и поместили в другую переменную");
        System.out.println("Значение осталось в списке:");
        list.printAll();

        System.out.println();
        System.out.println("3). Извлечение значения из начала списка с удалением его из списка:");
        i = list.extValueFromTheBeginningWithDeleting();
        System.out.println("Значение " + i + " извлекли и поместили в другую переменную.");
        System.out.println("Значение удалилось из списка:");
        list.printAll();

        System.out.println();
        System.out.println("4). Извлечение значения c конца списка без его удаления:");
        i = list.extValueFromTheEndWithoutDeleting();
        System.out.println("Значение " + i + " извлекли и поместили в другую переменную.");
        System.out.println("Значение осталось в списке:");
        list.printAll();

        System.out.println();
        System.out.println("5). Извлечение значения с конца списка с удалением его из списка:");
        i = list.extValueFromTheEndWithDeleting();
        System.out.println("Значение " + i + " извлекли и поместили в другую переменную.");
        System.out.println("Значение удалилось из списка:");
        list.printAll();

        System.out.println();
        System.out.println("6). Определим, является ли список пустым, или нет:");
        System.out.println("Список пуст? - " + (list.empty()? "Да!":"Нет!" ));

        System.out.println();
        System.out.println("7). Определим, содержит ли список заданное значение, или нет:");
        System.out.println("Содержит ли список значенеие 245? - " + (list.searchValue(245)? "Да!\n":"Нет!\n") +
                "А значение 777? - " + (list.searchValue(777)? "Да!":"Нет!"));

        System.out.println();
        System.out.println("8). Удалим заданное значение из списка, например 245: ");
        list.remove(245);
        list.printAll();
        System.out.println("Удалим несуществующее значение из списка, например 7776: ");
        list.remove(7776);
        System.out.println("Ничего не произошло.");

    }

}