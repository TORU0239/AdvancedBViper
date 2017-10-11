package toru.io.my.advancedbviper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import toru.io.my.advancedbviper.interactor.MainInteractor;
import toru.io.my.advancedbviper.presenter.MainPresenter;
import toru.io.my.advancedbviper.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {
    private static final String TAG = MainActivity.class.getSimpleName();

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Delegating this part to another class called Delegator //
        presenter = new MainPresenter();
        presenter.attachViewToPresenter(this);
        presenter.onCreate(savedInstanceState);
        presenter.mainPresenterRun();
    }

    // View Update //
    @Override
    public void test() {
        Log.w(TAG, "test: ");
    }

    @Override
    protected void onDestroy() {
        // Delegating this part to another class called Delegator //
        presenter.detachViewFromPresenter();
        presenter.onDestroy();
        super.onDestroy();
    }
}