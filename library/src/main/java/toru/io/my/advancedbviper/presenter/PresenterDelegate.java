package toru.io.my.advancedbviper.presenter;

import android.support.annotation.NonNull;

import toru.io.my.advancedbviper.view.AdvancedMvpView;

/**
 * Created by toruchoi on 11/10/2017.
 */

public abstract class PresenterDelegate<V extends AdvancedMvpView, P extends AdvancedMvpPresenter<V>>{
    private P presenter;

    public void onCreate(){
        presenter = createPresenter();
    }

    public void onStart(V view){
        checkPresenter();
        presenter.attachViewToPresenter(view);
    }

    public void onStop(){
        checkPresenter();
        presenter.detachViewFromPresenter();
    }

    @NonNull
    public abstract P createPresenter();

    private void checkPresenter(){
        if(presenter == null) {
            throw new IllegalStateException("No Presenter. before onStart, call onCreate for creating presenter at first.");
        }
    }

    public P getPresenter() {
        return presenter;
    }
}