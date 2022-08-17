package br.com.lucasfranzoni.monique.controller;

import br.com.lucasfranzoni.monique.usecase.FaseUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class FaseController {

    private final FaseUseCase usecase;

    @GetMapping("/fase")
    public Object mostrarFase(@RequestParam Long numero, @RequestParam(required = false) String resposta) {
        try {
           return usecase.mostrarFase(numero, resposta);
        } catch (Exception e) {
            return "redirect:/resposta_incorreta";
        }
    }
}
