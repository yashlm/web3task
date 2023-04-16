# web3task
Recruitment task for Web3.0 project

I have done the recruitment task for this project in Java language.

I have made a class Car with the following global varibles:
make : make of the car
model : model of the car
year : the year the car was made
x : coordinate in the x-axis
y : coordinate in the y-axis
z : coordinate in the z-axis
speedx : speed in the x-axis
speedy : speed in the y-axis
speedz : speed in the z-axis

I have made a parameterised constructor to initialize these variables.

void accelerate(..) : A method to increase the speed of the car in the respective axes.
                      Simple addition is used.
                      
void brake(..) : A method to decrease the speed of the car in the respective axes.
                 Simple subtraction is used.

void move() : A method to change the coordinates of the car according to the speed.
              One unit coordinate =  1 km

boolean detect_if_collision(Car obj) : To detect if the cars will collide.
                                       Distance between both the cars is calculated and hence the time taken for the cars is calculated in the respective axes.
                                       If the time taken in all the axes is same, than the cars will collide.
                                       It is assumed that the car moves in the positive direction.

boolean detect_collision(Car obj) : To check if the cars have collided.
                                    If the coordinates of both the cars is same, then the cars have collided.

int time_to_collision(Car obj) : To calculate the time of collision.
                                 Time is calculated in any one of the axes, which will be the time of collision.

void display() : It displays all the attributes.

void main() : Two objects are created and all the functions are checked with the dummy data.

