import com.codegym.cms.controller.CustomerController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class CustomerControllerTest {
    @Test
    void  assertionWorked(){

        int  actual=1+1;

        int excepted= 2;

        assertEquals( actual,excepted);


    }

    private MockMvc mockMvc;

    @InjectMocks
    private CustomerController customerController;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
    }
    @Test
    void customersListPageIsExits() throws  Exception{
        mockMvc
                .perform(get("/customer/list"))
                .andExpect(status().is(200));
    }


}
