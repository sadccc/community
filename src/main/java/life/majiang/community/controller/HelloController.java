package life.majiang.community.controller;

import life.majiang.community.entity.Device;
import life.majiang.community.entity.StationInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }


    @RequestMapping("/test.action")
    @ResponseBody
    public Object  test(){
        StationInfo s= new StationInfo();
        Device device1=new Device();
        device1.setDeviceName("device1");
        device1.setDeviceId(3392);
        Device device2=new Device();
        device2.setDeviceName("device2");
        List<Device> devices=new ArrayList<Device>();
        devices.add(device1);
        devices.add(device2);
        s.setResDevices(devices);
        return s;

    }
}
