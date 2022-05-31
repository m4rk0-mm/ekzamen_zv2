public class One {
    int number1;

    public One(int number1) {
        this.number1 = number1;
    }


    void Assets(){
        Two two = new Two();
        two.test();
    }

    class Two{
        void test(){
            if (number1 == 1){
                System.out.println("Yes");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}

