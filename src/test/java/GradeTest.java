import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {
    Grade grade = new Grade();
    @Test
    void test1() {
        assertEquals("Phương trình vô nghiệm", grade.giaiPTBac2(0, 0, 4));
    }
    @Test
    void test2() {
        assertEquals("Phương trình có một nghiệm", grade.giaiPTBac2(0, 4, 4));
    }
    @Test
    void test3() {
        assertEquals("Phương trình có 2 nghiệm", grade.giaiPTBac2(1, 6, 4));
    }
    @Test
    void test4() {
        assertEquals("Phương trình có nghiệm kép", grade.giaiPTBac2(1, 4, 4));
    }
    @Test
    void test5() {
        assertEquals("Phương trình vô nghiệm", grade.giaiPTBac2(1, 3, 4));
    }



}