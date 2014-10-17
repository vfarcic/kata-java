package kata;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class DummySpec {

    @Test
    public void dummyShouldReturnTrue() {
        assertThat(Dummy.dummy()).isTrue();
    }

}
