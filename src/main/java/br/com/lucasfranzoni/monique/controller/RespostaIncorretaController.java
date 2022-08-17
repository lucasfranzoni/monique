package br.com.lucasfranzoni.monique.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class RespostaIncorretaController {

    @GetMapping("/resposta_incorreta")
    public ModelAndView respostaIncorreta() {
        return new ModelAndView("error");
    }
}
