# SimbirSoft

## Создание проекта с автотестами с нуля

4. https://www.way2automation.com/angularjs-protractor/registeration/#/login. Проверка авторизации

4.1 Проверка полей ввода

- Поля "Username" и "Password" отображаются

- Кнопка Login задизейблена при незаполенных полях

4.2 Проверка успешной авторизации

- Ввести валидные username и password, нажать на кнопку Login.

- Ожидаемый результат: отображается сообщение об успешной авторизации ("You're logged in!!").
  
4.3 Проверка авторизации с невалидными данными

- Ввести невалидный username или password и нажать Login.

- Ожидаемый результат: отображается сообщение об ошибке ("Username or password is incorrect").

4.4 Проверка успешного разлогирования
 
- Нажать на кнопку "Logout".

- Ожидаемый результат: отображаются поля для входа.