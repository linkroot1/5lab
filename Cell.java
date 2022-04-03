public class Cell {


    //--------------------------------------Свойства класса-----------------------------------------------

private int cellX;
private int cellY;













    //-----------------------------------------Методы класса--------------------------------------------

    public Goat getGoat(){
        Goat goat = new Goat(60);
        return goat;
    }


    public Box getBox(){
        Box box = new Box();
        return box;
    }


    public Wall getWall(Direction direction){
        Wall wall = new Wall(direction);
        return wall;
    }


    public Cabbage getCabbage(){
        Cabbage cabbage = new Cabbage();
        return cabbage;
    }


}
