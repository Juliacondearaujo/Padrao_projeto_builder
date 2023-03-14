package padroescriacao_exercicio.builder;
import org.junit.jupiter.api.Test;
import padroescriacao.builder.Aluno;
import padroescriacao.builder.AlunoBuilder;
import padroescriacao_exercicios.builder.Entrega;
import padroescriacao_exercicios.builder.EntregaBuilder;

import static org.junit.jupiter.api.Assertions.*;
public class EntregaBuilderTest {

    @Test
    void deveRetornarExcecaoParaEntregaSemCep() {
        try {
            EntregaBuilder entregaBuilder = new EntregaBuilder();
            Entrega entrega = entregaBuilder
                    .setDestinatario("Destinatario 1")
                    .setEmail("destinatario1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cep inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEntregaSemDestinatario() {
        try {
            EntregaBuilder entregaBuilder = new EntregaBuilder();
            Entrega entrega = entregaBuilder
                    .setCep(1)
                    .setEmail("destinatario1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Destinatario inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEntregaValida() {
        EntregaBuilder entregaBuilder = new EntregaBuilder();
        Entrega entrega = entregaBuilder
                .setCep(1)
                .setDestinatario("Destinatario 1")
                .setEmail("aluno1@email.com")
                .build();

        assertNotNull(entrega);
    }
}
