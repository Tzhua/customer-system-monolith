package com.tzh.cs.controller.graphql.datawiring;

import com.tzh.cs.controller.graphql.datafetcher.CustomerStaffDataFetcher;
import graphql.schema.idl.RuntimeWiring;
import com.tzh.cs.controller.graphql.datafetcher.AllCustomerStaffsDataFetcher;
import com.tzh.cs.controller.graphql.datafetcher.CustomerGroupDataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.boot.RuntimeWiringBuilderCustomizer;
import org.springframework.stereotype.Component;

@Component
public class CustomerStaffDataWiring implements RuntimeWiringBuilderCustomizer {

    @Autowired
    private AllCustomerStaffsDataFetcher allCustomerStaffsDataFetcher;

    @Autowired
    private CustomerStaffDataFetcher customerStaffDataFetcher;

    @Autowired
    private CustomerGroupDataFetcher customerGroupDataFetcher;

    @Override
    public void customize(RuntimeWiring.Builder builder) {

        builder.type("Query", typeWiring -> typeWiring
                    .dataFetcher("staffs", allCustomerStaffsDataFetcher)
                    .dataFetcher("staff", customerStaffDataFetcher))
                .type("CustomerStaff", typeWiring -> typeWiring
                    .dataFetcher("group", customerGroupDataFetcher));
    }
}
