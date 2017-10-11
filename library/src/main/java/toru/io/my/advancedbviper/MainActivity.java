package toru.io.my.advancedbviper;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import toru.io.my.advancedbviper.interactor.MainInteractor;
import toru.io.my.advancedbviper.presenter.MainPresenter;
import toru.io.my.advancedbviper.presenter.PresenterDelegate;
import toru.io.my.advancedbviper.view.MainView;

public class MainActivity extends BaseActivity<MainView, MainPresenter> implements MainView {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPresenter().mainPresenterRun();
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    // View Update //
    @Override
    public void test() {
        Log.w(TAG, "test: ");
        Toast.makeText(this, "TEST Success!!!!", Toast.LENGTH_SHORT).show();
    }
}