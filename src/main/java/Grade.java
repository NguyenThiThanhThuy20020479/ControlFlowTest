public class Grade {
    public String giaiPTBac2(float a, float b, float c) {
        String str = "";
        if (a == 0) {
            if (b == 0) {
                str = "Phương trình vô nghiệm";
            } else {
                str = "Phương trình có một nghiệm";

            }
        } else {
            float delta = b * b - 4 * a * c;
            if (delta > 0) {
                str = "Phương trình có 2 nghiệm";

            } else if (delta == 0) {
                str = "Phương trình có nghiệm kép";
            } else {
                str = "Phương trình vô nghiệm";
            }
        }
        return str;
    }
}

