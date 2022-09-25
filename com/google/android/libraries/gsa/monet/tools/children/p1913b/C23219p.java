package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23248a;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.p */
/* compiled from: PG */
public final class C23219p implements C23248a, C23209f {

    /* renamed from: a */
    public final C23226w f63650a;

    /* renamed from: b */
    public final C22945j f63651b;

    /* renamed from: c */
    public C23213j f63652c;

    /* renamed from: d */
    public C22939d f63653d;

    /* renamed from: e */
    private final C23206c f63654e;

    public C23219p(String str, C22945j jVar, boolean z) {
        this.f63650a = new C23226w(str, jVar);
        this.f63651b = jVar;
        this.f63654e = new C23206c(z, jVar);
    }

    /* renamed from: a */
    public final C23208e mo28655a() {
        return new C23221r(this.f63650a, this.f63651b);
    }

    /* renamed from: b */
    public final C22939d mo28684b(C23129y yVar) {
        C23206c cVar = this.f63654e;
        C22939d dVar = cVar.f63633c;
        if (dVar == null || !dVar.mo28292ad().equals(yVar)) {
            dVar = cVar.f63631a.mo28305i(yVar);
        } else {
            C23067b.m43234g(cVar.f63632b, "Using a cached renderer is supported only when caching is enabled for child type %s.", yVar);
            cVar.f63633c = null;
        }
        C22945j jVar = this.f63651b;
        jVar.mo28306q(dVar, jVar.mo28341k(this.f63650a.f63665a.f63639a));
        return dVar;
    }

    /* renamed from: c */
    public final void mo28685c(C23214k kVar) {
        this.f63650a.mo28693c(new C23218o(this, kVar));
    }

    /* renamed from: d */
    public final void mo28686d(C22939d dVar) {
        this.f63651b.mo28308v(dVar);
        C23206c cVar = this.f63654e;
        if (cVar.f63632b) {
            dVar.getClass();
            C23067b.m43229b(cVar.f63633c != dVar, "Renderer already cached");
            C22939d dVar2 = cVar.f63633c;
            if (dVar2 != null) {
                cVar.f63631a.mo28307r(dVar2);
            }
            cVar.f63633c = dVar;
            return;
        }
        cVar.f63631a.mo28307r(dVar);
    }
}
