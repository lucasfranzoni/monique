package br.com.lucasfranzoni.monique.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class CaminhoExtraController {

    @GetMapping("/deboismo")
    public ModelAndView deboismo() {
        return new ModelAndView("fase6B");
    }

    @GetMapping("/deboismo/teprocuravadenovo")
    public ModelAndView teProcuravaDeNovo() {
        return new ModelAndView("fase6C");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo")
    public ModelAndView minimalsmo() {
        return new ModelAndView("fase6D");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro")
    public ModelAndView culpaDoCerebro() {
        return new ModelAndView("fase6E");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal")
    public ModelAndView nossoQuintal() {
        return new ModelAndView("fase6F");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal/zero")
    public ModelAndView zero() {
        return new ModelAndView("fase6G");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal/zero/espumante")
    public ModelAndView espumante() {
        return new ModelAndView("fase6H");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal/zero/espumante/aarvoredodinheiro")
    public ModelAndView aarvoreDoDinheiro() {
        return new ModelAndView("fase6I");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal/zero/espumante/aarvoredodinheiro/corra")
    public ModelAndView corra() {
        return new ModelAndView("fase6J");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal/zero/espumante/aarvoredodinheiro/corra/virgem")
    public ModelAndView virgem() {
        return new ModelAndView("fase6K");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal/zero/espumante/aarvoredodinheiro/corra/virgem/urubici")
    public ModelAndView urubici() {
        return new ModelAndView("fase6L");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal/zero/espumante/aarvoredodinheiro/corra/virgem/urubici/botlane")
    public ModelAndView botLane() {
        return new ModelAndView("fase6M");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal/zero/espumante/aarvoredodinheiro/corra/virgem/urubici/botlane/loirao")
    public ModelAndView loirao() {
        return new ModelAndView("fase6N");
    }

    @GetMapping("/deboismo/teprocuravadenovo/minimalismo/culpadocerebro/nossoquintal/zero/espumante/aarvoredodinheiro/corra/virgem/urubici/botlane/loirao/rainhadasseries")
    public ModelAndView rainhaDaSeries() {
        return new ModelAndView("fase6O");
    }

}
