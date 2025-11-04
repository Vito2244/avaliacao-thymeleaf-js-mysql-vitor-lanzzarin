function salvarLocal(){
    const nome = document.getElementById("nome").value
    if (nome) {
        localStorage.setItem("UltimoNome", nome);
    }
}

window.onload = function(){
    const ultimoNome = localStorage.getItem("ultimoNome");
    if (ultimoNome) {
        document.getElementById("ultimoNome").innerText = ultimoNome;
    }

    let visitas = sessionStorage.getItem("visitas");
    visitas = visitas ? parseInt(visitas) + 1 : 1;
    sessionStorage.setItem("visitas", visitas);
    document.getElementById("visitas").innerText = visitas + " visita(s) nesta sessão.";
};