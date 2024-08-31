theme: /Architecture
    state: AnswerGPT 
        script:
            $temp.messages = [{"role": "user", "content": "Выбери один из известных памятников русской архитектуры и расскажи про него. Памятники не должны повторяться при новом запросе. Текст должен быть не более 50 слов, лексика простая."}]
            $temp.GPTPrompt = $gpt.createChatCompletion($temp.messages);
            $temp.GPTAnswer = $temp.GPTPrompt.choices[0].message.content;
            $reactions.answer($temp.GPTAnswer);
        