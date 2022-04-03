public class Labyrinth {


    //-----------------------------------------Свойства класса-----------------------------------------------

    private Yard _yard;










    //------------------------------------------Методы класса-------------------------------------------------

    //Создать стену
    public void createWall( int cellX, int cellY, Direction direction ){

    }


    //Создать коробку
    public void createBox(int cellX, int cellY){

    }


    //Создать козу
    public void createGoat(int cellX, int cellY){


    }


    //Создать капусту
    public void createCabbage(int cellX, int cellY){

    }


    //Получить загон
    public Yard get_yard() {
        return _yard;
    }


    //Задать загон
    public void set_yard(Yard _yard) {
        this._yard = _yard;
    }


    //Заполнить загон
    public boolean fillYard(Yard yard){

        return false;
    }

}
