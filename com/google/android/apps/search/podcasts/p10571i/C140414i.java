package com.google.android.apps.search.podcasts.p10571i;

import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import com.google.android.apps.search.podcasts.player.C140776c;
import com.google.android.apps.search.podcasts.player.C140784d;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.i.i */
/* compiled from: PG */
public final class C140414i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f381401a;

    /* renamed from: b */
    final /* synthetic */ boolean f381402b;

    /* renamed from: c */
    final /* synthetic */ C140415j f381403c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f381404d;

    /* renamed from: e */
    final /* synthetic */ C60870cx f381405e;

    public C140414i(C60870cx cxVar, boolean z, C140415j jVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f381401a = cxVar;
        this.f381402b = z;
        this.f381403c = jVar;
        this.f381404d = cxVar2;
        this.f381405e = cxVar3;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        if (!(th instanceof CancellationException)) {
            C59052c cVar = (C59052c) ((C59052c) C140415j.f381406a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41601));
            cVar.mo56386p("Failed to retrieve last played episode");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C140641b bVar = (C140641b) obj;
        C140787e eVar = (C140787e) C60856cj.m92909r(this.f381401a);
        if (bVar != null) {
            boolean z = this.f381402b;
            C140415j jVar = this.f381403c;
            C60870cx cxVar = this.f381404d;
            C60870cx cxVar2 = this.f381405e;
            if (z) {
                if (eVar == null) {
                    return;
                }
                if (C140976e.m228931d(eVar.f382282c, bVar)) {
                    long j = eVar.f382285f;
                    C140644e eVar2 = bVar.f381984k;
                    if (eVar2 == null) {
                        eVar2 = C140644e.f381988d;
                    }
                    if (Math.abs(j - eVar2.f381992c) <= 60000) {
                        return;
                    }
                }
            }
            C140790h hVar = jVar.f381408c;
            Object r = C60856cj.m92909r(cxVar);
            C69664n.m101060f(r, "getDone(playbackParameters)");
            C140784d dVar = (C140784d) r;
            C140644e eVar3 = bVar.f381984k;
            if (eVar3 == null) {
                eVar3 = C140644e.f381988d;
            }
            long j2 = eVar3.f381992c;
            C140509u a = C140509u.m228215a(((C140450al) C60856cj.m92909r(cxVar2)).f381523i);
            if (a == null) {
                a = C140509u.UNRECOGNIZED;
            }
            C69664n.m101060f(a, "getDone(preferenceFuture).getLastAutoplayContext()");
            C140776c.m228582b(hVar, bVar, dVar, j2, false, a, 8);
        }
    }
}
