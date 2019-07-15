package com.example.paca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;


@Controller
public class PacaController {

    int score= 0;
    @GetMapping("start-game")
    public ModelAndView startgame(
        @RequestParam("username") String username,
        @RequestParam("email") String email ){
        ModelAndView modelAndView = new ModelAndView("game");
        modelAndView.addObject("score","0");
        return modelAndView;
    }

    @GetMapping("red")
    public ModelAndView red(){
        ModelAndView modelAndView = new ModelAndView("game");
        double random = Math.random();
     //   String choosed="";
        Option choosed = null;
        if(random <0.5d){
            choosed= Option.RED;

      //  choosed = "redd";
    }else { choosed = Option.BLUE
         //   choosed = "blue"
        }
        if(choosed == Option.RED){
            score = score+1;
            modelAndView.addObject("score", score);
            return modelAndView
        }
        else{
            ModelAndView modelAndView1 = new ModelAndView("game");
            modelAndView
        }
       // if(choosed.equals("red"))
    }


