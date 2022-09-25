package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import androidx.work.C4634o;
import androidx.work.WorkerParameters;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.z */
/* compiled from: PG */
public final class C123881z implements C46575i {

    /* renamed from: a */
    public final C46578l f342193a;

    /* renamed from: b */
    public final C58974d f342194b;

    /* renamed from: c */
    private final C123853az f342195c;

    /* renamed from: d */
    private final C62910ar f342196d;

    /* renamed from: e */
    private final C124100bz f342197e;

    public C123881z(C123853az azVar, C46578l lVar, C62910ar arVar, C124100bz bzVar, C130603a aVar) {
        this.f342195c = azVar;
        this.f342193a = lVar;
        this.f342196d = arVar;
        this.f342197e = bzVar;
        this.f342194b = aVar.mo109739a("PCP.LocalCalendarWorker");
    }

    /* renamed from: a */
    public final C60870cx mo106152a() {
        ((C58970a) ((C58970a) this.f342194b.mo56224b()).mo56372aa(35281)).mo56386p("Scheduling the PCP local calendar periodic scheduler worker");
        C46582p j = C46586t.m83063j(C123881z.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("CALENDAR_PERIODIC_SCHEDULER_WORKER", C4634o.REPLACE));
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(this.f342196d.f169860a, TimeUnit.SECONDS)));
        return this.f342193a.mo50546b(j.mo50561a());
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        ((C58970a) ((C58970a) this.f342194b.mo56224b()).mo56372aa(35282)).mo56386p("Local calendar periodic scheduler worker starts.");
        this.f342197e.f342762a.mo41704s("PCP_CALENDAR_PERIODIC_TASK_TRIGGERED");
        return C47633f.m84733g(this.f342195c.mo106146c()).mo51515h(C123879x.f342191a, C60826bg.f164896a).mo51513e(Throwable.class, new C123880y(this), C60826bg.f164896a);
    }
}
