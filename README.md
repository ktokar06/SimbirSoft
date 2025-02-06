# 📜 SimbirSoft

## Задача U0. Настройка окружения

Теория к задаче: git, Java TestNG , Maven, page object model , Selenium

1. Устанавливаем Chrome.
    
2. Скачиваем и устанавливаем IntelliJ IDEA Community Edition с оф. сайта.
    
3. Ставим себе Java JDK и JRE:
    
    - Скачиваем по ссылкам выше, устанавливаем из файла, запомнив директорию установки (на рисунке выделена красным) 
    
    - Создаем новую переменную окружения JAVA_HOME, которая смотрит на эту директорию
    
    - В PATH дописать ;%JAVA_HOME%\bin
            
    - Создаем еще одну переменную окружения JAVA и помещаем в нее %JAVA_HOME%\bin
        
4. Установка Maven
    
    - Скачиваем по ссылке выше, распаковываем в C:\Program Files\Maven
            
    - Добавляем новую переменную окружения MAVEN_HOME, которая смотрит на папку, куда мы его распаковали.
            
    - В PATH добавляем ;%MAVEN_HOME%\bin
            
    - Стартуем новую консоль и проверяем работоспособность Maven командой mvn -version Если у вас всё получилось
        
5. Скачиваем chromedriver отсюда
    
    - создаем у себя папку C:\webdrivers
            
    - кладем скачанный chromedriver в эту папку
            
    - в переменную окружения PATH добавляем ;C:\webdrivers
        
6. Скачиваем и устанавливаем Git
      
    - На последнем экране установки ставим галочку в чекбокс “запустить git bash”
            
    - В открывшемся окне консоли производим начальную настройку git
            
    - git config --global user.name "ИМЯ_ФАМИЛИЯ_ЛАТИНИЦЕЙ"
               
    - git config --global user.email ЕМЕЙЛ
           
3. Если не хочется связываться с vim, то можно указать другой редактор, например:
    
    - git config --global core.editor notepad
              
