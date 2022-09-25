package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.server;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138167ab;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138173ah;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138192b;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138210br;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138216bx;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138248cd;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138255f;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138259j;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138335t;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138339x;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138154b;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138155c;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138158f;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138160h;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138269d;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138271f;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138273h;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138305o;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138307q;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138309s;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138310t;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138312v;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138313w;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138315y;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.C138283i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69613f;
import p5462h.p5466c.C69577g;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.server.m */
/* compiled from: PG */
public final class C138331m extends C138173ah {

    /* renamed from: a */
    public static final C59071e f376354a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.server.m");

    /* renamed from: b */
    private final C138312v f376355b;

    /* renamed from: c */
    private final C138283i f376356c;

    /* renamed from: d */
    private final C138283i f376357d;

    /* renamed from: e */
    private final C138273h f376358e;

    /* renamed from: f */
    private final C138309s f376359f;

    /* renamed from: g */
    private final C138315y f376360g;

    /* renamed from: h */
    private final C60887da f376361h;

    /* renamed from: i */
    private final C138165m f376362i;

    /* renamed from: j */
    private final boolean f376363j;

    public C138331m(C138312v vVar, C138283i iVar, C138283i iVar2, C138273h hVar, C138309s sVar, C138315y yVar, C138165m mVar, C60887da daVar, boolean z) {
        this.f376355b = vVar;
        this.f376356c = iVar;
        this.f376357d = iVar2;
        this.f376358e = hVar;
        this.f376362i = mVar;
        this.f376359f = sVar;
        this.f376360g = yVar;
        this.f376361h = daVar;
        this.f376363j = z;
    }

    /* renamed from: b */
    public final void mo114177b(C138192b bVar, C70862aj ajVar) {
        C138315y yVar = this.f376360g;
        C60870cx e = C71663i.m104692e(yVar.f376323b, (C71424ay) null, new C138313w(yVar, bVar, (C69577g) null), 3);
        C138328j jVar = new C138328j(ajVar);
        C60856cj.m92911t(e, C47810es.m84974n(jVar), this.f376361h);
    }

    /* renamed from: c */
    public final void mo114178c(C138255f fVar, C70862aj ajVar) {
        C138273h hVar = this.f376358e;
        C60870cx e = C71663i.m104692e(hVar.f376201a, (C71424ay) null, new C138269d(hVar, fVar, (C69577g) null), 3);
        C138326h hVar2 = new C138326h(ajVar);
        C60856cj.m92911t(e, C47810es.m84974n(hVar2), this.f376361h);
    }

    /* renamed from: e */
    public final void mo114180e(C138263n nVar, C70862aj ajVar) {
        C59071e eVar = f376354a;
        C69613f fVar = C138165m.f375923a;
        ((C59052c) eVar.mo56223a(C138154b.m224512a()).mo56372aa(41190)).mo56386p("#getSuggestions");
        C138312v vVar = this.f376355b;
        C60870cx e = C71663i.m104692e(vVar.f376307a, (C71424ay) null, new C138310t(vVar, nVar, (C69577g) null), 3);
        C138322d dVar = new C138322d(ajVar);
        C60856cj.m92911t(e, C47810es.m84974n(dVar), this.f376361h);
    }

    /* renamed from: f */
    public final void mo114181f(C138335t tVar, C70862aj ajVar) {
        C138165m mVar = this.f376362i;
        C60870cx e = C71663i.m104692e(mVar.f375925c, (C71424ay) null, new C138158f(mVar, tVar, (C69577g) null), 3);
        C138330l lVar = new C138330l(ajVar);
        C60856cj.m92911t(e, C47810es.m84974n(lVar), this.f376361h);
    }

    /* renamed from: g */
    public final void mo114182g(C138339x xVar, C70862aj ajVar) {
        C138165m mVar = this.f376362i;
        C60870cx e = C71663i.m104692e(mVar.f375925c, (C71424ay) null, new C138160h(mVar, xVar, (C69577g) null), 3);
        C138321c cVar = new C138321c(ajVar);
        C60856cj.m92911t(e, C47810es.m84974n(cVar), this.f376361h);
    }

    /* renamed from: h */
    public final void mo114183h(C138167ab abVar, C70862aj ajVar) {
        C138165m mVar = this.f376362i;
        C60870cx e = C71663i.m104692e(mVar.f375925c, (C71424ay) null, new C138155c(mVar, abVar, (C69577g) null), 3);
        C138329k kVar = new C138329k(ajVar);
        C60856cj.m92911t(e, C47810es.m84974n(kVar), this.f376361h);
    }

    /* renamed from: i */
    public final void mo114184i(C138210br brVar, C70862aj ajVar) {
        C138273h hVar = this.f376358e;
        C60870cx e = C71663i.m104692e(hVar.f376201a, (C71424ay) null, new C138271f(hVar, brVar, (C69577g) null), 3);
        C138327i iVar = new C138327i(ajVar);
        C60856cj.m92911t(e, C47810es.m84974n(iVar), this.f376361h);
    }

    /* renamed from: j */
    public final void mo114185j(C138216bx bxVar, C70862aj ajVar) {
        C138309s sVar = this.f376359f;
        C60870cx e = C71663i.m104692e(sVar.f376292a, (C71424ay) null, new C138305o(sVar, bxVar, (C69577g) null), 3);
        C138325g gVar = new C138325g(ajVar);
        C60856cj.m92911t(e, C47810es.m84974n(gVar), this.f376361h);
    }

    /* renamed from: k */
    public final void mo114186k(C138248cd cdVar, C70862aj ajVar) {
        C138309s sVar = this.f376359f;
        C60870cx e = C71663i.m104692e(sVar.f376292a, (C71424ay) null, new C138307q(sVar, cdVar, (C69577g) null), 3);
        C138324f fVar = new C138324f(ajVar);
        C60856cj.m92911t(e, C47810es.m84974n(fVar), this.f376361h);
    }

    /* renamed from: d */
    public final void mo114179d(C138259j jVar, C70862aj ajVar) {
        C60870cx cxVar;
        if (!jVar.f376162c || this.f376363j) {
            cxVar = this.f376356c.mo114228a(jVar);
        } else {
            cxVar = this.f376357d.mo114228a(jVar);
        }
        C138323e eVar = new C138323e(ajVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(eVar), this.f376361h);
    }
}
