package hello;

public class PathNotImplementedException extends RuntimeException {

    public PathNotImplementedException() {
        super("the path is not yet implemented");
    }
}
