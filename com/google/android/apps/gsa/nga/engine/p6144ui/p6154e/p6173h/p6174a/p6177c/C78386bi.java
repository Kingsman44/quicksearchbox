package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6166a.C78240d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78276a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a.C78288aj;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78817s;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80580n;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.bi */
/* compiled from: PG */
final class C78386bi extends C78394bq {

    /* renamed from: b */
    private static final Duration f215822b = Duration.ofMillis(300);

    /* renamed from: a */
    public final C83357g f215823a;

    /* renamed from: c */
    private final C78288aj f215824c;

    /* renamed from: d */
    private final C78240d f215825d;

    /* renamed from: e */
    private final C78817s f215826e;

    public C78386bi(C78385bh bhVar, C78817s sVar, C78288aj ajVar, C78240d dVar, C22871g gVar) {
        super(gVar);
        this.f215826e = sVar;
        this.f215825d = dVar;
        this.f215823a = new C83361k(((C78487m) bhVar).f216150a, C78263m.class);
        this.f215824c = ajVar;
    }

    /* renamed from: a */
    public final C83358h mo73322a() {
        return this.f215823a;
    }

    /* renamed from: b */
    public final void mo73323b() {
        this.f215826e.mo73616m();
        this.f215825d.mo73165c();
        C78288aj ajVar = this.f215824c;
        ajVar.f215572a = C78276a.f215555a;
        ajVar.f215573b.d(C80580n.INVOCATION);
        ajVar.f215573b.d(C80580n.AFTER_EXECUTION);
        mo73362o("[NGA] GoneStage.TIMEOUT", f215822b, new C78384bg(this));
    }
}
