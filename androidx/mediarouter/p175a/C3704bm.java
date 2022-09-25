package androidx.mediarouter.p175a;

import android.os.Bundle;

/* renamed from: androidx.mediarouter.a.bm */
/* compiled from: PG */
final class C3704bm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3706bo f11902a;

    public C3704bm(C3706bo boVar) {
        this.f11902a = boVar;
    }

    public final void run() {
        C3706bo boVar = this.f11902a;
        int size = boVar.f11910g.size();
        for (int i = 0; i < size; i++) {
            ((C3667ac) boVar.f11910g.valueAt(i)).mo7721a((String) null, (Bundle) null);
        }
        boVar.f11910g.clear();
    }
}
