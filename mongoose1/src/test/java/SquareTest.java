import org.example.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void testArea(){
        Square s = new Square(5);
        Assertions.assertEquals(s.area(),25);
    }
}
