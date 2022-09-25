package com.google.android.apps.gsa.staticplugins.p7421aw.p7422a;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86366d;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.aw.a.p */
/* compiled from: PG */
final class C94378p extends C57975a implements C22869e {

    /* renamed from: a */
    private final C86603d f263832a;

    /* renamed from: b */
    private final C86366d f263833b;

    /* renamed from: c */
    private final AtomicReference f263834c = new AtomicReference();

    public C94378p(C86603d dVar, C86366d dVar2) {
        this.f263832a = dVar;
        this.f263833b = dVar2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        if (this.f263834c.getAndSet(Double.valueOf(((Double) obj).doubleValue())) == null) {
            this.f263832a.mo54598b(this);
        }
    }

    public final void run() {
        Double d = (Double) this.f263834c.getAndSet((Object) null);
        d.getClass();
        this.f263833b.mo80136a(d.doubleValue());
    }
}
