package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import java.util.UUID;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.e */
/* compiled from: PG */
public final class C134216e {

    /* renamed from: a */
    public final C134205aj f365593a;

    /* renamed from: b */
    public final UUID f365594b;

    /* renamed from: c */
    private final C134199ad f365595c;

    /* renamed from: d */
    private final C134225n f365596d;

    /* renamed from: e */
    private final boolean f365597e;

    /* renamed from: f */
    private final C57259bn f365598f;

    public C134216e(C134205aj ajVar, C134199ad adVar, C134225n nVar, UUID uuid, boolean z, C57259bn bnVar) {
        this.f365593a = ajVar;
        this.f365595c = adVar;
        this.f365596d = nVar;
        this.f365594b = uuid;
        this.f365597e = z;
        this.f365598f = bnVar;
    }

    /* renamed from: a */
    public final void mo111647a() {
        this.f365593a.mo111619e(this.f365594b);
    }

    /* renamed from: b */
    public final void mo111648b() {
        this.f365593a.mo111620f(this.f365594b);
        if (this.f365597e) {
            C134199ad adVar = this.f365595c;
            UUID uuid = this.f365594b;
            synchronized (adVar.f365549b) {
                Map.EL.computeIfPresent(adVar.f365550c, uuid, new C134233v(adVar));
            }
            return;
        }
        this.f365596d.f365685a.mo74236a(C134224m.m217792a(C89849ae.DISCOVER_FEED_RESPONSE_RECEIVED, this.f365598f));
    }

    /* renamed from: c */
    public final void mo111649c() {
        this.f365593a.mo111618d(this.f365594b);
        if (this.f365597e) {
            C134199ad adVar = this.f365595c;
            UUID uuid = this.f365594b;
            synchronized (adVar.f365549b) {
                Map.EL.computeIfPresent(adVar.f365550c, uuid, new C134196aa(adVar));
            }
            return;
        }
        this.f365596d.f365685a.mo74236a(C134224m.m217792a(C89849ae.DISCOVER_FEED_REQUEST_SENT, this.f365598f));
    }
}
