import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

public class FileContent implements IterableText {
    private String path;
    private String fileName;
    private Iterator<String> charIterator;
    private Iterator<String> wordIteraor;

    public FileContent(String path, String fileName, Iterator<String> charIterator, Iterator<String> wordIteraor) {
        this.path = path;
        this.fileName = fileName;
        this.charIterator = charIterator;
        this.wordIteraor = wordIteraor;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;

    }

    public Iterator<String> charIterator() {
        return this.charIterator;

    }

    public Iterator<String> wordIterator() {
        return this.wordIteraor;

    }

    public static String FileContentReader(String fileName) throws IOException {
    String text = Files.readString(Path.of(fileName));
    return text;
    }
    

    

}

    


