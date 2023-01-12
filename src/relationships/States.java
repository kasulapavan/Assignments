package relationships;

import java.util.Arrays;

public class States {
    int stateId;
    String stateName;

    Rivers[] rivers;
    States(int stateId, String stateName, Rivers[] rivers){

        this.stateId = stateId;
        this.stateName=stateName;
        this.rivers=rivers;
    }



    @Override
    public String toString() {
        return "States{" +
                "stateId=" + stateId +
                ", stateName='" + stateName + '\'' +
                ", rivers=" + Arrays.toString(rivers) +
                '}';
    }

    public static void main(String[] args) {
        States[] states = new States[2];
        Rivers[] rivers1 = new Rivers[1];
        Rivers[] rivers2 = new Rivers[1];
        states[0] = new States(518501,"A.P",rivers1);

        rivers1[0] = new Rivers(1, "river1");
        states[1] = new States(518502,"U.P",rivers2);

        rivers2[0]= new Rivers(2, "river2");

        for(int i =0;i<states.length;i++){
            System.out.println(states[i]);
        }


    }
}
