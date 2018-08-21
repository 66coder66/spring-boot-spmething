package com.ybg.social.core.properties;
import org.springframework.boot.autoconfigure.social.SocialProperties;

import com.ybg.enums.SocialTypeEnum;

/**
 * @author Deament
 * @date 2017/10/1
 **/
public class MayunProperties extends SocialProperties {
    
    private String providerId = SocialTypeEnum.MAYUN.getValue();
    
    public String getProviderId(){
        return providerId;
    }
    
    public void setProviderId(String providerId){
        this.providerId = providerId;
    }
}