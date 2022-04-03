public class Direction {


    //------------------------------------------Свойства класса------------------------------------------

    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;







    //-------------------------------------------Методы класса-------------------------------------------


    public void setDirection(int direction){


        if(direction == 0){

            left = true;
            right = false;
            up = false;
            down = false;
        }
        else if(direction == 1){

            left = false;
            right = true;
            up = false;
            down = false;
        }
        else if(direction == 2){

            left = false;
            right = false;
            up = true;
            down = false;
        }
        else if(direction == 3){

            left = false;
            right = false;
            up = false;
            down = true;
        }
        else {

            left = false;
            right = false;
            up = false;
            down = false;
        }

    }

    public  Direction getDirection(){

        return this;
    }


    //Поменять направление на противоположное направление
    public void reversDirection(){


        if( left == true && right == false && up == false && down == false){

            left = false;
            right = true;
        }
        else if( left == false && right == true && up == false && down == false){

            left = true;
            right = false;
        }
        else if( left == false && right == false && up == true && down == false){

            up = false;
            down = true;
        }
        else if( left == false && right == false && up == false && down == true){

            down = false;
            up = true;
        }

    }


}
