# SimbirSoft

## Создание проекта с автотестами с нуля

https://www.way2automation.com/angularjs-protractor/registeration/#/login. Проверка авторизации

1. Проверка полей ввода

   - Поля "Username" и "Password" отображаются

   - Кнопка Login задизейблена при незаполенных полях

2. Проверка успешной авторизации

   - Ввести валидные username и password, нажать на кнопку Login.

   - Ожидаемый результат: отображается сообщение об успешной авторизации ("You're logged in!!").

3. Проверка авторизации с невалидными данными

   - Ввести невалидный username или password и нажать Login.

   - Ожидаемый результат: отображается сообщение об ошибке ("Username or password is incorrect").

4. Проверка успешного разлогирования

   - Нажать на кнопку "Logout".

   - Ожидаемый результат: отображаются поля для входа.

## Задача U2. Allure
Теория к задаче: Allure , Серьезность и Приоритет Дефекта

1. Добавить в проект отчеты Allure.rr

2. Добавить аннотацию Severity к каждому тест кейсу

3. Добавить аннотацию Step к каждому публичному методу всех Page Object

4. Добавить аннотации Epic, Feature, Story