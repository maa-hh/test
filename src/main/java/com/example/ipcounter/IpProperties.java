package com.example.ipcounter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component("ipProperties")
//@ConfigurationProperties(prefix = "tools.ip")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "tools.ip")
//@Component
public class IpProperties {
    private long cycle=10l;
    private boolean cycleReset=false;
   private String mode= LogModel.Detail.value;
    public  enum LogModel{
        Detail("detail"),
       Simple("simple");
        private String value;
        private LogModel(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
   }
}
