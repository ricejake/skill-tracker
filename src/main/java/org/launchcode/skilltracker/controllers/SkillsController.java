package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
public class SkillsController {

@RequestMapping(value="")
@ResponseBody
    public String displaySkills () {
        String html = "<h1> Skills Tracker </>" +
                "<h2> We have a few skills... </>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>";
        return html;


}


}
