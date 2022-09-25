package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1303b;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57988g;
import com.google.p4449cd.p4456g.p4458b.C57989h;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.b.d */
/* compiled from: PG */
public final class C16606d extends C57989h {

    /* renamed from: a */
    public static final C59071e f48681a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.u.b.b.d");

    /* renamed from: b */
    public final C57981b f48682b;

    /* renamed from: c */
    public final C15481g f48683c;

    /* renamed from: d */
    private final Executor f48684d;

    /* renamed from: e */
    private final C60870cx f48685e;

    public C16606d(Executor executor, C60870cx cxVar, C57981b bVar, C15481g gVar) {
        this.f48684d = executor;
        this.f48685e = cxVar;
        this.f48682b = bVar;
        this.f48683c = gVar;
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f155059g) {
            C57988g gVar = new C57988g(this, aVar);
            aVar.mo20338d(gVar);
            if (gVar.f155044c.get()) {
                if (this.f155061i && this.f155060h.isEmpty()) {
                    this.f155060h.add(gVar);
                } else if (this.f155062j == null) {
                    gVar.mo54584d(true);
                    C57979e eVar = gVar.f155043b;
                    return eVar;
                } else {
                    C59104x d = f48681a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "S3WrapperSource");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(this.f155062j)).mo56372aa(46411)).mo56386p("Stream failed.");
                    gVar.mo54585e(this.f155062j);
                    C57979e eVar2 = gVar.f155043b;
                    return eVar2;
                }
            }
            C57979e eVar3 = gVar.f155043b;
            C60870cx cxVar = this.f48685e;
            C16604b bVar = new C16604b(this);
            C60856cj.m92911t(cxVar, C47810es.m84974n(bVar), this.f48684d);
            return eVar3;
        }
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        C58976aa aaVar = C58975e.f156826a;
        this.f48685e.cancel(true);
        this.f48682b.mo20388jK();
        mo54589f(true);
    }
}
