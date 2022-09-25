package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6179c.C78546a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6179c.p6180a.C78547a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78808j;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78817s;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.d */
/* compiled from: PG */
final class C78431d extends C78394bq {

    /* renamed from: a */
    public final C78387bj f215946a;

    /* renamed from: b */
    private final C83358h f215947b;

    /* renamed from: c */
    private final C83358h f215948c;

    /* renamed from: d */
    private final C78546a f215949d;

    /* renamed from: e */
    private final C78253d f215950e;

    /* renamed from: f */
    private final C78817s f215951f;

    public C78431d(C78547a aVar, C78546a aVar2, C78253d dVar, C78387bj bjVar, C22871g gVar, C78817s sVar, C83358h hVar) {
        super(gVar);
        this.f215949d = aVar2;
        this.f215950e = dVar;
        this.f215946a = bjVar;
        this.f215951f = sVar;
        this.f215948c = hVar;
        this.f215947b = C83349aj.m132658m(aVar2.mo73490e(), new C78404c(aVar));
    }

    /* renamed from: a */
    public final C83358h mo73322a() {
        return this.f215947b;
    }

    /* renamed from: b */
    public final void mo73323b() {
        this.f215951f.mo73617n(C78808j.APP_SHORTCUTS);
        mo73362o("[NGA] AppShortcutStage.TIMEOUT", this.f215950e.mo73224x(), new C78350a(this));
        this.f215839q.mo76663c(this.f215948c, new C78377b(this));
    }

    /* renamed from: c */
    public final void mo73324c() {
        this.f215949d.mo73491f();
        this.f215951f.mo73618o();
    }
}
