package ch.bbw.wth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WthController {
    @GetMapping("/wth")
    public String wthFormt(Model model) {
        model.addAttribute("wth", new Wth());
        return "wth_form";
    }
    @PostMapping("/wth")
    public String wthSubmit(Model model, @ModelAttribute Wth wth) {
        wth.calculateWth();
        model.addAttribute("wth", wth);
        return "wth_result";
    }
}