bind("postProcess", function($context){
    $context.session.lastState = $context.currentState;
});
