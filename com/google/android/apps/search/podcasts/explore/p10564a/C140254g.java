package com.google.android.apps.search.podcasts.explore.p10564a;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10566g.C140332a;
import com.google.android.apps.search.podcasts.p10566g.C140379g;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140983d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54303ag;
import com.google.p4017at.p4082j.p4083a.C54447l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.a.g */
/* compiled from: PG */
final class C140254g implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C140261n f381024a;

    /* renamed from: b */
    final /* synthetic */ boolean f381025b;

    /* renamed from: c */
    final /* synthetic */ boolean f381026c;

    public C140254g(C140261n nVar, boolean z, boolean z2) {
        this.f381024a = nVar;
        this.f381025b = z;
        this.f381026c = z2;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C54303ag agVar = (C54303ag) obj;
        C140379g gVar = this.f381024a.f381044c;
        C69664n.m101058d(agVar);
        C54297aa aaVar = ((C54447l) agVar.f142664a.get(0)).f142977a;
        if (aaVar == null) {
            aaVar = C54297aa.f142650b;
        }
        C54297aa aaVar2 = aaVar;
        C69664n.m101060f(aaVar2, "data!!.getFeeds(0).feed");
        C97925o oVar = C97925o.f273439f;
        C69664n.m101060f(oVar, "getDefaultInstance()");
        C140983d dVar = C140983d.f382766b;
        C140332a aVar = C140332a.BLOCKED_AND_DISLIKED;
        boolean z = this.f381025b;
        return C140989k.m228944b(C140379g.m228068a(gVar, aaVar2, oVar, dVar, aVar, z && this.f381026c, z && this.f381026c, false, z && this.f381024a.f381048g, 64), C140253f.f381023a);
    }
}
