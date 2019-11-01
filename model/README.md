# Gli oggetti del Dominio
## Scuola
La Scuola rappresenta il massimo livello di Aggregazione, le sue caratteristiche sono ovviamente il nome.
La Scuola puo' avere le aule tematiche o quelle tradizionali, nel primo caso gli studenti si spostano mentre i professori
rimangono in aula, nelle tradizionali gli alunni rimangono in classe e si spostano i professori.
## Classe
Ogni Scuola ha un certo numero di classi, le classi vanno distinte per sezione e per anno.
## Disciplina
Ogni Classe ha un certo numero di Discipline che variano in base al'anno della classe. Ogni Disciplina può avere un certo numero di lezioni
a settimana
## Insegnante
L'insegnante può insegnare una o più Discipline
# I vincoli
- Discipline per classe.
- Numero di ore di ciascuna disciplina per classe
