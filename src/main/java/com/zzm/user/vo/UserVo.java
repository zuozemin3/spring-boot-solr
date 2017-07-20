package com.zzm.user.vo;

import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.io.Serializable;

@SolrDocument(solrCoreName = "collection1")
public class UserVo implements Serializable {
    @Indexed(name = "id")
    private Integer id;

    @Indexed(name = "userId")
    private Integer userId;

    @Indexed(name = "userName")
    private String userName;

    @Indexed(name = "userAddress")
    private String userAddress;
}
