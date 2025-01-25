package ru.job4j.chess.firuges.black;

import static org.assertj.core.api.Assertions.*;
import static ru.job4j.chess.firuges.Cell.*;

import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

class BishopBlackTest {

    @Test
    void whenPosition() {
        BishopBlack horse = new BishopBlack(A3);
        assertThat(horse.position()).isEqualTo(A3);
    }

    @Test
    void whenWay() {
        BishopBlack horse = new BishopBlack(C1);
        Cell[] way = horse.way(G5);
        Cell[] result = {D2, E3, F4, G5};
        assertThat(way).isEqualTo(result);
    }

    @Test
    void whenCopy() {
        BishopBlack horse = new BishopBlack(A6);
        Figure copy = horse.copy(A6);
        assertThat(horse.position()).isEqualTo(copy.position());
    }
}