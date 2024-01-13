public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
    }

    public static void pattern1(int rows){
        for(int row=1;row<=rows;row++){
            for(int column=1;column<=row;column++){
                System.out.print(column);
            }
            System.out.println(' ');
        }
    }
    public static void pattern2(int rows){
        for(int row=1;row<=rows;row++){
            for(int column=1;column<=row;column++){
                System.out.print(row);
            }
            System.out.println(' ');
        }
    }
    public static void pattern3(int rows){
        for(int row=1;row<=rows;row++){
            for(int column=1;column<=row;column++){
                System.out.print('*');
            }
            System.out.println(' ');
        }
    }

}
