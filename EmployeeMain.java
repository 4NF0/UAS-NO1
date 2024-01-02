/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author nm
 */
public class EmployeeMain {
    
    public static void main(String[] args) {
        Manager manajer = new Manager("Kairi");
        Developer pengembang = new Developer("Rexa");
        Designer desainer = new Designer("Snowy");

        manajer.work();
        pengembang.work();
        desainer.work();
    }
}

