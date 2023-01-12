package relationships;

import java.util.Arrays;

public class Countries {

    int countryId;
    String countryName;

    States[] states;
    Rivers[] rivers;
    Countries(int countryId, String countryName,States[] states, Rivers[] rivers){
        this.countryId=countryId;
        this.countryName=countryName;
        this.states=states;
        this.rivers=rivers;
    }

    @Override
    public String toString() {
        return "Countries:  " +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", states=" + Arrays.toString(states) +
                ", rivers=" + Arrays.toString(rivers);
    }

    public static void main(String[] args) {


        Countries[] countries = new Countries[2];
        States[] states1 = new States[1];
        Rivers[] rivers1 = new Rivers[1];
        countries[0] = new Countries(5000,"india", states1,rivers1);
        States[] states2 = new States[1];
        Rivers[] rivers2 = new Rivers[1];
        countries[1] = new Countries(5001,"india", states2,rivers2);
        states1[0]= new States(518500,"A.P",rivers1);
        states2[0] = new States(345235, "U.P",rivers2);
        rivers1[0] = new Rivers(1, "river1");
        rivers2[0]= new Rivers(2, "river2");


        for(int i =0; i< countries.length; i++){
            System.out.println(countries[i]);
        }

    }

}
