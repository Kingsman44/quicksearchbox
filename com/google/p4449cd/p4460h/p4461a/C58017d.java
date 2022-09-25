package com.google.p4449cd.p4460h.p4461a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58887cx;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4451b.C57938a;
import com.google.p4449cd.p4453d.C57957c;
import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4453d.C57960f;
import com.google.p4449cd.p4460h.C58040b;
import p3186j$.util.Objects;

/* renamed from: com.google.cd.h.a.d */
/* compiled from: PG */
public class C58017d {

    /* renamed from: a */
    public final C58040b f155102a;

    /* renamed from: b */
    public final C57960f f155103b;

    /* renamed from: c */
    public final C57938a f155104c;

    /* renamed from: d */
    public final C57957c f155105d;

    /* renamed from: e */
    public final long f155106e;

    /* renamed from: f */
    private final boolean f155107f;

    protected C58017d(C58040b bVar, C57960f fVar, C57938a aVar, boolean z, C57957c cVar, long j) {
        this.f155102a = bVar;
        this.f155103b = fVar;
        this.f155104c = aVar;
        this.f155107f = z;
        this.f155105d = cVar;
        this.f155106e = j;
    }

    /* renamed from: c */
    private final void m88770c(C57958d dVar, C58018e eVar) {
        if (this.f155103b.mo54569d(eVar)) {
            try {
                this.f155102a.mo54594a(dVar, eVar);
            } catch (Throwable th) {
                this.f155103b.mo54568c(eVar);
                C58887cx.m90980g(th);
                throw new RuntimeException(th);
            }
        } else {
            eVar.cancel(eVar.f155108a);
        }
    }

    /* renamed from: a */
    public final C60870cx mo54597a(C22862b bVar) {
        Objects.requireNonNull(bVar);
        C58018e eVar = new C58018e(new C58015b(bVar), this.f155103b, this.f155107f);
        m88770c(C58013ai.m88768a(bVar.getClass(), this.f155105d, this.f155104c, this.f155106e), eVar);
        return eVar;
    }

    /* renamed from: b */
    public final C60870cx mo54598b(C22869e eVar) {
        Objects.requireNonNull(eVar);
        C58018e c = C58018e.m88773c(new C58016c(eVar), this.f155103b, this.f155107f);
        m88770c(C58013ai.m88768a(eVar.getClass(), this.f155105d, this.f155104c, this.f155106e), c);
        return c;
    }
}
