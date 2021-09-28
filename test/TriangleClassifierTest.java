import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    @DisplayName("a=2;b=2;c=2")
    void testClassifier() {
        int a=2;
        int b=2;
        int c=2;
        String expected="tam giác đều";
        String result=TriangleClassifier.classifier(a,b,c);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("a=2;b=2;c=3")
    void test2Classifier() {
        int a=2;
        int b=2;
        int c=3;
        String expected="tam giác cân";
        String result=TriangleClassifier.classifier(a,b,c);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("a=3;b=4;c=5")
    void test3Classifier() {
        int a=3;
        int b=4;
        int c=5;
        String expected="tam giác thường";
        String result=TriangleClassifier.classifier(a,b,c);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("a=8;b=2;c=3")
    void test4Classifier() {
        int a=8;
        int b=2;
        int c=3;
        String expected="không phải là tam giác";
        String result=TriangleClassifier.classifier(a,b,c);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("a=-1;b=2;c=1")
    void test5Classifier() {
        int a=-1;
        int b=2;
        int c=1;
        String expected="không phải là tam giác";
        String result=TriangleClassifier.classifier(a,b,c);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("a=0;b=1;c=1")
    void test6Classifier() {
        int a=0;
        int b=1;
        int c=1;
        String expected="không phải là tam giác";
        String result=TriangleClassifier.classifier(a,b,c);
        assertEquals(expected,result);
    }
}