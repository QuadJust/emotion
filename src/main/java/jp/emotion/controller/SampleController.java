package jp.emotion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.emotion.repository.YoutubeRepository;

@Controller
public class SampleController {
    @Autowired
    private YoutubeRepository youtubeRepository;
    
    @RequestMapping(value = "/sample", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object sample(@RequestParam String arg) {
        return null; 
        //return youtubeRepository.searchByKeyword(arg);
    }
    
}
