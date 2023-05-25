import model.Employee;
import model.EmployeeBook;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.findEmployee("Королёв Ефим Тимофеевич");
//1. Перенести проект с EmployeeBook на Map в качестве хранилища сотрудников, реализовав методы добавления, удаления и поиска.
//2. Продумать контракт для ключей, чтобы сотрудник с одним ФИО существовал только в одном экземпляре, корректно добавлялся и удалялся.
//3. Избавиться от циклов в методах по поиску сотрудника, заменив на методы Map.
//4. Переработать все методы по работе с хранилищем на работу с методами Map.
    }
}