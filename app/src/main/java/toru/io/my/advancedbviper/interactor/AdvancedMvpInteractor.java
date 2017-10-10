package toru.io.my.advancedbviper.interactor;

import toru.io.my.advancedbviper.presenter.AdvancedMvpPresenter;

/**
 * Created by toruchoi on 10/10/2017.
 */

public interface AdvancedMvpInteractor<O extends AdvancedMvpInteractorOut, P extends AdvancedMvpPresenter> {
    void attachInteractorOut(O out, P presenter);
    void detacthInteractorOut();
}