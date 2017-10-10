package toru.io.my.advancedbviper.presenter;

import android.os.Bundle;

import toru.io.my.advancedbviper.view.AdvancedMvpView;

/**
 * Created by toruchoi on 10/10/2017.
 */

public abstract class BViperPresenter<V extends AdvancedMvpView> implements AdvancedMvpPresenter<V> {
    private static final String TAG = BViperPresenter.class.getSimpleName();

    private V view;

    @Override
    public void attachView(V v) {
        view = v;
    }

    @Override
    public void detachView() {
        view = null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {}

    @Override
    public void onResume() {}

    @Override
    public void onPause() {}

    @Override
    public void onDestroy() {}

    public V getView(){
        return view;
    }
}