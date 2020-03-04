import java.io.File;
import java.nio.file.Files;
import java.util.Iterator;

public class FileContent implements IterableText{
    private String path;
    private String fileName;
	private Iterator<String> charIterator;
    private Iterator<String> wordIteraor;

    
    public String getFileName(){

    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    
    }    
    public Iterator<String> charIterator(){
        return this.charIterator;

    }
    public Iterator<String> wordIterator(){
        return this.wordIteraor;
    
    }
    private void GetFileText(){
            this.fileName =
    }
    

    

}

    


