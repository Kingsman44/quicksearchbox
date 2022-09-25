package androidx.work.impl;

import androidx.lifecycle.C2332ag;
import androidx.work.C4384ah;
import androidx.work.C4386aj;
import androidx.work.C4387ak;
import androidx.work.C4388al;
import androidx.work.impl.utils.p209a.C4579m;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.work.impl.n */
/* compiled from: PG */
public final class C4558n implements C4388al {

    /* renamed from: c */
    private final C2332ag f14387c = new C2332ag();

    /* renamed from: d */
    private final C4579m f14388d = new C4579m();

    public C4558n() {
        mo9510b(C4388al.f14015b);
    }

    /* renamed from: a */
    public final C60870cx mo9320a() {
        return this.f14388d;
    }

    /* renamed from: b */
    public final void mo9510b(C4387ak akVar) {
        this.f14387c.mo5706i(akVar);
        if (akVar instanceof C4386aj) {
            this.f14388d.mo9537e((C4386aj) akVar);
        } else if (akVar instanceof C4384ah) {
            this.f14388d.mo9538f(((C4384ah) akVar).f14013a);
        }
    }
}
