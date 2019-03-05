package main;

class MyThread implements Runnable{
    private String type;
    private VehicleFactory vf;

    public MyThread(String type){
        this.type=type;
        this.vf = new VehicleFactory();
    }

    @Override
    public void run(){
        Vehicle vehicle = vf.createVehicle(type);

        Order order = Order.getInstance();
        order.addVehicle(vehicle);

        vehicle.process();
    }
}