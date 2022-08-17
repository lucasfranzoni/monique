package br.com.lucasfranzoni.monique.usecase;

import br.com.lucasfranzoni.monique.enums.Fase;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class FaseUseCase {

    public ModelAndView mostrarFase(Long numero, String resposta) {
        var fase = Fase.obterPorNumero(numero);
        verificarResposta(fase, resposta);
        return new ModelAndView(fase.getNome());
    }

    public void verificarResposta(Fase fase, String resposta) {
        for (String respostaCorreta : fase.getRespostas()) {
            if (respostaCorreta.equalsIgnoreCase(resposta) || respostaCorreta.equalsIgnoreCase("")) {
                return;
            }
        }
        throw new RuntimeException();
    }
}
