

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class UserService2Test {

    private UserService2 userService;

    @Mock
    Request request;

    @Mock
    UserRepo userRepo;

    @Mock
    User user;

    @Mock
    private Response response;

    @Before
    public void setup() {

        userService = new UserService2(request, userRepo, response);
        mockRequestCallbackResponse();
    }

    @Test
    public void testValidAge_inputPositiveNumber_shouldValidateSuccess() {
        // act
        boolean result = userService.validateAge(18);
        // assert
        assertTrue("Expected to validate positive number as valid age but failed", result);
    }


    @Test
    public void testCreateUser_validUserProvided_shouldCallRequestExecuteWithUser() {
        // act
        userService.createUser(user);
        // assert
        Mockito.verify(request).execute(user, response);
        Mockito.verify(response).onSuccess(user);

    }

    private void mockRequestCallbackResponse() {
        Mockito.doAnswer((Answer<Void>) invocation -> {
            Response callback = (Response) invocation.getArguments()[1];
            callback.onSuccess(user);
            return null;
        }).when(request).execute(user, response);
    }

}