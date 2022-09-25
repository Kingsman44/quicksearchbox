package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.shared.C23129y;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.q */
/* compiled from: PG */
final class C23220q implements C23225v {

    /* renamed from: a */
    final /* synthetic */ C23207d f63655a;

    /* renamed from: b */
    final /* synthetic */ C23221r f63656b;

    public C23220q(C23221r rVar, C23207d dVar) {
        this.f63656b = rVar;
        this.f63655a = dVar;
    }

    /* renamed from: a */
    public final void mo28682a(C23129y yVar) {
        if (this.f63656b.f63658b.mo28335d(yVar).mo28562a(C23210g.class) == null) {
            this.f63655a.mo28661c(0);
            return;
        }
        C23221r rVar = this.f63656b;
        C23207d dVar = this.f63655a;
        rVar.f63660d = rVar.f63658b.mo28305i(rVar.f63657a.mo28691a());
        rVar.f63658b.mo28306q(rVar.f63660d, rVar.f63657a.mo28692b());
        C23203ah ahVar = new C23203ah((C23209f) rVar.f63660d);
        ahVar.mo28666e(dVar);
        rVar.f63659c = ahVar;
    }

    /* renamed from: b */
    public final void mo28683b() {
        C23221r rVar = this.f63656b;
        if (rVar.f63659c != null) {
            C22939d dVar = rVar.f63660d;
            dVar.getClass();
            rVar.f63658b.mo28308v(dVar);
            rVar.f63658b.mo28307r(dVar);
            rVar.f63660d = null;
            C23203ah ahVar = rVar.f63659c;
            ahVar.getClass();
            int size = ahVar.f63626a.size();
            for (int i = 0; i < size; i++) {
                ahVar.mo28669h(0);
            }
            ahVar.f63627b = null;
            rVar.f63659c = null;
            return;
        }
        this.f63655a.mo28660b(0, 1);
    }
}
