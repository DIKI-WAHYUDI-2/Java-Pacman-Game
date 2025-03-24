package com.zetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board(); // Inisialisasi Board sebelum setiap test
    }

    @Test
    void testMovePacman() {
        // Simulasi pergerakan Pacman ke kanan
        board.req_dx = 1;
        board.req_dy = 0;
        board.movePacman();

        // Pastikan Pacman bergerak ke kanan
        assertEquals(1, board.pacmand_x);
        assertEquals(0, board.pacmand_y);
    }
}