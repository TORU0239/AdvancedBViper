package toru.io.my.advancedbviper.presenter;

import android.util.Log;

import toru.io.my.advancedbviper.view.MainView;

/**
 * Created by toruchoi on 10/10/2017.
 */

public class MainPresenter extends BViperPresenter<MainView> {
    private static final String TAG = MainPresenter.class.getSimpleName();

    @Override
    public void attachView(MainView mainView) {
        super.attachView(mainView);
    }

    public void mainPresenterRun(){
        Log.w(TAG, "mainPresenter run: test" );
        getView().test();
    }
}
