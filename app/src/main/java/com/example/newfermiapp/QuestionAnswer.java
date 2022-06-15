package com.example.newfermiapp;

public class QuestionAnswer {
    public static String question[] = {
            "Единица массы, принятая за основную в СИ - это ...",
            "Единица времени, принятая за основную в СИ - это ...",
            "Плотность обозначается буквой?",
            "Сила упругости обозначается буквой?",
            "От дома до школы расстояние 900 м. Этот путь ученик прошел за 15 мин. С какой средней скоростью шел ученик?",
            "В чем измеряется сила?",
            "Ящик находится в покое на горизонтальной поверхности. Можно утверждать, что на ящик...",
            "Поезд можно считать инерциальной системой отсчёта?",
            "Тело массой 600 г начинает двигаться с ускорением 1,5 м/с2. Равнодействующая всех приложенных к телу сил равна?",
            "Механическое движение происходит и это?"




    };

    public static String choices[][] = {
            {"миллиграмм (мг)", "килограмм (кг)", "грамм (г)", "тонна (т)"},
            {"сутки", "минута", "час", "секунда"},
            {"V", "m", "F", "ρ"},
            {"m", "V", "Fу", "R"},
            {"60 м/с", "1 м/с", "15 м/с", "10 м/с"},
            {"Н", "м/с", "Па", "кг"},
            {"не действуют никакие тела", "действует только горизонтальная поверхность", "действует только притяжение к Земле", "действия всех тел скомпенсированы"},
            {"только если поезд покоится", "только если поезд движется равномерно", "только если поезд движется прямолинейно", "если поезд покоится или движется равномерно и прямолинейно"},
            {"0,6 Н","0,9 Н","2,5 Н","15 Н"},
            {"физическая величина","свойство тело","физический процесс","электрическое явление"}


    };

    public static String correctAnswers[] = {
            "килограмм (кг)",
            "секунда",
            "p",
            "Fупр",
            "1 м/с",
            "Н",
            "действия всех тел скомпенсированы",
            "если поезд покоится или движется равномерно и прямолинейно",
            "0,9 Н",
            "физический процесс"

    };
}