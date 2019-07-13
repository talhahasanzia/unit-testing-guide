import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    private UserService userService;
    // Arrange
    @Mock
    Request request;

    @Mock
    UserRepo userRepo;
    
    @Mock
    User user;

    @Before
    public void setup() {
        userService = new UserService(request, userRepo);
    }
    //------------------------------------------------------//
    
    @Test
    public void testValidAge_inputPositiveNumber_shouldValidateSuccess() {
        // act
        boolean result = userService.validateAge(18);
        // assert
        assertTrue("Expected to validate positive number as valid age but failed", result);
    }
    
    @Test
    public void testCreateUser_validUserProvided_shouldCallRequestExecuteWithUser(){
        // act
        userService.createUser(user);
        // assert
        Mockito.verify(request).execute(user, userService);
        
    }
}
