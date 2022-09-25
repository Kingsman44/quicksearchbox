package com.google.android.apps.search.podcasts.show.p10616c;

import com.google.android.apps.search.podcasts.p10550b.p10551a.C139988a;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.show.p10616c.p10617a.C141139a;
import com.google.android.apps.search.podcasts.show.p10616c.p10617a.C141140b;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54316at;
import com.google.p4017at.p4082j.p4083a.C54317au;
import com.google.p4017at.p4082j.p4083a.C54318av;
import com.google.p4017at.p4082j.p4083a.C54319aw;
import com.google.p4017at.p4082j.p4083a.C54383ci;
import com.google.p4017at.p4082j.p4083a.C54388cn;
import com.google.p4017at.p4082j.p4083a.C54393cs;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.c.h */
/* compiled from: PG */
public final class C141147h implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C141150k f383215a;

    /* renamed from: b */
    final /* synthetic */ String f383216b;

    /* renamed from: c */
    final /* synthetic */ boolean f383217c;

    /* renamed from: d */
    final /* synthetic */ C69644aa f383218d;

    public C141147h(C141150k kVar, String str, boolean z, C69644aa aaVar) {
        this.f383215a = kVar;
        this.f383216b = str;
        this.f383217c = z;
        this.f383218d = aaVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C46407v vVar = this.f383215a.f383226f;
        C141139a aVar = (C141139a) C141140b.f383193b.createBuilder();
        String str = this.f383216b;
        aVar.copyOnWrite();
        str.getClass();
        ((C141140b) aVar.instance).f383195a = str;
        C60870cx e = vVar.mo50345e(aVar.build());
        C69664n.m101060f(e, "sortPreferencesCache.get…FeedUrl(feedUrl).build())");
        C60870cx b = C140989k.m228944b(e, C141146g.f383214a);
        C60870cx a = this.f383215a.f383222b.mo115376a(C69540x.m100944b(this.f383216b), C139988a.DONT_CARE);
        C60870cx c = C140989k.m228945c(b, new C141145f(this.f383215a, this.f383216b));
        C60870cx b2 = this.f383215a.f383229i.mo116046b();
        return C140989k.m228943a(C47638k.m84753d(a, c, b2).mo51521b(new C141144e(a, b2, this.f383216b, this.f383215a, c, this.f383218d, b), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C140385d dVar = this.f383215a.f383221a;
        C54316at atVar = (C54316at) C54319aw.f142692b.createBuilder();
        C54317au auVar = (C54317au) C54318av.f142688c.createBuilder();
        C54393cs csVar = (C54393cs) C54394ct.f142866c.createBuilder();
        String str = this.f383216b;
        csVar.copyOnWrite();
        str.getClass();
        ((C54394ct) csVar.instance).f142869b = str;
        auVar.copyOnWrite();
        C54394ct ctVar = (C54394ct) csVar.build();
        ctVar.getClass();
        ((C54318av) auVar.instance).f142690a = ctVar;
        C54383ci ciVar = (C54383ci) C54388cn.f142853d.createBuilder();
        boolean z = this.f383217c;
        ciVar.copyOnWrite();
        ((C54388cn) ciVar.instance).f142857c = z;
        auVar.copyOnWrite();
        C54388cn cnVar = (C54388cn) ciVar.build();
        cnVar.getClass();
        ((C54318av) auVar.instance).f142691b = cnVar;
        atVar.mo54087a(auVar);
        return C140989k.m228945c(dVar.mo115641a((C54319aw) atVar.build()), new C141142c(this.f383215a, this.f383216b));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        C46690ah ahVar = C140192a.f380885a;
        C69664n.m101060f(ahVar, "PODCAST_KEY");
        return ahVar;
    }
}
