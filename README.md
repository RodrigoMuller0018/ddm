# Atividade 1 – View, ViewGroup e LayoutParams

## A. O que é uma View no Android Framework?

View é basicamente qualquer elemento que aparece na tela do app e com o qual o usuário pode interagir ou visualizar. Pode ser um botão, um campo de texto, uma imagem, entre outros. Tudo o que a gente vê ou clica geralmente é uma View. No Android, todas elas herdam da classe chamada `View`.

---

## B. O que é um ViewGroup no contexto da interface do Android?

Um ViewGroup é um tipo de componente que serve pra **agrupar outras Views**. Ele funciona como um contêiner, organizando os elementos da tela de um jeito específico. Por exemplo, se a gente quer colocar vários botões em linha ou empilhados, usamos um `LinearLayout`, que é um tipo de ViewGroup.

---

## C. Qual é a função dos LayoutParams dentro de um ViewGroup?

Os `LayoutParams` são usados pra dizer **como as Views vão se comportar dentro de um ViewGroup**, tipo o tamanho, se vai ocupar toda a largura, altura, se tem margem, etc. Cada View que a gente coloca dentro de um layout precisa desses parâmetros.

---

## D. Por que diferentes ViewGroups (como LinearLayout, ConstraintLayout, FrameLayout) utilizam subclasses específicas de LayoutParams?

Porque cada ViewGroup tem um jeito diferente de organizar os elementos, então eles precisam de LayoutParams diferentes pra isso. Por exemplo, o `LinearLayout` usa `weight`, que é uma propriedade que outros layouts não usam. Já o `ConstraintLayout` tem parâmetros de restrição pra alinhar os elementos entre si. Por isso, cada um tem sua própria "versão" de LayoutParams.

---
