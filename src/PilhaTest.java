import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest {
    @Test
    public void pilhaVazia(){
        Pilha p = new Pilha();
        assertTrue(p.estaVazia());
    }

}