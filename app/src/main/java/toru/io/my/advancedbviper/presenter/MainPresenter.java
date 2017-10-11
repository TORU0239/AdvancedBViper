package toru.io.my.advancedbviper.presenter;

import android.util.Log;

import toru.io.my.advancedbviper.interactor.MainInteractor;
import toru.io.my.advancedbviper.view.MainView;

/**
 * Created by toruchoi on 10/10/2017.
 */

public class MainPresenter extends BViperPresenter<MainView> {
    private static final String TAG = MainPresenter.class.getSimpleName();

    public MainPresenter() {
        setInteractor(new MainInteractor(this));
    }

    @Override
    public void attachViewToPresenter(MainView view) {
        super.attachViewToPresenter(view);
    }

    public void mainPresenterRun(){
        Log.w(TAG, "mainPresenter run: test, command to interactor");
        ((MainInteractor)getInteractor()).testInteracting();
    }
}