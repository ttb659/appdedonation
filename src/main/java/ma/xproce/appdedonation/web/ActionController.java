package ma.xproce.appdedonation.web;

import ma.xproce.appdedonation.dao.entities.Action;
import ma.xproce.appdedonation.dto.NewActionDto;
import ma.xproce.appdedonation.service.IActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

@Controller
@RequestMapping("/action")
public class ActionController {
    @Autowired
    private IActionService actionService;

    @PostMapping("/save")
    public String saveAction(@ModelAttribute NewActionDto action, Model model) {
        actionService.saveAction(action);
        model.addAttribute("action", "Action saved");
        return "action";
    }

    @GetMapping("/dons/{id}")
   public String listdonforaction(@PathVariable("id") Long id, Model model) {
        model.addAttribute("actions", actionService.findDonByActionID(id));
        return "donsList";
   }

}
