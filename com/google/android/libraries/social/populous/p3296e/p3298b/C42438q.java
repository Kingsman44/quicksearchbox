package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.populous.core.C42279be;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.social.populous.e.b.q */
/* compiled from: PG */
public final class C42438q {

    /* renamed from: a */
    public final Object f111350a = new Object();

    /* renamed from: b */
    public C42437p f111351b = null;

    /* renamed from: a */
    public final C42279be mo45497a(C42279be beVar) {
        C42436o oVar;
        C42437p pVar = new C42437p(this, beVar);
        synchronized (this.f111350a) {
            C42437p pVar2 = this.f111351b;
            if (pVar2 == null) {
                this.f111351b = pVar;
                pVar.mo45490c();
            } else {
                pVar2.f111347a = pVar;
                this.f111351b = pVar;
            }
            Objects.requireNonNull(pVar);
            oVar = new C42436o(pVar);
        }
        return oVar;
    }
}
