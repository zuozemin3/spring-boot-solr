package com.zzm.user.service.impl;

import com.zzm.user.service.UserService;
import com.zzm.user.vo.UserVo;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SolrTemplate solrTemplate;

    @Override
    public UserVo getUserByName(String name) {
        return null;
    }

    @Override
    public Integer insertUser(UserVo userVo) {
        UpdateResponse updateResponse = solrTemplate.saveBean(userVo);
        return updateResponse.getStatus();
    }


}
