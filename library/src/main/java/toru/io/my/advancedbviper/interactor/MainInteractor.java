package toru.io.my.advancedbviper.interactor;

import android.util.Log;

/**
 * Created by toruchoi on 11/10/2017.
 */

public class MainInteractor extends BViperInteractor {
    private static final String TAG = MainInteractor.class.getSimpleName();

    public MainInteractor(){}

    public String testInteracting(){
        Log.w(TAG, "testInteracting: time is coming to show.");

        // network call
        // fetching data
        // data to presenter

        return "Successful interaction!!";
    }
}