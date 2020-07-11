# Aprenda Testes Unitários Aplicados em Java com Junit & Mockito em 30 Passos

![GitHub](https://img.shields.io/github/license/pricardoti/learn-java-unit-testing-with-mockito)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/pricardoti/learn-java-unit-testing-with-mockito?color=green)

Aprenda JUnit & Mockito para criar teste unitários e mock´s em Java com 25 Examples, escrever testes únitarios vai distinguir e tornar bons programadores em profissionais ainda melhores...

**Link GitHub:** [JUnitIn28Minutes](https://github.com/in28minutes/JUnitIn28Minutes) and [MockitoTutorialForBeginners](https://github.com/in28minutes/MockitoTutorialForBeginners) <br />
**Link Udemy:** [Course Learn Java Unit Testing with Junit & Mockito in 30 Steps](https://www.udemy.com/course/mockito-tutorial-with-junit-examples/)

## Mockito

#### Instalando as ferramentas:
**PDF:** https://github.com/in28minutes/SpringIn28Minutes/blob/master/InstallationGuide-JavaEclipseAndMaven_v2.pdf <br />
**Video:** https://www.youtube.com/watch?v=eqRF4xHoGck

#### Curiosidades:

- **O que é mock?** Mock é criar objetos que simulam o comportamento de objetos reais. Diferentemente dos stubs, as simulações podem ser criadas dinamicamente a partir do código - em tempo de execução.

- **Hamcrest** é a estrutura conhecida usada para testes de unidade no ecossistema Java. Ele é empacotado no JUnit e, simplesmente, usa predicados existentes - chamados classes de correspondência - para fazer comparações (*Asserts/Matchers*).
- **Mock vs. Spy:** Quando o Mockito cria uma simulação a partir da Classe de um tipo, não de uma instância real. O mock simplesmente cria uma instância da Classe, totalmente instrumentada para rastrear interações com ela. Por outro lado, o Spy quebra uma instância existente . Ele ainda se comportará da mesma maneira que a instância normal - a única diferença é que ele também será instrumentado para rastrear todas as interações com ele.
- **PowerMock:** "O PowerMock é um dos frameworks de teste unitário mais poderosos disponíveis para o Java. Seu objetivo é transpassar algumas limitações que os frameworks de testes unitários EasyMock e Mockito têm, fornecendo mais recursos para lidar com algumas situações específicas." -
- **Uso do ```verify```** ele permite adiconar mais comportamentos que vão tornar os testes ainda mais dinamicos, permitindo verificar a quantidade de execução, ou se, algum execução foi realizada com determinada chamada (parâmetros) o ```verify(T mock, VerificationMode mode)``` pode ser uma solução simples para mutios cenários.
- **JUnit Rules:** Usando ```MockitoJUnit.rule()``` ao invés do ```@RunWith(MockitoJUnitRunner.class)```. 
Dherik Barison

#### Troubleshooting
Consulte o nosso Guia de solução de problemas - https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ

#### Youtube Playlists - 500+ Videos

[Click here - 30+ Playlists with 500+ Videos on Spring, Spring Boot, REST, Microservices and the Cloud](https://www.youtube.com/user/rithustutorials/playlists?view=1&sort=lad&flow=list)

#### Continue aprendendo in28Minutes

in28Minutes is creating amazing solutions for you to learn Spring Boot, Full Stack and the Cloud - Docker, Kubernetes, AWS, React, Angular etc. - [Check out all our courses here](https://github.com/in28minutes/learn)

**Referências:**

1. [Baeldung Mockito](https://www.baeldung.com/tag/mockito/)
2. [Conteúdo sobre mockito](https://www.javatpoint.com/mockito)
3. [Link Documentação JUnit Rules](https://www.javadoc.io/doc/org.mockito/mockito-core/2.8.9/org/mockito/junit/MockitoRule.html)

---

###### Aaaah, se curtiu, não esquece de deixar a :star:

---
