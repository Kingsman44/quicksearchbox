package com.google.android.libraries.assistant.trainingcache.p1617b;

import android.content.Context;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.clearcut.C143673z;
import com.google.android.gms.common.util.C144006f;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.common.util.concurrent.C60888db;
import com.google.speech.p5199c.p5200a.C66461f;
import com.google.speech.p5199c.p5200a.C66462g;

/* renamed from: com.google.android.libraries.assistant.trainingcache.b.h */
/* compiled from: PG */
public final class C19436h implements C19435g {

    /* renamed from: a */
    private final C143658k f54346a;

    /* renamed from: b */
    private final C143673z f54347b;

    /* renamed from: c */
    private final Context f54348c;

    public C19436h(Context context, C60888db dbVar) {
        this.f54348c = context;
        C143658k a = C143658k.m233373b(context, "FEDASS_LOGS").mo118952a();
        this.f54346a = a;
        C143673z zVar = new C143673z(a, "FEDASS_COUNTERS", 100, C144006f.f390244a);
        this.f54347b = zVar;
        zVar.mo119025i();
        zVar.mo119026j(dbVar, 30000);
    }

    /* renamed from: a */
    public final void mo24619a(String str) {
        this.f54347b.mo119019c(str).mo119010b();
    }

    /* renamed from: b */
    public final void mo24620b(String str, long j) {
        this.f54347b.mo119019c(str).mo119011c(j);
    }

    /* renamed from: c */
    public final void mo24621c(String str, int i) {
        this.f54347b.mo119020d(str).mo119015b(i);
    }

    /* renamed from: d */
    public final void mo24622d(String str, long j) {
        this.f54347b.mo119028l(str, C143673z.f389507p).mo119016c(j);
    }

    /* renamed from: e */
    public final void mo24623e(String str, long j, long j2) {
        this.f54347b.mo119028l(str, C143673z.f389507p).mo119017d(j, j2);
    }

    /* renamed from: f */
    public final void mo24624f(C66461f fVar) {
        C66462g gVar = new C66462g();
        C143657j d = this.f54346a.mo118999d(fVar);
        d.f389472n = C24006d.m44596b(this.f54348c, gVar);
        d.mo118992a();
    }

    /* renamed from: g */
    public final void mo24625g(int i, long j) {
        this.f54347b.mo119020d("Fedass.Unified.Periodic.DeviceType").mo119005a((long) i, j, C143673z.f389505d);
    }
}
