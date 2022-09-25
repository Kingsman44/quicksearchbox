package com.google.android.apps.search.podcasts.episode.p10563a;

import com.google.android.apps.search.podcasts.episode.C140237p;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10569h.C140387f;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4061a.p4062a.C54180f;
import com.google.p4017at.p4060h.p4061a.p4062a.C54181g;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54162n;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54164p;
import com.google.p4017at.p4082j.p4083a.C54316at;
import com.google.p4017at.p4082j.p4083a.C54317au;
import com.google.p4017at.p4082j.p4083a.C54318av;
import com.google.p4017at.p4082j.p4083a.C54319aw;
import com.google.p4017at.p4082j.p4083a.C54383ci;
import com.google.p4017at.p4082j.p4083a.C54384cj;
import com.google.p4017at.p4082j.p4083a.C54385ck;
import com.google.p4017at.p4082j.p4083a.C54388cn;
import com.google.p4017at.p4082j.p4083a.C54393cs;
import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.protobuf.C62942bv;
import p5462h.C69778n;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.episode.a.e */
/* compiled from: PG */
public final class C140218e implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C140237p f380946a;

    /* renamed from: b */
    final /* synthetic */ C140219f f380947b;

    public C140218e(C140237p pVar, C140219f fVar) {
        this.f380946a = pVar;
        this.f380947b = fVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C69778n a = C140214a.m227909a(this.f380946a);
        Object obj = a.f186153a;
        Object obj2 = a.f186155c;
        C140219f fVar = this.f380947b;
        C60870cx e = fVar.f380953f.mo50345e(C140214a.m227910b(this.f380946a, fVar.f380956i));
        C60870cx a2 = this.f380947b.f380951d.mo115825a((String) obj, (String) obj2);
        return C140989k.m228943a(C47638k.m84753d(e, a2).mo51520a(new C140217d(this.f380947b, e, a2), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C54162n b = C140214a.m227910b(this.f380946a, this.f380947b.f380956i);
        C140219f fVar = this.f380947b;
        C46407v vVar = fVar.f380953f;
        C140387f fVar2 = fVar.f380949b;
        C140747m mVar = fVar2.f381343b;
        C54180f fVar3 = fVar2.f381342a;
        C70888j jVar = fVar3.f189039a;
        C70338di diVar = C54181g.f142195a;
        if (diVar == null) {
            synchronized (C54181g.class) {
                diVar = C54181g.f142195a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.mothership.searchapi.v2.WernickeService", "GetEpisodeData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54162n.f142138d);
                    d.f187486b = C70850d.m103697c(C54164p.f142144b);
                    diVar = d.mo62040a();
                    C54181g.f142195a = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, fVar3.f189040b), b);
        mVar.mo115851a("Wernicke", "GetEpisodeData", a);
        C60870cx f = vVar.mo50346f(b, a);
        C140385d dVar = this.f380947b.f380948a;
        C69778n a2 = C140214a.m227909a(this.f380946a);
        Object obj = a2.f186153a;
        Object obj2 = a2.f186154b;
        Object obj3 = a2.f186155c;
        C54316at atVar = (C54316at) C54319aw.f142692b.createBuilder();
        C54317au auVar = (C54317au) C54318av.f142688c.createBuilder();
        C54393cs csVar = (C54393cs) C54394ct.f142866c.createBuilder();
        csVar.copyOnWrite();
        obj2.getClass();
        ((C54394ct) csVar.instance).f142868a = (String) obj2;
        csVar.copyOnWrite();
        obj.getClass();
        ((C54394ct) csVar.instance).f142869b = (String) obj;
        auVar.copyOnWrite();
        C54394ct ctVar = (C54394ct) csVar.build();
        ctVar.getClass();
        ((C54318av) auVar.instance).f142690a = ctVar;
        C54383ci ciVar = (C54383ci) C54388cn.f142853d.createBuilder();
        C54384cj cjVar = (C54384cj) C54385ck.f142847b.createBuilder();
        cjVar.mo54112a((String) obj3);
        ciVar.copyOnWrite();
        C54388cn cnVar = (C54388cn) ciVar.instance;
        C54385ck ckVar = (C54385ck) cjVar.build();
        ckVar.getClass();
        cnVar.f142856b = ckVar;
        cnVar.f142855a = 2;
        auVar.copyOnWrite();
        C54388cn cnVar2 = (C54388cn) ciVar.build();
        cnVar2.getClass();
        ((C54318av) auVar.instance).f142691b = cnVar2;
        atVar.mo54087a(auVar);
        C62942bv build = atVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .ad…       )\n        .build()");
        return C47638k.m84751b(f, C140989k.m228945c(dVar.mo115641a((C54319aw) build), new C140216c(this.f380946a, this.f380947b))).mo51520a(new C140215b(this.f380947b), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        C46690ah ahVar = C140192a.f380885a;
        C69664n.m101060f(ahVar, "PODCAST_KEY");
        return ahVar;
    }
}
