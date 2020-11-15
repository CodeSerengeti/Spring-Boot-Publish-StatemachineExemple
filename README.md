## Where this project comes from

This project is copied from [duqicauc](https://github.com/duqicauc)/**[Spring-Boot-2.x-In-Action](https://github.com/duqicauc/Spring-Boot-2.x-In-Action)**. Unfortunately for some reason it cannot run on my computer Java1.8 and IntelliJ. So I diagnosed it and re-create it.

## Issues I come across and how I solve them

1. The Run button is not accessible,and meanwhile all Java files’ icons are with a" J" symbol rather than "C". 

   ![image-20201115052257588](G:\JAVALearn\JavaNotes\pics\image-20201115052257588.png)

   This is pretty easy to solve by click [Project Structure]-[Modules]-[Source], and delete the Content Root  by lick the x if there is any.

![img](G:\JAVALearn\JavaNotes\pics\clip_image002.jpg)

2. When try to run the program, It shows Error: Could not find or load main class online.javaadu.statemachinedemo.StatemachinedemoApplication

   ![image-20201115075915555](G:\JAVALearn\JavaNotes\pics\image-20201115075915555.png)

   I googled this problem and one solution is to rebuild this program by clicking [Build] menu and select [Rebuild Project]. But then got another problem as follows:

![image-20201115080727182](G:\JAVALearn\JavaNotes\pics\image-20201115080727182.png)

3. It made me no choice, I have to create a new project and add all java class into the project and it works perfectly. 

Hopefully all of above is helpful to new guys who download this program.

## Difference between this project and original project

Beside the wording in BizBean.java, there is even no java class difference between the two. I just re-create it for IntelliJ environment and Java1.8 to let it run correctly.

