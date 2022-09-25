package com.google.android.apps.gsa.staticplugins.opa.worker.p8613h;

import androidx.work.C4634o;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.h.f */
/* compiled from: PG */
public final class C114323f implements C86091a {

    /* renamed from: a */
    private static final C59071e f316981a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.h.f");

    /* renamed from: b */
    private final C46578l f316982b;

    /* renamed from: c */
    private final C86124t f316983c;

    public C114323f(C46578l lVar, C86124t tVar) {
        this.f316982b = lVar;
        this.f316983c = tVar;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        ((C59052c) ((C59052c) f316981a.mo56224b()).mo56372aa(28952)).mo56386p("Scheduling growth periodic tasks");
        if (this.f316983c.mo79746e(C90037cp.f248458am)) {
            long a = this.f316983c.mo79743a(C90037cp.f248477bE);
            C46578l lVar = this.f316982b;
            C46582p j = C46586t.m83063j(C114319b.class);
            C46570d dVar = (C46570d) j;
            dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.apps.gsa.staticplugins.opa.worker.nudgeui.NudgeUiBackgroundMonitorTask", C4634o.REPLACE));
            dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g((long) ((int) a), TimeUnit.MINUTES)));
            lVar.mo50546b(j.mo50561a());
        }
        long a2 = this.f316983c.mo79743a(C90037cp.f248568cq);
        C46578l lVar2 = this.f316982b;
        C46582p j2 = C46586t.m83063j(C114328k.class);
        C46570d dVar2 = (C46570d) j2;
        dVar2.f121757f = C58833ax.m90834k(new C46574h("com.google.android.apps.gsa.staticplugins.opa.worker.nudgeui.ResetOpaNgaQueryCounterTask", C4634o.REPLACE));
        dVar2.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g((long) ((int) a2), TimeUnit.MINUTES)));
        lVar2.mo50546b(j2.mo50561a());
    }
}
