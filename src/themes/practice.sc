theme: /Practice 
    state: Initial
        a: Я предлагаю тебе решить тест. Там встретишь задания на согласование в роде, числе и падеже. Желаю успехов!
        script:
            $session.correct = 0;
            $session.wrongAnswers = 0; 
            $session.correctAnswers = 0; 
        timeout: /Practice/Question1 || interval = "2 seconds"
        
    state: Question1
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question2
        else:
            a: В э́том году́ _______ а́вгуст. 
            buttons:
                "холодный" -> /Practice/Correct
                "холодная" -> /Practice/Wrong 
                "холодные" -> /Practice/Wrong
                "холодное" -> /Practice/Wrong
    
    state: Question2 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question3
        else:
            a: У нас одна́ ______ и три _______ на у́лице.  
            buttons:
                "поликлиника, больницы" -> /Practice/Correct
                "поликлиники, больница" -> /Practice/Wrong
                "поликлиник, больница" -> /Practice/Wrong
                "поликлиники, больницы" -> /Practice/Wrong
            
    state: Question3 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question4
        else:
            a: Андре́й о́чень _____. У него́ нет денег.  
            buttons:
                "бедная" -> /Practice/Wrong
                "бедный" -> /Practice/Correct
                "бедное" -> /Practice/Wrong
                "бедные" -> /Practice/Wrong
            
    state: Question4 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question5
        else:
            a: Са́ша рабо́тает в ______.   
            buttons:
                "банк" ->   /Practice/Wrong
                "банке" ->  /Practice/Correct
                "банку" ->  /Practice/Wrong
                "банком" -> /Practice/Wrong
        
    state: Question5 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question6
        else:
            a: Обы́чно в ка́фе я беру́ _______ ___________.  
            buttons:
                "английская завтрака" -> /Practice/Wrong
                "английское завтрак" -> /Practice/Wrong
                "английский завтрак" -> /Practice/Correct
                "английские завтрак" -> /Practice/Wrong

    state: Question6 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question7
        else:
            a: Мне ну́жно в _______.  
            buttons:
                "аптеку" -> /Practice/Correct
                "аптекой" -> /Practice/Wrong
                "аптека" -> /Practice/Wrong
                "аптеки" -> /Practice/Wrong
        
    state: Question7 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question8
        else:
            a: Мы все́гда говори́м о _____ _______.    
            buttons:
                "но́вых а́втораx" ->  /Practice/Correct
                "но́вые а́вторы" ->   /Practice/Wrong
                "но́выми а́вторами" ->   /Practice/Wrong
                "но́вым а́вторам" ->   /Practice/Wrong
        
    state: Question8 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question9
        else:
            a: Он _______, а она́ _________.
            buttons:
                "арти́стка, арти́ст" ->  /Practice/Wrong
                "арти́ст, арти́стка" ->  /Practice/Correct
                "арти́сты, арти́стки" -> /Practice/Wrong
                "арти́стки, арти́сты" -> /Practice/Wrong

    state: Question9 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 1
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question10
        else:
            a: Я зна́ю все ______ в Москве́. 
            buttons:
                "вокза́л" -> /Practice/Wrong
                "вокза́лы" ->  /Practice/Correct
            
    state: Question10 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question11
        else:
            a: В ______ ________ тяжело́ всё запо́мнить. 
            buttons:
                "большо́м го́роде" ->  /Practice/Correct
                "большо́му го́роду" -> /Practice/Wrong
                "больши́м го́родом" -> /Practice/Wrong
                "большо́й го́род" -> /Practice/Wrong
        
    state: Question11 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question12
        else:
            a: Я в _______, а ты где? А я в _______.
            buttons:
                "библиоте́ка, кинотеа́тре" -> /Practice/Wrong
                "библиоте́ке, кинотеа́тре" ->  /Practice/Correct
                "библиоте́ке, кинотеа́тр" -> /Practice/Wrong
                "библиоте́ка, кинотеа́тр" -> /Practice/Wrong
        
    state: Question12 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question13
        else:
            a: Он взял ______ с у́лицы. Тепе́рь она́ живёт вме́сте с ним.
            buttons:
                "ко́шкой" -> /Practice/Wrong
                "ко́шка" -> /Practice/Wrong
                "ко́шку" -> /Practice/Correct
                "ко́шке" -> /Practice/Wrong
            
    state: Question13 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Question14
        else:
            a: Скажи́ мне свой ________.
            buttons:
                "а́дрес" ->  /Practice/Correct
                "а́дреса" -> /Practice/Wrong
                "а́дресу" -> /Practice/Wrong
                "а́дресе" -> /Practice/Wrong
        
    state: Question14 
        if: $session.correctAnswers === 1 || $session.wrongAnswers === 2
            script:
                $session.wrongAnswers = 0;
                $session.correctAnswers = 0; 
            go!: /Practice/Final
        else:
            a: Он о́чень _______ челове́к. 
            buttons:
                "акти́вное" ->  /Practice/Wrong
                "акти́вная" ->  /Practice/Wrong
                "акти́вный" -> /Practice/Correct
                "акти́вные" -> /Practice/Wrong

    state: Final
        if: $session.correct >= 11 && $session.correct <= 14
            a: Поздравляю тебя с окончанием теста. У тебя {{$session.correct}} баллов из 15. Это отличный результат! Хочешь пройти тест ещё раз для закрепления материала?
            script:
                $analytics.setSessionResult("Оценка отлично (от 11 до 14 баллов)")
        elseif: $session.correct >= 7 && $session.correct <= 10
            a: К сожалению, у тебя {{$session.correct}} балла из 15. Это хороший результат! Хочешь пройти тест ещё раз для закрепления материала?
            script:
                $analytics.setSessionResult("Оценка хорошо (от 7 до 10 баллов)")
        elseif: $session.correct <= 6
            a: К сожалению, у тебя {{$session.correct}} балл из 15. Хочешь пройти тест ещё раз?
            script:
                $analytics.setSessionResult("Тест сдан неудачно (менее 7 баллов)")
        buttons:
            "Да" -> /Practice/Initial
            "В главное меню" -> /Main/Start
            "Пока" -> /Practice/Goodbye 
    
    state: Wrong || noContext = true
        script:
            $session.wrongAnswers += 1; 
        random: 
            a: К сожалению, это неправильный ответ...
            a: Увы, это неверный ответ... 
            a: Было очень близко, но, к сожалению, неправильно...
        go!: {{$context.session.lastState}}
            
    state: Correct || noContext = true
        script:
            $session.correct += 1; 
            $session.correctAnswers += 1; 
            log("SESSION CONTEXT PATH " + $session.contextPath); 
            log("CONTEXT CONTEXT PATH " + $context.contextPath); 
            log("CURRENT STATE " + $context.currentState + " " + $session.currentState); 
            log("LAST STATE " + $context.lastState + " " + $session.lastState);
            log("CONTEXT SESSION LAST STATE "+ $context.session.lastState);
        random:
            a: Абсолютно точно, молодец!
            a: Да, именно так!
            a: Совершенно верно!
        go!: {{$context.session.lastState}}

    state: Goodbye 
        random:
            a: Пока-пока, я была рада пообщаться с тобой! Желаю успехов в изучении русского языка!
            a: До скорых встреч, мне было приятно проводить с тобой время!
            a: Пока, желаю успехов в изучении русского языка!
            a: Была рада тебе помочь, до скорых встреч!
        script:
            $jsapi.stopSession(); 
        
    
    
