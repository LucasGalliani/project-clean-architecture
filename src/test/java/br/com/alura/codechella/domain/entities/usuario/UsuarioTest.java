package br.com.alura.codechella.domain.entities.usuario;

import br.com.alura.codechella.domain.entities.FabricaDeUsuario;
import br.com.alura.codechella.domain.entities.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {

    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678999", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario() {
        FabricaDeUsuario fabricaDeUsuario = new FabricaDeUsuario();
        Usuario usuario = fabricaDeUsuario.comNomeCpfNascimento("Emily", "123.456.789-09", LocalDate.parse("2000-10-01"));

        Assertions.assertEquals("Emily",usuario.getNome());

        usuario = fabricaDeUsuario.incluiEndereco("12345-999", 40, "apto 201");

        Assertions.assertEquals("apto 201",usuario.getEndereco().getComplemento());
    }
}
