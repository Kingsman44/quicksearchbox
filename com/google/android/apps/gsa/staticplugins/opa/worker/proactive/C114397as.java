package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.p8618a.C114372a;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.p8618a.C114375d;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.p8618a.C114376e;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.protobuf.C62940bt;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.as */
/* compiled from: PG */
public final class C114397as implements C86091a {

    /* renamed from: a */
    private static final long f317210a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private final C118561t f317211b;

    public C114397as(C118561t tVar) {
        this.f317211b = tVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        int i = z ? 2 : z2 ? 3 : 1;
        if (i != 1) {
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            long j = f317210a;
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a = 2 | agVar.f328821a;
            agVar.f328823c = j;
            C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
            C62940bt btVar = C114376e.f317117a;
            C114372a aVar = (C114372a) C114375d.f317113c.createBuilder();
            aVar.copyOnWrite();
            C114375d dVar = (C114375d) aVar.instance;
            dVar.f317116b = i - 1;
            dVar.f317115a |= 1;
            ajVar.mo58885m(btVar, (C114375d) aVar.build());
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            C118476ak akVar = (C118476ak) ajVar.build();
            akVar.getClass();
            agVar2.f328827g = akVar;
            agVar2.f328821a |= 32;
            this.f317211b.mo103754e(C118522by.OPA_NOTIFICATION_DELAYED_TRIGGER_SYNC, (C118472ag) afVar.build());
        }
    }
}
