package androidx.lifecycle;

import android.os.Handler;

/* renamed from: androidx.lifecycle.be */
/* compiled from: PG */
public final class C2357be {

    /* renamed from: a */
    public final C2393x f6570a;

    /* renamed from: b */
    private final Handler f6571b = new Handler();

    /* renamed from: c */
    private C2356bd f6572c;

    public C2357be(C2391v vVar) {
        this.f6570a = new C2393x(vVar);
    }

    /* renamed from: a */
    public final void mo5765a(C2382m mVar) {
        C2356bd bdVar = this.f6572c;
        if (bdVar != null) {
            bdVar.run();
        }
        C2356bd bdVar2 = new C2356bd(this.f6570a, mVar);
        this.f6572c = bdVar2;
        this.f6571b.postAtFrontOfQueue(bdVar2);
    }
}
