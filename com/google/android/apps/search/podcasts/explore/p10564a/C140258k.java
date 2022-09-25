package com.google.android.apps.search.podcasts.explore.p10564a;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10566g.C140332a;
import com.google.android.apps.search.podcasts.p10566g.C140379g;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140983d;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140984e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54307ak;
import com.google.p4017at.p4082j.p4083a.C54447l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.a.k */
/* compiled from: PG */
final class C140258k implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C140261n f381034a;

    /* renamed from: b */
    final /* synthetic */ boolean f381035b;

    /* renamed from: c */
    final /* synthetic */ boolean f381036c;

    public C140258k(C140261n nVar, boolean z, boolean z2) {
        this.f381034a = nVar;
        this.f381035b = z;
        this.f381036c = z2;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C54307ak akVar = (C54307ak) obj;
        C140379g gVar = this.f381034a.f381044c;
        C69664n.m101058d(akVar);
        C54447l lVar = akVar.f142674b;
        if (lVar == null) {
            lVar = C54447l.f142975b;
        }
        C54297aa aaVar = lVar.f142977a;
        if (aaVar == null) {
            aaVar = C54297aa.f142650b;
        }
        C54297aa aaVar2 = aaVar;
        C69664n.m101060f(aaVar2, "data!!.firstFeed.feed");
        C97925o oVar = C140984e.f382770a;
        C97925o oVar2 = C140984e.f382774e;
        C140983d dVar = C140983d.f382766b;
        C140332a aVar = C140332a.BLOCKED_AND_DISLIKED;
        boolean z = this.f381035b;
        return C140989k.m228948f(C140379g.m228068a(gVar, aaVar2, oVar2, dVar, aVar, z && this.f381036c, z && this.f381036c, false, z && this.f381034a.f381048g, 64), C140257j.f381033a);
    }
}
