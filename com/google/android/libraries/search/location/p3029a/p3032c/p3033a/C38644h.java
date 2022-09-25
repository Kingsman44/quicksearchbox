package com.google.android.libraries.search.location.p3029a.p3032c.p3033a;

import com.google.android.gms.location.C144889at;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.location.p3029a.p3032c.C38636a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.search.location.a.c.a.h */
/* compiled from: PG */
public final class C38644h implements C38641e, C38648l {

    /* renamed from: a */
    public final Map f102104a = new ConcurrentHashMap();

    /* renamed from: b */
    private final Object f102105b = new Object();

    /* renamed from: c */
    private C38653q f102106c;

    /* renamed from: d */
    private final C38636a f102107d;

    public C38644h(C38636a aVar) {
        this.f102107d = aVar;
    }

    /* renamed from: e */
    private final C38653q m67929e() {
        C38653q qVar;
        synchronized (this.f102105b) {
            if (this.f102106c == null) {
                this.f102106c = new C38653q(new C38642f(this));
            }
            qVar = this.f102106c;
        }
        return qVar;
    }

    /* renamed from: a */
    public final void mo41537a(C144889at atVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f102104a.remove(atVar);
    }

    /* renamed from: b */
    public final void mo41536b(boolean z) {
        C38653q e = m67929e();
        synchronized (e.f102117a) {
            e.f102118b = e.f102118b.mo41541a(z);
        }
    }

    /* renamed from: c */
    public final void mo41538c(C144889at atVar, C39226b bVar) {
        C38653q e = m67929e();
        if (atVar == null) {
            throw new NullPointerException("Null listener");
        } else if (bVar != null) {
            C38637a aVar = new C38637a(atVar, bVar);
            synchronized (e.f102117a) {
                e.f102118b.mo41542b(aVar);
            }
        } else {
            throw new NullPointerException("Null attributionId");
        }
    }

    /* renamed from: d */
    public final void mo41539d(C38643g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        C46459k.m82829b(C43205e.m76192b(this.f102107d.mo41528b(gVar.mo41531b()).mo120478d(gVar.mo41530a())), "Failed to cancel a FusedLocationProviderClient subscription", new Object[0]);
    }
}
