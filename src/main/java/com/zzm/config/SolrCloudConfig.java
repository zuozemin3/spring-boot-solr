package com.zzm.config;

import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrTemplate;

@Configuration
public class SolrCloudConfig {

    @Value("${solr.zkHost}")
    private String zkHost;

    @Bean
    public CloudSolrClient solrServer() {
        return new CloudSolrClient(zkHost);
    }

    @Bean
    public SolrTemplate solrTemplate(CloudSolrClient cloudSolrClient) throws Exception {
        return new SolrTemplate(cloudSolrClient);
    }
}
