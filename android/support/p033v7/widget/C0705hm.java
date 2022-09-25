package android.support.p033v7.widget;

import android.support.p033v7.widget.SearchView;
import android.view.inputmethod.InputMethodManager;

/* renamed from: android.support.v7.widget.hm */
/* compiled from: PG */
final class C0705hm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SearchView.SearchAutoComplete f2531a;

    public C0705hm(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f2531a = searchAutoComplete;
    }

    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f2531a;
        if (searchAutoComplete.f1834b) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f1834b = false;
        }
    }
}
