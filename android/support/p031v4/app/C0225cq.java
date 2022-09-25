package android.support.p031v4.app;

import android.widget.ListView;

/* renamed from: android.support.v4.app.cq */
/* compiled from: PG */
final class C0225cq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0227cs f850a;

    public C0225cq(C0227cs csVar) {
        this.f850a = csVar;
    }

    public final void run() {
        ListView listView = this.f850a.f853b;
        listView.focusableViewAvailable(listView);
    }
}
