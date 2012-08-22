package org.rest.sec.client.template.test;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.rest.common.client.AbstractClientSortAndPaginationRESTIntegrationTest;
import org.rest.common.client.IEntityOperations;
import org.rest.sec.client.template.PrivilegeClientRESTTemplate;
import org.rest.sec.client.template.PrivilegeRESTTemplateImpl;
import org.rest.sec.model.Privilege;
import org.rest.sec.spring.client.ClientTestConfig;
import org.rest.sec.spring.context.ContextTestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ContextTestConfig.class, ClientTestConfig.class }, loader = AnnotationConfigContextLoader.class)
@Ignore
public class PrivilegeClientSortAndPaginationRESTIntegrationTest extends AbstractClientSortAndPaginationRESTIntegrationTest<Privilege> {

    @Autowired
    private PrivilegeClientRESTTemplate clientTemplate;
    @Autowired
    private PrivilegeRESTTemplateImpl entityOps;

    public PrivilegeClientSortAndPaginationRESTIntegrationTest() {
        super();
    }

    // tests

    // template method

    @Override
    protected final PrivilegeClientRESTTemplate getAPI() {
        return clientTemplate;
    }

    @Override
    protected final IEntityOperations<Privilege> getEntityOps() {
        return entityOps;
    }

}