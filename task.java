class Car {

    String make;
    String model;
    int year, x, y, z, speedx , speedy, speedz;
    
    public Car(String mk, String mdl, int yr,int xx, int yy, int zz, int spdx, int spdy, int spdz) {
        make = mk;
        model = mdl;
        year = yr;
        x = xx;
        y = yy;
        z = zz;
        speedx = spdx;
        speedy = spdy;
        speedz = spdz;
    }

    void accelerate(int speed_incrementx, int speed_incrementy, int speed_incrementz)
    {
        speedx += speed_incrementx;
        speedy += speed_incrementy;
        speedz += speed_incrementz;
    }

    void brake(int speed_decrementx, int speed_decrementy, int speed_decrementz)
    {
        speedx -= speed_decrementx;
        speedy -= speed_decrementy;
        speedz -= speed_decrementz;
    }

    void move() {
        x += speedx;
        y += speedx;
        z += speedz;
    }

    boolean detect_if_collision(Car obj)
    {
        double t1   = (obj . x  -  x) / (double)  ( speedx - obj.speedx);
        double t2   = (obj . y  -  y) / (double)  ( speedy - obj.speedy);
        double t3   = (obj . z  -  z) / (double)  ( speedz - obj.speedz);
        if (t1  == t2 &&  t1  == t3)
            return true;
        else
            return false;
    }

    boolean detect_collision(Car obj)
    {
        if(obj.x == x && obj.y == y && obj.z == z)
            return true;
        else
            return false;
    }

    int time_to_collision(Car obj)
    {
        return (obj.x - x) / (speedx - obj.speedx);
    }
    
    void display() {
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(speedx);
        System.out.println(speedy);
        System.out.println(speedz);
    }
    public static void main(String args[])
    {
        Car car1 = new Car("BMW","Sagar",2004,0,0,0,15,11,11);
        Car car2 = new Car("Hyundai", "Deham", 2003, 5, 6, 7, 10,5,4);
        car1.display();
        car2.display();
        boolean p = car1.detect_if_collision(car2);
        boolean q = car1.detect_collision(car2);
        int t = car1.time_to_collision(car2);
        if (q)
            System.out.println("Collision!!");
        else
            System.out.println("No Collision");
        if (p)
            System.out.println("Collision will occur");
        else
            System.out.println("Collision won't occur");    
        System.out.println("Time to collision: " + t + "hour");    
        car1.accelerate(2, 3, 4);
        car2.brake(6, 2, 2);
        car1.display();
        car2.display();
    }
}