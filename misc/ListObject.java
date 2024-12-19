package ivt5.omgtu.misc;

public class ListObject {
    private int[] array;


    public ListObject(int[] array) {
        this.array = array;
    }


    public ListObject(int size){
        this.array = new int[size];
    }

    public int[] Multiplication(int koeff){
        for(int i=0;i<this.array.length;i++){
            array[i]*=koeff;
        }

        return this.array;
    }

    public int[] Division(int koeff){
        for(int i=0;i<this.array.length;i++){
            this.array[i] = (int)Math.round(this.array[i]/ koeff);
        }

        return this.array;
    }


    public double getItem(int i){
        if (this.array.length >i) {
            return array[i];
        }
        else {
            System.out.println("Failed, Вышли за границу(Массива)");
            return -1;
        }

    }
    public void printItem(int ind){
        if(getItem(ind)==-1)
            System.out.println();
        else System.out.printf("Элемент с индексом %s имеет значение = %s ",ind,getItem(ind));
    }
    public void printArray(){
        for(int i=0;i<this.array.length;i++){
            System.out.printf("%s: %s \n",i,this.array[i]);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] add(ListObject other) {
        if (this.array.length != other.array.length) {
            throw new IllegalArgumentException("Failed, Массивы должны иметь одинаковую длину для сложения");
        }

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = this.array[i] + other.array[i];
        }
        return this.array;
    }

    public int[] subtract(ListObject other) {
        if (this.array.length != other.array.length) {
            throw new IllegalArgumentException("Failed, Массивы должны иметь одинаковую длину для вычитания");
        }

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = this.array[i] - other.array[i];
        }
        return this.array;
    }


}
