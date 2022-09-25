package android.support.p033v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.hd */
/* compiled from: PG */
final class C0696hd implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2528a;

    public C0696hd(SearchView searchView) {
        this.f2528a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f2528a.onSubmitQuery();
        return true;
    }
}
