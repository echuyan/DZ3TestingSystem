package com.company;


import sun.security.x509.CertAttrSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Система тестирования
 * Цель:
 * Цель упражнения - получить базовые знания в работе с массивами, циклами, условными операторами и т.д.
 *
 * Написать систему тестирования.
 *
 * На экран выводится вопрос и варианты ответа, с клавиатуры вводится номер ответа.
 * Вопросы и ответы должны быть зашиты в коде, внешнего хранения в файлах или базах данных не нужно.
 *
 * Должно быть три вопроса, каждый с 3-5 вариантами ответов.
 * Все вопросы с одним правильным вариантом ответа.
 *
 * После прохождения теста отображается результат.
 *
 * Использовать только циклы, массивы, условия и другие структуры, которые были пройдены на данный момент в рамках курса.
 * В этом задании не нужно использовать ООП.
 *
 */

public class Main {

    private static final String[] QUESTIONS = {
            "В каком году принята декларация независимости США?",
            "Единица измерения силы тока - это:",
            "Что такое агорафобия?"};
    private static final String[][] ANSWERVARIANTS =
            {
                    {"1. 1770","2. 1776","3. 1821","4. 1994"},
                    {"1. Ампер","2. Ватт","3. Вольт","4. Паскаль","5. Килобит"},
                    {"1. Боязнь высоты", "2. Боязнь замкнутых пространств","3. Боязнь открытых пространств"}
            };

    private static final String[] RIGHTANSWERS =
            {
                    "2",
                    "1",
                    "3"
            };

    public static void main(String[] args) throws IOException {

        int score=0;
        int counter1=0;
        int counter2=0;
        String answer="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Привет! Давайте начнем тест."+"\n");
        System.out.println("Вам будут заданы 3 вопроса и для каждого нужно выбрать один правильный вариант ответа. " +
                "Для ответа нажмите на клавиатуре цифру, соответствующую верному ответу и нажмите Enter."+
                "Максимальный балл - 3.");

        for (counter1=0;counter1<3;counter1++)
        {
            System.out.println(QUESTIONS[counter1]);

            for (counter2=0;counter2<ANSWERVARIANTS[counter1].length;counter2++) {
                System.out.println(ANSWERVARIANTS[counter1][counter2]+"\n");
            }

            answer = reader.readLine();
            while (!answer.equals("1") &&  !answer.equals("2") && !answer.equals("3") && !answer.equals("4") && !answer.equals("5")) {
                System.out.println("Вы ошиблись при вводе ответа. Попробуйте еще раз. Принимаются только цифры с номером ответа.");
                answer = reader.readLine();
            }

            if (answer.equals(RIGHTANSWERS[counter1])) {score++;}

        }

        System.out.println("Давайте проверим, как вы справились!"+"\n"+"Ваш балл - "+ score);
        switch (score) {
            case 3:
                System.out.println("Вы молодец! Максимальный балл!");
                break;
            case 2:
                System.out.println("Неплохо! Уверенный уровень знаний.");
                break;
            case 1:
                System.out.println("Вам еще есть куда стремиться. Подготовьтесь получше.");
                break;
            case 0:
                System.out.println("Кажется, этот тест не для вас. Вам стоит съесть мягких французских булок и выпить чаю. Лучше отдохнуть и не засорять голову лишней информацией!");

        }

        System.out.println("Спасибо за прохождение теста. Увидимся!");




    }
}
