package toru.io.my.advancedbviper.interactor;

import android.util.Log;

import toru.io.my.advancedbviper.presenter.MainPresenter;

/**
 * Created by toruchoi on 11/10/2017.
 */

public class MainInteractor extends BViperInteractor {
    private static final String TAG = MainInteractor.class.getSimpleName();

    private MainPresenter presenter;

    public MainInteractor(MainPresenter presenter) {
        this.presenter = presenter;
    }

    public void testInteracting(){
        Log.w(TAG, "testInteracting: time is coming to show.");

        // network call
        // fetching data
        // data to presenter
    }
}