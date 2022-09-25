package com.google.android.apps.search.podcasts.player.p10592a;

import com.google.android.apps.search.podcasts.p10550b.p10555e.C140069k;
import com.google.android.apps.search.podcasts.p10550b.p10555e.C140084z;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.a.m */
/* compiled from: PG */
public final class C140765m implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C60870cx f382234a;

    /* renamed from: b */
    final /* synthetic */ C140641b f382235b;

    /* renamed from: c */
    final /* synthetic */ C140770r f382236c;

    /* renamed from: d */
    final /* synthetic */ C140790h f382237d;

    /* renamed from: e */
    final /* synthetic */ C60870cx f382238e;

    public C140765m(C60870cx cxVar, C140641b bVar, C140770r rVar, C140790h hVar, C60870cx cxVar2) {
        this.f382234a = cxVar;
        this.f382235b = bVar;
        this.f382236c = rVar;
        this.f382237d = hVar;
        this.f382238e = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C140641b bVar;
        C140787e eVar = (C140787e) C60856cj.m92909r(this.f382234a);
        if (eVar == null || (bVar = eVar.f382282c) == null || !C140976e.m228931d(bVar, this.f382235b)) {
            C140084z zVar = this.f382236c.f382249d;
            return C140989k.m228944b(zVar.mo115436e(new C140069k(zVar, C69540x.m100944b(this.f382235b))), C140764l.f382233a);
        }
        C140770r rVar = this.f382236c;
        C140790h hVar = this.f382237d;
        Object r = C60856cj.m92909r(this.f382238e);
        C69664n.m101060f(r, "getDone(preference)");
        return C140989k.m228944b(rVar.mo115863c(hVar, eVar, (C140450al) r), new C140763k(this.f382237d, eVar));
    }
}
