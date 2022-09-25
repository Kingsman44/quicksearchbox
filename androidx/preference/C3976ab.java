package androidx.preference;

import android.support.p033v7.widget.RecyclerView;

/* renamed from: androidx.preference.ab */
/* compiled from: PG */
final class C3976ab implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3983ai f12794a;

    public C3976ab(C3983ai aiVar) {
        this.f12794a = aiVar;
    }

    public final void run() {
        RecyclerView recyclerView = this.f12794a.f12808c;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
