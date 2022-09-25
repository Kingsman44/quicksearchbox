package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.hb */
/* compiled from: PG */
final class C0694hb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2526a;

    public C0694hb(SearchView searchView) {
        this.f2526a = searchView;
    }

    public final void onClick(View view) {
        SearchView searchView = this.f2526a;
        if (view == searchView.mSearchButton) {
            searchView.onSearchClicked();
        } else if (view == searchView.mCloseButton) {
            searchView.onCloseClicked();
        } else if (view == searchView.mGoButton) {
            searchView.onSubmitQuery();
        } else if (view == searchView.mVoiceButton) {
            searchView.onVoiceClicked();
        } else if (view == searchView.mSearchSrcTextView) {
            searchView.forceSuggestionQuery();
        }
    }
}
