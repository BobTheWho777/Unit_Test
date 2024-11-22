package org.example;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {
    private User user1;
    private User user2;
    private User user3;
    @Before
    public void setUp(){
        //Создаем список пользователей которые будет использоваться в тесте
        user1 = new User("Миша", 9, Sex.MALE);
        user2 = new User("Олежа", 24, Sex.FEMALE);
        user3 = new User("Алиса", 28, Sex.FEMALE );
    }

    @Test
    public void getAllUsers(){
        //Выводим список пользователей
        List<User> users = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);

        assertEquals(users, actual);
    }

    @Test
    public void testGetAllUsers() {
        //Выводим список пользователей по полу
        List<User> users = User.getAllUsers(Sex.MALE);
        List<User> actual = new ArrayList<>();
        actual.add(user1);

        assertEquals(users, actual);
        List<User> users2 = User.getAllUsers(Sex.FEMALE);
        List<User> actual2 = new ArrayList<>();
        actual2.add(user2);
        actual2.add(user3);
        assertEquals(users2, actual2);
    }

    @Test
    public void getHowManyUsers() {
        //Выводим количество пользователей
        int expected = 3;
        int actual = User.getHowManyUsers();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetHowManyUsers() {
        //Выводим количество пользователей по полу
        int expected = 1;
        int actual = User.getHowManyUsers(Sex.MALE);
        assertEquals(expected, actual);
        int expected2 = 2;
        int actual2 = User.getHowManyUsers(Sex.FEMALE);
        assertEquals(expected2, actual2);
    }


    @Test
    public void getAllAgeUsers() {
        //Выводим список пользователей по возрасту
        int users= User.getAllAgeUsers();
        int expected = 61;
        assertEquals(users, expected);
    }

    @Test
    public void testGetAllAgeUsers() {
        //Выводим список пользователей по возрасту по полу
        int users = User.getAllAgeUsers(Sex.MALE);
        int expected = 9;
        assertEquals(users, expected);
        int users2 = User.getAllAgeUsers(Sex.FEMALE);
        int expected2 = 52;
        assertEquals(users2, expected2);
    }

    @Test
    public void getAverageAgeOfAllUsers() {
        //Выводим средний возраст пользователей
        int expected = 20;
        int actual = User.getAverageAgeOfAllUsers();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAverageAgeOfAllUsers() {
        //Выводим средний возраст пользователей по полу
        int expected = 9;
        int actual = User.getAverageAgeOfAllUsers(Sex.MALE);
        assertEquals(expected, actual);
        int expected2 = 26;
        int actual2 = User.getAverageAgeOfAllUsers(Sex.FEMALE);
        assertEquals(expected2, actual2);
    }
}