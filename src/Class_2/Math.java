package Class_2;

public class Math {
    int add(int i1, int i2){
        return i1 + i2;
    }
    int add(int i1, int i2, int i3){
        return add(i1, add(i2, i3));
    }
}
