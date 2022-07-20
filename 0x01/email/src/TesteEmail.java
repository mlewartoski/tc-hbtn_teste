import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TesteEmail {

    @Test
    void testar_email_com_arroba(){
        assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    void testar_email_sem_arroba(){
        assertFalse(Pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    void testar_email_mais_50_caracteres(){
        assertFalse(Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }

}
