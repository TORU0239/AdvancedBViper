package toru.io.my.advancedbviper;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import toru.io.my.advancedbviper.interactor.BViperInteractor;
import toru.io.my.advancedbviper.interactor.MainInteractor;
import toru.io.my.advancedbviper.presenter.AdvancedMvpPresenter;
import toru.io.my.advancedbviper.presenter.BViperPresenter;
import toru.io.my.advancedbviper.presenter.MainPresenter;
import toru.io.my.advancedbviper.presenter.PresenterDelegate;
import toru.io.my.advancedbviper.view.AdvancedMvpView;
import toru.io.my.advancedbviper.view.MainView;

/**
 * Created by toruchoi on 10/10/2017.
 */

public abstract class BaseActivity<V extends AdvancedMvpView, P extends AdvancedMvpPresenter<V>> extends AppCompatActivity implements AdvancedMvpView{

    private PresenterDelegate<V,P> delegate = new PresenterDelegate<V,P>(){
        @NonNull
        @Override
        public P createPresenter() {
            return BaseActivity.this.createPresenter();
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        delegate.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        delegate.onStart((V)this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        delegate.onStop();
    }

    public abstract P createPresenter();

    public P getPresenter(){
        return delegate.getPresenter();
    }
}