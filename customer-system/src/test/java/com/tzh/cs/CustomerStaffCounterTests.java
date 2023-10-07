package com.tzh.cs;

import com.tzh.cs.metrics.CustomerStaffCount;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerStaffCounterTests {

    @Test
    public void testCountCustomerStaffPhoneNumber() {

        CustomerStaffCount.countPhoneNumber("13355667788");
        CustomerStaffCount.countPhoneNumber("13355667788");

        CustomerStaffCount.countPhoneNumber("13355667789");

        assertThat(CustomerStaffCount.getPhoneNumberCount("13355667788")).isEqualTo(2);
    }

}
