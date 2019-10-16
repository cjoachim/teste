package com.csjoachim.citest;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HelloControllerTest {

    @Test
    public void  testOne (){
        HelloController helloController =   new HelloController();
        String result = helloController.index  (null);

        assertThat(result).isEqualTo ("hello world");

    }

    @Test
    public void  should_return_HelloJoachim_param_is_Joachim() {
        HelloController helloController =   new HelloController();
        String result = helloController.index("Joachim");

        assertThat(result).isEqualTo ("Hello Joachim");

    }


}



