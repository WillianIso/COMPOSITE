import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MacoTest {
    @Test
    void testGetDescricao() {
        Maco maco = new Maco("Maço de cigarros");
        String descricaoEsperada = "Maço de cigarros (Cigarro 1 (Tabaco, Seda), Cigarro 2 (Tabaco, Seda), Cigarro 3 (Tabaco, Seda), Cigarro 4 (Tabaco, Seda), Cigarro 5 (Tabaco, Seda), Cigarro 6 (Tabaco, Seda), Cigarro 7 (Tabaco, Seda), Cigarro 8 (Tabaco, Seda), Cigarro 9 (Tabaco, Seda), Cigarro 10 (Tabaco, Seda), Cigarro 11 (Tabaco, Seda), Cigarro 12 (Tabaco, Seda), Cigarro 13 (Tabaco, Seda), Cigarro 14 (Tabaco, Seda), Cigarro 15 (Tabaco, Seda), Cigarro 16 (Tabaco, Seda), Cigarro 17 (Tabaco, Seda), Cigarro 18 (Tabaco, Seda), Cigarro 19 (Tabaco, Seda), Cigarro 20 (Tabaco, Seda))";
        assertEquals(descricaoEsperada, maco.getDescricao());
    }

    @Test
    void testGetPreco() {
        Maco maco = new Maco("Maço de cigarros");
        double precoEsperado = 11.999999999999996; // 12
        assertEquals(precoEsperado, maco.getPreco());
    }
}
