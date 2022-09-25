package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85002e;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114424bp;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114446ck;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114459cx;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114460cy;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114461cz;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36275ad;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36281b;
import com.google.assistant.p3803ag.p3809c.C49078fq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5036r.C65329o;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.b */
/* compiled from: PG */
public final class C114263b extends C86734a implements C85002e {

    /* renamed from: a */
    private final C68214a f316849a;

    public C114263b(C68214a aVar) {
        super(C118575h.WORKER_OPA_NOTIFICATIONS, "opanotifications");
        this.f316849a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78599a() {
        C114464db dbVar = (C114464db) this.f316849a.mo27525b();
        return dbVar.f317383d.mo28202b("buildSyncRequest", new C114446ck(dbVar));
    }

    /* renamed from: b */
    public final C60870cx mo78600b(C65329o oVar) {
        C114464db dbVar = (C114464db) this.f316849a.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C60922j.m93045h(C60838bs.m92859i(((C36281b) dbVar.f317397r.mo27525b()).mo40089a()), new C114459cx(dbVar, oVar), C60826bg.f164896a));
        if ((oVar.f176678a & 1) != 0) {
            arrayList.add(C118826c.m197213c(C60922j.m93045h(C60838bs.m92859i(((C36275ad) dbVar.f317396q.mo27525b()).mo40081f()), new C114460cy(dbVar, oVar), C60826bg.f164896a)));
        }
        if ((oVar.f176678a & 2) != 0) {
            C36275ad adVar = (C36275ad) dbVar.f317396q.mo27525b();
            C49078fq fqVar = oVar.f176681d;
            if (fqVar == null) {
                fqVar = C49078fq.f126937f;
            }
            arrayList.add(C118826c.m197213c(C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(adVar.mo40083h(fqVar)), new C114461cz(dbVar), C60826bg.f164896a), new C114424bp(dbVar), C60826bg.f164896a)));
        }
        return C118826c.m197212b(arrayList);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
