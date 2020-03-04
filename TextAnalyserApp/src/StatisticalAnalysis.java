import java.util.Iterator;
import java.util.*;

public abstract class StatisticalAnalysis{
    private Iterator<String> StatisticalAnalysis;

    public Iterator<String> getStatisticalAnalysis() {
        return this.StatisticalAnalysis;
    }

    public StatisticalAnalysis(Iterator<String> StatisticalAnalysis) {
        this.StatisticalAnalysis = StatisticalAnalysis;
    }
    public abstract int countOf(String checkString); 
    public abstract int dictionarySize();
    public abstract int size();
    public abstract Set<String> occurMoreThan(Integer checkInteger);    
}