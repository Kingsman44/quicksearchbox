package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1303b;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.b.c */
/* compiled from: PG */
final class C16605c extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C16606d f48679a;

    /* renamed from: b */
    private final AtomicBoolean f48680b = new AtomicBoolean(true);

    public C16605c(C16606d dVar) {
        this.f48679a = dVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C15481g gVar;
        C66607ce ceVar = (C66607ce) obj;
        if (this.f48680b.compareAndSet(true, false) && (gVar = this.f48679a.f48683c) != null) {
            gVar.mo22352b(C37179a.f97561ca);
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f48679a.mo54591h(ceVar)) {
            this.f48679a.f48682b.mo20388jK();
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            C15481g gVar = this.f48679a.f48683c;
            if (gVar != null) {
                gVar.mo22352b(C37179a.f97562cb);
            }
            C16606d dVar = this.f48679a;
            C66606cd a = C16603a.m33662a();
            a.copyOnWrite();
            C66607ce ceVar = (C66607ce) a.instance;
            C66607ce ceVar2 = C66607ce.f181191f;
            ceVar.f181193a |= 8;
            ceVar.f181197e = true;
            dVar.mo54591h((C66607ce) a.build());
        }
        this.f48679a.mo54589f(z);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C59104x d = C16606d.f48681a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "S3WrapperSource");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(46408)).mo56386p("Sink failure.");
        this.f48679a.mo54590g(th);
    }
}
