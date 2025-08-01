package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    @ParameterizedTest

    @ArgumentsSource(UserArgumentsProvider.class)
    public void testSaveNewUser(User user){
        assertTrue(userService.saveNewUser(user));
//    @ValueSource(strings = {
//            "ram",
//            "Krishna",
//            "shivam"
//    })
//    public void testFindByUserName(String name){
//            assertNotNull(userRepository.findByUserName(name));
        }


//  //      assertEquals(4, 2+2);
//        assertNotNull(userRepository.findByUserName("ram"));
//        assertTrue(5>3);


//        public void testFindByUserName(){
//        User user = userRepository.findByUserName("ram");
//        assertTrue(!user.getJournalEntries().isEmpty());
//    }


//    @Disabled
//    @ParameterizedTest
//    @CsvSource({
//            "1,1,2",
//            "2,3,5",
//            "5,6,4"
//    })
//    public void test(int a, int b, int expected){
//        assertEquals(expected, a+b);
//    }
}
