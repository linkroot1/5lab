public class Wall {
//first commit in Branch3

    //--------------------------------------Свойства класса---------------------------------------------

    private Direction _direction;
    private Cell _cell;


    //----------------------------------------Конструктор класса----------------------------------------------

    public Wall(Direction direction) {
        this._direction = direction;
    }


    //----------------------------------------Методы класса----------------------------------------------

    //Получить направление
    public Direction get_direction() {
        return _direction;
    }

    //Задать направление
    public void set_direction(Direction _direction) {
        this._direction = _direction;
    }

    //Получить клетку
    public Cell get_cell() {
        return _cell;
    }

    //Задать клетку
    public void set_cell(Cell _cell) {
        this._cell = _cell;
    }


}
