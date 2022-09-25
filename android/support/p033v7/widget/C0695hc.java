package android.support.p033v7.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v7.widget.hc */
/* compiled from: PG */
final class C0695hc implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2527a;

    public C0695hc(SearchView searchView) {
        this.f2527a = searchView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.f2527a;
        if (searchView.mSearchable == null) {
            return false;
        }
        if (searchView.mSearchSrcTextView.isPopupShowing() && this.f2527a.mSearchSrcTextView.getListSelection() != -1) {
            return this.f2527a.onSuggestionsKey(view, i, keyEvent);
        }
        if (TextUtils.getTrimmedLength(this.f2527a.mSearchSrcTextView.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        SearchView searchView2 = this.f2527a;
        searchView2.launchQuerySearch(0, (String) null, searchView2.mSearchSrcTextView.getText().toString());
        return true;
    }
}
