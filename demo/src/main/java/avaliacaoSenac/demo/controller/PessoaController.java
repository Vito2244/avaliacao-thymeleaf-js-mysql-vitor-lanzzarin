package avaliacaoSenac.demo.controller;

import avaliacaoSenac.demo.model.Pessoa;
import avaliacaoSenac.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("mensagem", "Cadastro de Pessoas");
        model.addAttribute("pessoas", pessoaRepository.findAll());
        return "index";
    }

    @PostMapping("/salvar")
    public String salvar(@RequestParam String nome, @RequestParam String email) {
        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setEmail(email);
        pessoaRepository.save(p);
        return "redirect:/";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }
}
