public class TriangleClassifier {
    public static String classifier(int a,int b,int c){
        boolean isTriangle = (a + b) > c && (a + c) > b && (b + c) > a;
        String triangleClassifier;
        if(isTriangle){
            boolean equilateralTriangle = a == b && a == c;
            boolean isoscelesTriangle = a == b || a == c||b==c;
            if(equilateralTriangle) {
                triangleClassifier= "tam giác đều";
            }else {
                if (isoscelesTriangle){
                    triangleClassifier= "tam giác cân";
                }else {
                    triangleClassifier= "tam giác thường";
                }
            }
        }else {
            triangleClassifier= "không phải là tam giác";
        }
        return triangleClassifier;
    }
}
