import java.util.ArrayList;

public class Yard {

    //--------------------------------------Свойства класса--------------------------------------

    private Goat _goat;
    private Cabbage _cabbage;
    private int sizeX = 1;
    private int sizeY = 1;
    private ArrayList<Wall> _wallPool = new ArrayList();
    private ArrayList<Box> _boxPool = new ArrayList();



    //--------------------------------------Конструктор класса----------------------------------------

    public Yard(int sizeX, int sizeY) {

        if(sizeX > 0 && sizeY > 0) {
            this.sizeX = sizeX;
            this.sizeY = sizeY;
        }

    }


    //--------------------------------------Методы класса----------------------------------------

    //Перебрать стены
    private Wall wallScroll(Cell cell, Direction direction)
    {
        for (Wall obj : _wallPool)
        {
            if(obj.get_cell().equals(cell) && obj.get_direction().equals(direction))  return obj;
        }

        return null;
    }


    //Перебрать коробки
    private Box boxScroll(Cell cell)
    {
        for (Box obj : _boxPool)
        {
            if(obj.get_cell().equals(cell))  return obj;
        }

        return null;
    }


    //Проверить наличие козы и капусты в загоне
    public boolean existenceGoatCabbage(){

        return false;
    }


    //Получить козу
    public Goat getGoat() {
        return _goat;
    }


    //Получить капусту
    public Cabbage getCabbage() {
        return _cabbage;
    }


    //Получить размер поля по оси X
    public int getSizeX() {
        return sizeX;
    }


    //Получить размер поля по оси Y
    public int getSizeY() {
        return sizeY;
    }

}
