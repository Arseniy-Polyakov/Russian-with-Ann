theme: /MainGender
    state: Gender
        a: Род – это свойство слова, которое встречается у существительных, прилагательных и местоимений.
        a: В русском языке есть три рода: мужской, женский и средний. 
        a: Начнем все сначала или перейдем к определенной части речи? Нажми на кнопку ниже, и я продолжу свой рассказ...
        buttons: 
            "Сначала" -> /MainGender/Gender/NounGender
            "Существительное" -> /MainGender/Gender/NounGender 
            "Прилагательное" -> /MainGender/Gender/AdjectiveGender
            "Местоимение" -> /MainGender/Gender/PronounGender
            "В главное меню" -> /Main/Start
        
        state: NounGender
            a: Одного правила для определения рода у существительных (имен существительных) нет. 
            a: Существительные (имена существительные) мужского рода часто оканчиваются на согласную букву или на гласные -а или -я.
            a: Например: 
                •	курс 
                •	ужин 
                •	турист
                •	папа
                •	автобус 
                •	банк 
                •	дядя
            a: Продолжим про женский род существительных?
            buttons:
                "Да" -> /MainGender/Gender/NounGender/FeminineGender
                "В начало" -> /MainGender/Gender
                "В главное меню" -> /Main/Start
            
            state: FeminineGender
                a: Существительные (имена существительные) женского рода часто оканчиваются на -а или -я.
                a: Например:
                    •	дорога 
                    •	виза 
                    •	буква
                    •	женщина 
                    •	книга
                    •	мама
                    •	песня
                    •	учительница
                    •	курица 
                    •	лампа
                a: Остался средний род, начнем его изучать вместе?
                buttons:
                    "Да" -> /MainGender/Gender/NounGender/NeutralGender
                    "В начало" -> /MainGender/Gender
                    "В главное меню" -> /Main/Start
                
            state: NeutralGender
                a: Существительные (имена существительные) среднего рода часто оканчиваются на -о, -е, или -я. 
                a: Например: 
                    •	яблоко
                    •	имя 
                    •	лето
                    •	озеро 
                    •	здание
                a: А сейчас я расскажу тебе про особые существительные я русском языке. Начнём?
                buttons:
                    "Да" -> /MainGender/Gender/NounGender/Special
                    "В начало" -> /MainGender/Gender
                    "В главное меню" -> /Main/Start
                
            state: Special 
                a: Существительные, которые оканчиваются на -Ь могут быть, как и мужского, так и женского рода. Их нужно запоминать: 
                a: Существительные мужского рода, оканчивающиеся на -ь: 
                   •	строитель
                   •	февраль
                   •	январь 
                   •	учитель
                a: Существительные женского рода, оканчивающиеся на -ь: 
                   •	дочь 
                   •	тетрадь
                   •	жизнь
                   •	любовь 
                a: А теперь тебя ждут самые популярные русские имена мужского и женского рода. Начнём?
                buttons:
                    "Да" -> /MainGender/Gender/NounGender/Names 
                    "В начало" -> /MainGender/Gender
                    "В главное меню" -> /Main/Start
        
            state: Names 
                a: Также нужно запомнить часто встречающиеся мужские и женские имена на русском языке. Они тоже являются существительными. 
                a: Мужские имена: 
                   •	Александр 
                   •	Иван 
                   •	Андрей 
                   •	Михаил 
                   •	Дмитрий
                a: Женские имена: 
                   •	София
                   •	Анна 
                   •	Мария 
                   •	Ева 
                   •	Виктория
                a: На этом все! Продолжим дальше, повторим существительные снова, или ты хочешь выбрать определенную часть речи? Не забудь нажать на кнопку, я только с помощью них умею объяснять грамматику...
                buttons:
                    "Продолжим дальше" -> /MainGender/Gender/AdjectiveGender
                    "Ещё раз про существительные" -> /MainGender/Gender/NounGender
                    "Прилагательные" -> /MainGender/Gender/AdjectiveGender
                    "Местоимения" -> /MainGender/Gender/PronounGender
                
        state: AdjectiveGender
            a: Прилагательные мужского рода оканчиваются на -ий, -ый или -ой
            a: Например: 
               •	русский 
               •	хороший 
               •	большой
               •	счастливый 
               •	чёрный 
               •	вкусный
            a: Продолжим про женский род прилагательных?
            buttons:
                "Да" -> /MainGender/Gender/AdjectiveGender/FeminineGenderAdj
                "В начало" -> /MainGender/Gender
                "В главное меню" -> /Main/Start
            
            state: FeminineGenderAdj
                a: Прилагательные женского рода оканчиваются на -ая или -яя
                a: Например: 
                   •	русская
                   •	хорошая 
                   •	счастливая 
                   •	синяя
                   •	чёрная
                   •	вкусная
                a: Продолжим про средний род прилагательных?
                buttons:
                    "Да" -> /MainGender/Gender/AdjectiveGender/NeutralGenderAdj
                    "В начало" -> /MainGender/Gender
                    "В главное меню" -> /Main/Start
                
            state: NeutralGenderAdj 
                a: Прилагательные среднего рода оканчиваются на -ое или -ее
                a: Например: 
                    •	русское
                    •	хорошее 
                    •	счастливое
                    •	синее
                    •	чёрное
                    •	вкусное
                a: На этом всё. Надеюсь, тебе все было понятно. Но если возникли трудности, то я могу объяснить тебе снова. Рассказать про прилагательные ещё раз или мы идём дальше, у нас осталась последняя часть речи. Также ты можешь выбрать другую часть речи. Не забывай про кнопку...
                buttons:
                    "Дальше" -> /MainGender/Gender/PronounGender
                    "Ещё раз про прилагательные" -> /MainGender/Gender/AdjectiveGender
                    "Существительные" -> /MainGender/Gender/NounGender
                    "Местоимения" -> /MainGender/Gender/PronounGender
        
        state: PronounGender
            a: Местоимения бывают мужского и женского рода. 
            a: Местоимения он, его и этот мужского рода. Местоимения она, её и эта женского рода. 
            a: Например: 
               •	Он мальчик, а она девочка 
               •	Её зовут Мария, а его Андрей 
               •	Этот учитель, эта учительница 
            a: Вот мы и закончили в теорией по согласованию в роде. Хочешь, я покажу тебе примеры правильного и неправильного согласований?
            buttons:
                    "Да" -> /MainGender/Gender/RightAndWrongGender
                    "В начало" -> /MainGender/Gender
                    "В главное меню" -> /Main/Start
            
        state: RightAndWrongGender 
            a: Чтобы согласовать прилагательное и существительное или местоимение и существительное в роде, нужно выбрать правильный род для каждого слова.            
            a: Это правильные согласования: 
               •	Красивый (мужской род) дом (мужской род)
               •	Сложная (женский род) грамматика (женский род)
               •	Красивое (средний род) озеро (средний род)
               •	Этот (мужской род) учитель (мужской род)
               • 	Эта (женский род) девочка (женский род)
               •	Это (средний род) озеро (средний род)
            a: Это НЕправильные согласования: 
               •	Красивая (женский род) дом (мужской род)
               •	Сложный (мужской род) грамматика (женский род)
               •	Красивый (мужской род) озеро (средний род)
               •	Эта (женский род) учитель (мужской род)
               •	Этот (мужской род) девочка (женский род)
               •	Эта (женский род) озеро (средний род)
            a: Вот мы и закончили изучать тему согласования в роде. Ты молодец, получилось справиться с таким сложным материалом! Горжусь тобой! Продолжим изучать согласование или повторим эту тему? Также ты можешь перейти к другой теме, для этого нужно лишь нажать на кнопку...
            buttons:
                "Согласование в числе" -> /MainNumber/Number 
                "Согласование в падеже" -> /MainCase/Case
                "Начать заново. Тема согласование в роде" -> /MainGender/Gender
                "Начать практику" -> /Practice/Initial"
            
        
        
  
