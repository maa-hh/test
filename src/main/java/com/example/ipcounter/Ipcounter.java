package com.example.ipcounter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Component
public class Ipcounter {


    private HashMap<String,Integer> counter=new HashMap<>();
    HttpServletRequest re;

    @Scheduled(cron = "0/#{ipProperties.cycle} * * * * ?")
    public void print(){
        for(Map.Entry<String,Integer> c:counter.entrySet()){
            System.out.println(c.getKey()+" "+c.getValue());
        }
    }
    public int count(){
       String ip= re.getRemoteAddr();
       counter.put(ip, counter.getOrDefault(ip,0)+1);
       return counter.getOrDefault(ip,-1);
    }
}
