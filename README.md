Завдання 1 (Зробив два варіанти, другий - у іншій бренчі);

Потрібно: створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil. У тілі класу створіть методи void study(), void read(), void write(), void relax(). Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня. Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.

Завдання 2

Потрібно: Створити клас DocumentWorker. У тілі класу створіть три методи openDocument(), editDocument(), saveDocument(). У тілі кожного з методів додайте виведення на екран відповідних рядків: "Документ відкритий", "Правка документа доступна у версії Про", "Збереження документа доступне у версії Про". Створіть похідний клас ProDocumentWorker. Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки: "Документ відредаговано", "Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт". Створіть похідний клас ExpertDocumentWorker від базового класу ProDocumentWorker. Перевизначте відповідний метод. При викликі даного методу необхідно виводити на екран документ збережений в новому форматі. У тілі методу main() реалізуйте можливість прийому від користувача номер ключа доступу pro і exp. Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною версією (створюється екземпляр базового класу), якщо користувач ввів номери ключа доступу pro і exp, то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker.

Завдання 3

Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value), який виводить на екран значення аргументу. Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів, та виклику відповідного методу їх екземпляра, рядки, передані як аргументи методів, виводилися різними кольорами.