package android.support.p033v7.widget;

import android.database.Cursor;
import androidx.p106e.p107a.C2186c;

/* renamed from: android.support.v7.widget.gy */
/* compiled from: PG */
final class C0690gy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SearchView f2523a;

    public C0690gy(SearchView searchView) {
        this.f2523a = searchView;
    }

    public final void run() {
        C2186c cVar = this.f2523a.mSuggestionsAdapter;
        if (cVar instanceof C0727ih) {
            cVar.mo3228d((Cursor) null);
        }
    }
}
