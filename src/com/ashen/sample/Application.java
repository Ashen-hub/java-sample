package com.ashen.sample;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
       /* List <String> students = new ArrayList<>();
        students.add("Saman");
        students.add("Ashen");
        students.add("Billa");
        students.add("WAAAAti");
        students.add("pABA");
        System.out.println(students);

        List <String> filterddata = students.stream().filter(s -> s.length()>5).collect(Collectors.toList());
        System.out.println(filterddata);
*/
       List<Sensor> sensors = new ArrayList<>();
        Sensor sensor1 = new Sensor("Living room",29);
        sensors.add(sensor1);

        Sensor sensor2 = new Sensor("Bed room",15);
        sensors.add(sensor2);

        Sensor sensor3 = new Sensor("Bathroom",20);
        sensors.add(sensor3);

        Sensor sensor4 = new Sensor("garden",32);
        sensors.add(sensor4);

        Sensor sensor5 = new Sensor("Garden",23);
        sensors.add(sensor5);



        List <Sensor> hotsensor = sensors.stream().filter(sensor -> sensor.getValue()>28).collect(Collectors.toList());
        System.out.println(hotsensor);

           }

}
