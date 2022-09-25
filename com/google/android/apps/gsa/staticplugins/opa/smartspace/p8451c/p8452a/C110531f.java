package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.p8452a;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110619bw;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.a.f */
/* compiled from: PG */
public final class C110531f implements C86091a {

    /* renamed from: a */
    public final C46578l f308144a;

    /* renamed from: b */
    public final C58974d f308145b;

    /* renamed from: c */
    private final C86124t f308146c;

    /* renamed from: d */
    private final C83794j f308147d;

    /* renamed from: e */
    private final C110619bw f308148e;

    public C110531f(C46578l lVar, C86124t tVar, C83794j jVar, C110619bw bwVar, C83564a aVar) {
        this.f308144a = lVar;
        this.f308146c = tVar;
        this.f308147d = jVar;
        this.f308148e = bwVar;
        this.f308145b = aVar.mo76900a("CalWorkerScheduler");
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        ((C58970a) ((C58970a) this.f308145b.mo56224b()).mo56372aa(26581)).mo56386p("Scheduling calendar refresh task status check worker at device reboot or app install.");
        if (!this.f308147d.mo77160D() || this.f308147d.mo77185x()) {
            this.f308144a.mo50545a("CALENDAR_REFRESH_TASK_STATUS_WORKER");
            return;
        }
        C60922j.m93045h(this.f308148e.mo98817a(), C47810es.m84966f(new C110529d(this, (int) this.f308146c.mo79743a(C89985ax.f246699ag))), C60826bg.f164896a);
    }
}
