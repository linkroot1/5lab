public class Goat { //b2 1


    //-----------------------------------Свойства класса--------------------------------------------

    private Yard _yard;
    private int goatEnergy;
    private Cell _cell;
    private Direction _direction;
    private Box _box;



    //---------------------------------Конструктор класса-------------------------------------------

    public Goat(int goatEnergy) {
        this.goatEnergy = goatEnergy;
    }



    //------------------------------------Методы класса----------------------------------------------

    //Получить количество козьей энергии
    public int getGoatEnergy(){
        return  this.goatEnergy;
    }


    //Сделать ход
    public void move(Direction direction){

    }


    //Проверить, можно ли сделать ход
    public boolean canMove(Direction direction){

        return false;
    }


    //Потратить козью энергию
    public boolean expendGoatEnergy(){

        if(goatEnergy > 0) {

            goatEnergy--;
            return true;
        }

        else if (goatEnergy < 0){

            goatEnergy = 0;

        }

        return false;
    }


    //Съесть капусту
    public boolean eatCabbage(Cabbage cabbage){


        return false;
    }


    //Потянуть коробку на себя
    public boolean moveBoxYourself(Box box, Direction direction){

        return false;
    }


    //Потянуть коробку от себя
    public boolean moveBoxAwayFromYou(Box box, Direction direction){

        return false;
    }

    //Получить загон
    public Yard get_yard() {
        return _yard;
    }

    //Задать загон
    public void set_yard(Yard _yard) {
        this._yard = _yard;
    }

    //Получить клетку
    public Cell get_cell() {
        return _cell;
    }

    //Задать клетку
    public void set_cell(Cell _cell) {
        this._cell = _cell;
    }

    //Получить направление
    public Direction get_direction() {
        return _direction;
    }

    //Задать направление
    public void set_direction(Direction _direction) {
        this._direction = _direction;
    }


}
