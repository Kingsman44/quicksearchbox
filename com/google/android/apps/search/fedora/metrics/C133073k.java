package com.google.android.apps.search.fedora.metrics;

import android.content.Context;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.clearcut.C143673z;
import com.google.android.gms.common.util.C144006f;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.common.util.concurrent.C60888db;
import com.google.speech.p5199c.p5200a.C66461f;
import com.google.speech.p5199c.p5200a.C66462g;

/* renamed from: com.google.android.apps.search.fedora.metrics.k */
/* compiled from: PG */
public final class C133073k implements C133072j {

    /* renamed from: a */
    private final C143658k f362830a;

    /* renamed from: b */
    private final C143673z f362831b;

    /* renamed from: c */
    private final Context f362832c;

    public C133073k(Context context, C60888db dbVar) {
        this.f362832c = context;
        C143658k a = C143658k.m233373b(context, "FEDASS_LOGS").mo118952a();
        this.f362830a = a;
        C143673z zVar = new C143673z(a, "FEDASS_COUNTERS", 100, C144006f.f390244a);
        this.f362831b = zVar;
        zVar.mo119025i();
        zVar.mo119026j(dbVar, 30000);
    }

    /* renamed from: a */
    public final void mo110963a(String str) {
        this.f362831b.mo119019c(str).mo119010b();
    }

    /* renamed from: b */
    public final void mo110964b(String str, long j) {
        this.f362831b.mo119019c(str).mo119011c(j);
    }

    /* renamed from: c */
    public final void mo110965c(String str, int i) {
        this.f362831b.mo119020d(str).mo119015b(i);
    }

    /* renamed from: d */
    public final void mo110966d(String str, long j) {
        this.f362831b.mo119028l(str, C143673z.f389507p).mo119016c(j);
    }

    /* renamed from: e */
    public final void mo110967e(String str, long j, long j2) {
        this.f362831b.mo119028l(str, C143673z.f389507p).mo119017d(j, j2);
    }

    /* renamed from: f */
    public final void mo110968f(C66461f fVar) {
        this.f362830a.mo119000e(fVar, C24006d.m44596b(this.f362832c, new C66462g())).mo118992a();
    }
}
