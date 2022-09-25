package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75786o;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75788q;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.bg */
/* compiled from: PG */
public final class C75833bg implements C75786o {

    /* renamed from: a */
    public static final C58974d f210446a = C58974d.m91136j();

    /* renamed from: b */
    private final C22871g f210447b;

    /* renamed from: c */
    private C60870cx f210448c;

    public C75833bg(C22871g gVar) {
        this.f210447b = gVar;
    }

    /* renamed from: a */
    private final synchronized void m122234a() {
        C60870cx cxVar = this.f210448c;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f210448c = null;
        }
    }

    /* renamed from: b */
    private final synchronized void m122235b(C75788q qVar, Duration duration) {
        m122234a();
        this.f210448c = this.f210447b.mo28208h("[NGA] PieWatchdog.timeout", duration.toMillis(), new C75832bf(qVar));
    }

    /* renamed from: d */
    public final void mo71889d(C75788q qVar, int i, C80265t tVar) {
        m122234a();
    }

    /* renamed from: e */
    public final void mo71890e(C75788q qVar, int i, C75891l lVar) {
        m122235b(qVar, lVar.mo71947gJ());
    }

    /* renamed from: f */
    public final void mo71891f(C75788q qVar) {
        m122234a();
    }
}
