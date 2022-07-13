public class Main {
    public static void main(String[] args) {
        CameraFactory cameraFactory = new CameraFactory();
        Camera camera = cameraFactory.makeCamera(CameraFactory.CameraManufacturer.CANON_FILM);
        Photographer photographer = new Photographer(camera);

        photographer.takePhotograph();
    }
}
