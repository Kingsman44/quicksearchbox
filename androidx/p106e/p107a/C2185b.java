package androidx.p106e.p107a;

import android.database.DataSetObserver;

/* renamed from: androidx.e.a.b */
/* compiled from: PG */
final class C2185b extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ C2186c f6199a;

    public C2185b(C2186c cVar) {
        this.f6199a = cVar;
    }

    public final void onChanged() {
        C2186c cVar = this.f6199a;
        cVar.f6201b = true;
        cVar.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        C2186c cVar = this.f6199a;
        cVar.f6201b = false;
        cVar.notifyDataSetInvalidated();
    }
}
