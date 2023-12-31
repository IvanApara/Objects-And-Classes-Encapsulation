public class Elevator {
    private int currentFloor = 1;

    private int maxFloor;
    private int minFloor;

    public Elevator(int maxFloor, int minFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }


    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void moveDown(){
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp(){
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor){

        if(floor == currentFloor){
            System.out.println("Текущий этаж: " + currentFloor);
            System.out.println("Вы находитесь на этом этаже.");
        }

        while(currentFloor < floor && floor <= maxFloor){
            this.moveUp();
            System.out.println("Текущий этаж: " + currentFloor);
        }

        while(currentFloor > floor && floor >= minFloor){
            this.moveDown();
            System.out.println("Текущий этаж: " + currentFloor);
        }

        if(floor < minFloor || floor > maxFloor){
            System.out.println("Введён не корректный этаж.");
            System.out.println("Попробуйте снова.");
        }

    }
}
