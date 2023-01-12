package relationships;

public class Rivers {

    int riverId;
    String riverName;

    Rivers(int riverId, String riverName){
        this.riverId=riverId;
        this.riverName=riverName;
    }

    @Override
    public String toString() {
        return "Rivers{" +
                "riverId=" + riverId +
                ", riverName='" + riverName + '\'' +
                '}';
    }
}
