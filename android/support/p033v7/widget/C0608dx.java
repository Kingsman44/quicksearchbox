package android.support.p033v7.widget;

import android.database.DataSetObserver;

/* renamed from: android.support.v7.widget.dx */
/* compiled from: PG */
final class C0608dx extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ C0613eb f2345a;

    public C0608dx(C0613eb ebVar) {
        this.f2345a = ebVar;
    }

    public final void onChanged() {
        if (this.f2345a.f2366q.isShowing()) {
            this.f2345a.mo1576v();
        }
    }

    public final void onInvalidated() {
        this.f2345a.mo1575m();
    }
}
