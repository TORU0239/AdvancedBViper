package toru.io.my.advancedbviper.presenter;

import android.os.Bundle;

import toru.io.my.advancedbviper.interactor.AdvancedMvpInteractor;
import toru.io.my.advancedbviper.view.AdvancedMvpView;

/**
 * Created by toruchoi on 10/10/2017.
 */

public abstract class BViperPresenter<V extends AdvancedMvpView, I extends AdvancedMvpInteractor> implements AdvancedMvpPresenter<V> {
    private static final String TAG = BViperPresenter.class.getSimpleName();

    private V view;
    private I interactor;

    @Override
    public void attachViewToPresenter(V view) {
        this.view = view;
        this.interactor = getInteractor();
    }

    @Override
    public void detachViewFromPresenter() {
        view = null;
        interactor = null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {}

    @Override
    public void onResume() {}

    @Override
    public void onPause() {}

    @Override
    public void onDestroy() {}

    V getView(){
        return view;
    }

    public abstract I getInteractor();
}