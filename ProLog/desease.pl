symptom('cough').
symptom('dark eyes').
symptom('legs pain').
symptom('stomach pain').

treatment('Corona', 'get shot').
treatment('Fever', 'crocin').

input:-
    repeat,
    symptom(X),
    write('do you have  '),
    write(X),
    nl,
    read(X),
    patient(X,Y),
    write(Y).
    

patient(X,Y):-
    symptom(X),
    treatment(Y).