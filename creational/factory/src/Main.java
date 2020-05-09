public class Main {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = "file_name.jpeg";
        String format = image.substring(image.indexOf('.') + 1);

        switch (format){
            case "gif":
                reader = new GifReader(image);
                break;
            case "jpeg":
                reader = new JpegReader(image);
                break;
            default:
                reader = null;
        }

        assert reader != null;
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
