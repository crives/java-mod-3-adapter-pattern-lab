public class DigitalCameraAdapter implements CanTakeDigitalPhotos {
    private Camera traditionalCamera;

    public DigitalCameraAdapter(Camera camera) {
        this.traditionalCamera = camera;
    }

    public void takePhotograph(double shutterSpeed) {
        // implement a subset of the takePhotograph() functionality from the Camera class here
        Logger.getInstance().log(traditionalCamera.getName() + " is taking a photograph");

        /*
        You will need access to the mirrorOps and shutterOps.
        Create accessor methods in the Camera class,
        so you can get those private members
        Our digital camera still has a mirror and a shutter so all
        those operations should apply
        Our photographer will now have a traditional camera as well as a digital camera
         */

        traditionalCamera.getMirrorOps().openMirror();;

        traditionalCamera.getShutterOps().setShutterSpeedSetting(shutterSpeed);
        traditionalCamera.getShutterOps().initializeShutter();
        traditionalCamera.getShutterOps().activateShutter();
        traditionalCamera.getShutterOps().releaseShutter();

        traditionalCamera.getMirrorOps().closeMirror();

        Logger.getInstance().log(traditionalCamera.getName() + " is done taking this photograph");
    }
}
