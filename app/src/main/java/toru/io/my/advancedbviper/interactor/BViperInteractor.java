package toru.io.my.advancedbviper.interactor;

import toru.io.my.advancedbviper.presenter.AdvancedMvpPresenter;

/**
 * Created by toruchoi on 10/10/2017.
 */

public abstract class BViperInteractor<O extends AdvancedMvpInteractorOut, P extends AdvancedMvpPresenter>
                                            implements AdvancedMvpInteractor<O, P> {
    private O out;
    private P presenter;

    @Override
    public void attachInteractorOut(O out, P presenter) {
        this.out = out;
        this.presenter = presenter;
    }

    @Override
    public void detacthInteractorOut() {
        out = null;
        presenter = null;
    }
}