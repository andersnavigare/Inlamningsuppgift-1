package ovningarVecka6;

public class SwitchCalculator {

        int x;
        int y;
        static char operation;


        public void setX(int i) {
            this.x = i;
        }

        public void setY(int i) {
            this.y = i;
        }

        public void setOperation(char c) {
            this.operation = c;

        }

        public int result() {
            switch (operation) {
                case '+':
                    return x + y;
                case '-':
                    return x - y;
                case '*':
                    return x * y;
                case '/':
                    return x / y;
            }
            return -1;
        }

        public static int resultStatic(int x, int y, char c) {

            switch (operation) {
                case '+':
                    return x + y;
                case '-':
                    return x - y;
                case '*':
                    return x * y;
                case '/':
                    return x / y;
            }
            return -1;

        }
    }


