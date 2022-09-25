package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131072b;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.ce */
/* compiled from: PG */
public final class C131045ce implements C47352j {

    /* renamed from: a */
    public final C58974d f358463a;

    /* renamed from: b */
    private final C131072b f358464b;

    /* renamed from: c */
    private final Executor f358465c;

    /* renamed from: d */
    private final boolean f358466d;

    public C131045ce(C131072b bVar, Executor executor, C130603a aVar, boolean z) {
        this.f358464b = bVar;
        this.f358465c = executor;
        this.f358463a = aVar.mo109740b(this);
        this.f358466d = z;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        ((C58970a) ((C58970a) this.f358463a.mo56224b()).mo56372aa(39028)).mo56386p("Running synclet for on-device app suggestion");
        if (!this.f358466d) {
            return C60866ct.f164955a;
        }
        C131071z zVar = (C131071z) this.f358464b;
        C47633f h = C47633f.m84733g(zVar.f358514c.mo109808a()).mo51515h(new C131052g(zVar), zVar.f358512a);
        C47633f i = C47633f.m84733g(h).mo51516i(new C131057l(zVar), zVar.f358512a);
        C60870cx a = zVar.f358520i.mo95545a();
        return C47633f.m84733g(C47633f.m84733g(C47638k.m84753d(i, a, h).mo51521b(new C131058m(zVar, i, a, h), zVar.f358513b)).mo51516i(new C131059n(zVar), zVar.f358512a)).mo51515h(new C131044cd(this), this.f358465c);
    }
}
