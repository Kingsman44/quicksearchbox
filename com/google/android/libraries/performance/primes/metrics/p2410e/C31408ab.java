package com.google.android.libraries.performance.primes.metrics.p2410e;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.ab */
/* compiled from: PG */
final class C31408ab implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C31409ac f84568a;

    public C31408ab(C31409ac acVar) {
        this.f84568a = acVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C31409ac.f84569a.mo56226d()).mo56382g(th)).mo56372aa(50389)).mo56386p("Memory snapshot failed");
        synchronized (this.f84568a.f84576h) {
            this.f84568a.f84576h.set(C31425k.f84623a);
            this.f84568a.f84571c = null;
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C31425k kVar = (C31425k) obj;
        synchronized (this.f84568a.f84576h) {
            this.f84568a.f84576h.set(kVar);
            this.f84568a.f84571c = null;
        }
    }
}
