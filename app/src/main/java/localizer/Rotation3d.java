package localizer;

public class Rotation3d {
    private double roll;
    private double pitch;
    private double yaw;

    public Rotation3d(double r, double p, double y) {
        this.roll = r;
        this.pitch = p;
        this.yaw = y;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public double getPitch() {
        return pitch;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public double getYaw() {
        return yaw;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    
}
