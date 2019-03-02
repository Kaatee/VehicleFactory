package main;

class MyThread implements Runnable{
    private String type;
    private VehicleFactory vf;

    public MyThread(String type){
        this.type=type;
        this.vf = new VehicleFactory();
    }

    public void run(){
        Vehicle vehicle = vf.createVehicle(type);
        vehicle.process();

    }
}