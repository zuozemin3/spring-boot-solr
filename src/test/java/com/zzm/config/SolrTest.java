package com.zzm.config;

import org.apache.solr.client.solrj.SolrResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
public class SolrTest {
    @Autowired
    private SolrTemplate solrTemplate;

    @Test
    public void SolrConnectTest() {
        SolrResponse solrResponse = solrTemplate.ping();
        solrResponse.getResponse();
        Assert.assertEquals("OK",solrResponse.getResponse().get("status"));
    }

}
