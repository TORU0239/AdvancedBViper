package toru.io.my.advancedbviper.presenter;

import android.os.Bundle;

import toru.io.my.advancedbviper.view.AdvancedMvpView;

/**
 * Created by toruchoi on 10/10/2017.
 */

public interface AdvancedMvpPresenter<V extends AdvancedMvpView> {

    void attachViewToPresenter(V view);
    void detachViewFromPresenter();

    // fundamental elements for handling lifecycle
    void onCreate(Bundle savedInstanceState);
    void onResume();
    void onPause();
    void onDestroy();
}