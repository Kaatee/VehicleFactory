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
        //vehicle.process();
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}