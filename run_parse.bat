chcp 1251
rem Первый аргумент - тип программы (parse/search)
rem Второй аргумент - количество страниц
rem Третий аргумент - название файла для сохранения данных
rem Четвертый аргумент - каталог для сохранения превьюшек
rem Аргументы прописываются после слова App

java -cp "bin;lib\*;lib\opencsv\*" App search 2 data.csv previews
pause