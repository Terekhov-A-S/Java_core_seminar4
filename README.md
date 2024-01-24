# Java Core (семинары)

![picture for project](https://raw.githubusercontent.com/Terekhov-A-S/Java_core_seminar4/main/src/main/resources/Java_core.jpg)

## Урок 4. Обработка исключений

[к решению 1 ЗАДАЧИ](https://github.com/Terekhov-A-S/Java_core_seminar3?tab=readme-ov-file#решение)  ||  [к решению 2 ЗАДАЧИ](https://github.com/Terekhov-A-S/Java_core_seminar3?tab=readme-ov-file#решение-1)  ||  [к решению ДОПОЛНИТЕЛЬНОЙ ЗАДАЧИ](https://github.com/Terekhov-A-S/Java_core_seminar3?tab=readme-ov-file#решение-2)


[перейти в Main](https://github.com/Terekhov-A-S/Java_core_seminar3/blob/main/src/main/java/Main.java)


### Задача 1.

В класс покупателя добавить перечисление с гендерами, внедрить Lombok https://habr.com/ru/articles/345520/

#### Решение

Для начала необходимо добавить плагины lombok в IDE. В моей версии Intellij IDEA они добавлены и включены:

![LombokPlugin](https://raw.githubusercontent.com/Terekhov-A-S/Java_core_seminar4/main/src/main/resources/LombokPlugin.png)

Затем добавляем необходимый блок кода в файл pom.mxl:

```xml
<dependencies>
	<dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<version>1.18.30</version>
		<scope>provided</scope>
	</dependency>
</dependencies>
```

После обновления Maven должно получиться так:

![LombokXML](https://raw.githubusercontent.com/Terekhov-A-S/Java_core_seminar4/main/src/main/resources/LombokXML.png)

Далее добавляем четвертое поле gender, а так же пишем метод проверки муж/жен:

![Gender](https://raw.githubusercontent.com/Terekhov-A-S/Java_core_seminar4/main/src/main/resources/AddedGender.png)

*+*

<details>

  <summary>Нажмите, чтобы открыть КОД</summary>

```java
package Shop;

import lombok.*;

@Data
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Customer {
    private String surnameFirstNamePatronymic;
    private int age;
    private String phone;
    private String gender;

    public boolean isMale() {
        return "муж".equalsIgnoreCase(gender);
    }
}

```

</details>

А так же не забываем заполнить вновь добавленное поле в Main:

![Gender](https://raw.githubusercontent.com/Terekhov-A-S/Java_core_seminar4/main/src/main/resources/AddedGender2.png)

---


### Задача 2.

Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

#### Решение

Давайте добавим класс руководителя (Manager), который будет наследоваться от класса Employee. В этом классе мы определим статический метод для повышения зарплаты, учитывая условие, что зарплата руководителя не должна повышаться.

<details>

  <summary>Нажмите, чтобы открыть код</summary>

```java

```
</details>

В этом примере мы добавили метод increaseSalary в класс Manager, который увеличивает зарплату для всех сотрудников, кроме руководителей. Также в основной программе мы создали руководителя и добавили его в массив сотрудников, затем повысили зарплату всем сотрудникам и вывели результат. Зарплата руководителя осталась неизменной.

<details>

<summary>Нажмите, чтобы открыть скриншот проверки</summary>

![picture for project2](https://raw.githubusercontent.com/Terekhov-A-S/Java_core_seminar3/main/src/main/resources/Proverka.png)

</details>

---


### Дополнительно:




#### Решение

Используя Stream API, мы можем легко выполнить это задание. Давайте создадим список студентов и применим необходимые операции:

<details>

  <summary>Нажмите, чтобы открыть код</summary>

```java

```
</details>

В этом примере мы используем Stream API для фильтрации, сортировки и лимитирования студентов в соответствии с заданными условиями.

<details>

<summary>Нажмите, чтобы открыть скриншот проверки</summary>

![picture for project3](https://raw.githubusercontent.com/Terekhov-A-S/Java_core_seminar3/main/src/main/resources/Students.png)

</details>

---
*Подготовил студент Geek Brains* [**`Терехов Александр`**](https://gb.ru/users/1db43d0f-6c3d-46d1-bf5e-974b49af6f0d), Java_core_seminar4