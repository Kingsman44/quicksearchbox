package com.google.android.apps.search.podcasts.home.p10570a;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10566g.C140332a;
import com.google.android.apps.search.podcasts.p10566g.C140379g;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140983d;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140984e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54311ao;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.home.a.d */
/* compiled from: PG */
final class C140393d implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C140396g f381350a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f381351b;

    public C140393d(C140396g gVar, C60870cx cxVar) {
        this.f381350a = gVar;
        this.f381351b = cxVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C54311ao aoVar = (C54311ao) obj;
        C140379g gVar = this.f381350a.f381359d;
        C69664n.m101058d(aoVar);
        C54297aa aaVar = aoVar.f142681a;
        if (aaVar == null) {
            aaVar = C54297aa.f142650b;
        }
        C54297aa aaVar2 = aaVar;
        C69664n.m101060f(aaVar2, "it!!.feed");
        C97925o oVar = C140984e.f382770a;
        C97925o oVar2 = C140984e.f382775f;
        C140983d dVar = C140983d.f382767c;
        C140332a aVar = C140332a.COMPLETED_EPISODES;
        Object r = C60856cj.m92909r(this.f381351b);
        C69664n.m101060f(r, "getDone(playStoreSolicitationFuture)");
        return C140989k.m228948f(C140379g.m228068a(gVar, aaVar2, oVar2, dVar, aVar, false, false, ((Boolean) r).booleanValue(), false, 160), C140392c.f381349a);
    }
}
