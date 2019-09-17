import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

public static void main(String[] args) {
	Robot Rob = new Robot ("mini");
	Rob.penDown();
	Rob.setSpeed(100);
	Rob.move(200);
	Rob.turn(180);
	Rob.move(100);
	Rob.turn(270);
	Rob.move(100);
	Rob.turn(90);
	Rob.move(100);
	Rob.turn(180);
	Rob.move(200);
}

}
