package com.google.android.apps.gsa.staticplugins.p7666ci.p7667a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.a.b */
/* compiled from: PG */
public final /* synthetic */ class C97747b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C97759n f272923a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f272924b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f272925c;

    public /* synthetic */ C97747b(C97759n nVar, C53306j jVar, C2164c cVar) {
        this.f272923a = nVar;
        this.f272924b = jVar;
        this.f272925c = cVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C97759n nVar = this.f272923a;
        C53306j jVar = this.f272924b;
        C2164c cVar = this.f272925c;
        long b = nVar.f272956g.mo26870b();
        long longValue = ((Long) obj).longValue();
        long j = nVar.f272957h;
        C58976aa aaVar = C58975e.f156826a;
        if (b - longValue >= j) {
            try {
                C60870cx c = nVar.f272953d.mo103685c(nVar.f272954e.mo103707d(jVar), Long.valueOf(b));
                nVar.f272951b.mo28211k(c, String.format("Update last update time for {%s}", new Object[]{jVar.name()}), new C97755j(cVar, jVar));
            } catch (Throwable th) {
                C97759n.m162033a(th, cVar, jVar);
            }
        } else {
            cVar.mo5437b(false);
        }
    }
}
