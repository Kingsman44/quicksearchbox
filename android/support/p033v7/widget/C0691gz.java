package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.gz */
/* compiled from: PG */
final class C0691gz implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2524a;

    public C0691gz(SearchView searchView) {
        this.f2524a = searchView;
    }

    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f2524a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
