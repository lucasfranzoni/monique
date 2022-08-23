package br.com.lucasfranzoni.monique.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@Getter
public enum Fase {

    FASE1(1L, "", "fase1"),
    FASE2(2L, "0,5778;57,78;57,78%;57,78 %;0.5778;57.78;57.78%;57.78 %", "fase2"),
    FASE3(3L, "", "fase3"),
    FASE4(4L, "pubcrawl;pub crawl", "fase4"),
    FASE5(5L, "a parte que falta;apartequefalta", "fase5"),
    FASE6(6L, "0,998;99,8;99,8%;99,8 %;0.998;99.8;99.8%;99.8 %", "fase6"),
    FASE7(7L, "ohana", "fase7"),
    FASE8(8L, "la vie en rose;lavieenrose", "fase8"),
    FASE9(9L, "armação;armacao", "fase9"),
    FASE10(10L, "there's no such thing as a dragon;theres no such thing as a dragon;there'snosuchthingasadragon;theresnosuchthingasadragon;dragão é algo que não existe;dragao e algo que nao existe;dragãoéalgoquenãoexiste;dragaoealgoquenaoexiste", "fase10"),
    FASE11(11L, "dora aventureira;doraaventureira;dora, a aventureira;dora,aaventureira;dora a aventureira;doraaaventureira", "fase11"),
    FASE12(12L, "jaqueta azul;jaquetaazul", "fase12"),
    FINAL(13L, "sim;comcerteza;com certeza;comcertezasim;com certeza sim;obvio;obvio que sim;obvioquesim;milvezessim;mil vezes sim;claro;claro que sim;claroquesim;quero;querosim.quero sim", "final");

    private final Long numero;
    private final List<String> respostas;
    private final String nome;

    Fase(Long numero, String respostas, String nome) {
        this.numero = numero;
        this.respostas = List.of(respostas.split(";"));
        this.nome = nome;
    }

    public static Fase obterPorNumero(Long numero) {
        return Arrays.stream((Fase.values()))
                .filter(fase -> Objects.equals(fase.numero, numero))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }
}
