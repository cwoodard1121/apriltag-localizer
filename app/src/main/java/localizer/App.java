package localizer;

import java.util.ArrayList;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;



public class App {


    private static App instance;

    private static ArrayList<VideoCapture> cameras = new ArrayList<>();

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        //TODO: load this from a config eventually

        VideoCapture camera1 = new VideoCapture(0);
        
        // VideoCapture camera2 = new VideoCapture(1);
        // VideoCapture camera3 = new VideoCapture(2);
        // VideoCapture camera4 = new VideoCapture(3);
        App app = App.getInstance();
        app.addCamera(camera1);
        app.frameLoop();
        
    }


    /**
     * @return Singleton instance of the image processor
     */
    public static App getInstance() {
        if(instance == null) {
            instance = new App();
        }
        return instance;
    }

    public void frameLoop() {
        while(true) {
            // loop over all cameras
            for(VideoCapture camera : cameras) {
                Mat frame = new Mat();
                camera.read(frame);
                
                if(frame.empty()) {
                    System.err.println("ERROR: CAMERA FRAME NOT RECIEVED.");
                }

                

                
            }
        }
    }

    public void addCamera(VideoCapture camera) {
        if(!camera.isOpened()) {
            System.err.println("ERROR: CAMERA: " + camera.getBackendName() + " NOT LOADED");
        } else {
            cameras.add(camera);
        }
    }
}
