# Maven_testNG
Ошибки реализации метода isTeenager:

1) Верхняя граница подросткового возраста (19) не включена в диапазон,
   вместо < нужно использовать =< (меньше или равно);

2) Возраст меньше 13 ошибочно включён в диапазон, чтобы этого избежать
   достаточно прописать дополнительное условие в рамках условного оператора if
   ...&& age >= 13)