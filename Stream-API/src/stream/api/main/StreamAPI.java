/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream.api.main;

import stream.api.basics.*;
import stream.api.convensions.*;
import stream.api.advanced.*;
/**
 *
 * @author Maresev
 */
public class StreamAPI {

    public static void main(String[] args) {
        System.out.println("Задание 1: Основы Stream API");
        System.out.println(" \n 1. Список чисел от 1 до 10");
        StreamBasics.streamAndPrintBasics();
        System.out.println(" \n 2. Список строк, содержащих имена людей");
        FilterNames.filterAndPrintNames();
        System.out.println(" \n 3. Список строк с названиями фруктов");
        UpperCaseNames.UpperCaseAndPrintNames();
        System.out.println("\n Задание 2: Преобразование данных");
        System.out.println(" \n 1. Список чисел");
        DoubleNumbers.printDoubleNumbers();
        System.out.println(" \n 2. Список строк с названиями городов");
        SortCities.sortAndPrintCities();
        System.out.println(" \n 3. Список объектов типа Person с полями name и age");
        AverageAge.printAverageAge();
        System.out.println("\n Задание 3: Продвинутые операции");
        System.out.println(" \n 1. Список объектов типа Person с полями name и age");
        GroupByAge.groupAndPrintByAge();
        System.out.println(" \n 2. Список чисел");
        SumFilteredNumbers.sumAndPrintFilteredNumbers();
        System.out.println(" \n 3. Список строк с названиями книг");
        FilterAndSortBooks.printFilterAndSortBooks();
    }    
}
