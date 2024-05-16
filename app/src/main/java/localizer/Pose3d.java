package localizer;

public class Pose3d {
    
    private double x;
    private double y;
    private double z;
    private Rotation3d rot3d;

    public Pose3d(double x, double y, double z, Rotation3d rot3d) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.rot3d = rot3d;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Rotation3d getRot3d() {
        return rot3d;
    }

    public void setRot3d(Rotation3d rot3d) {
        this.rot3d = rot3d;
    }

    


}
