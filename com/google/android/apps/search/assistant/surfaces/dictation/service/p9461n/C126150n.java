package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.engine.dictation.h;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125060ao;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125061ap;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125146dt;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125147du;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9466b.C125994g;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9468a.C125997a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9468a.C125999c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b.C126001a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b.C126014n;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b.C126015o;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b.C126018r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62947c;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.n */
/* compiled from: PG */
public final class C126150n {

    /* renamed from: a */
    public final C126113dx f347611a;

    /* renamed from: b */
    public final C126038bc f347612b;

    /* renamed from: c */
    public final C126054bs f347613c;

    /* renamed from: d */
    public final C125969b f347614d;

    /* renamed from: e */
    public final Executor f347615e;

    /* renamed from: f */
    public final C125994g f347616f;

    public C126150n(C126038bc bcVar, C126054bs bsVar, C125969b bVar, Executor executor, C125994g gVar, C126113dx dxVar) {
        this.f347614d = bVar;
        this.f347615e = executor;
        this.f347616f = gVar;
        this.f347611a = dxVar;
        this.f347612b = bcVar;
        this.f347613c = bsVar;
    }

    /* renamed from: a */
    public final C60870cx mo107380a(C126087cy cyVar) {
        C60870cx cxVar = cyVar.f347491b;
        C126146j jVar = C126146j.f347602a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(jVar), this.f347615e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo107381b(C126087cy cyVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        h hVar;
        C119299u a = cyVar.mo107326a();
        C125994g gVar = this.f347616f;
        C126035k a2 = this.f347611a.mo107356a(cyVar, C52829f.f138611c);
        C125999c cVar = gVar.f347243a.f347258a;
        C126018r rVar = cVar.f347254a;
        C126029e eVar = (C126029e) a2;
        C126087cy cyVar2 = eVar.f347343d;
        C126083cu cuVar = cyVar2.f347498i;
        if ((!cuVar.f347482c || !cyVar2.f347497h) && !cuVar.f347481b) {
            cxVar = C47633f.m84733g(C60856cj.m92900i(C58485gu.m89845m()));
        } else {
            C58485gu guVar = cyVar2.f347499j;
            if (guVar.isEmpty() || Collection.EL.stream(guVar).anyMatch(C126014n.f347285a) || !(cuVar.f347481b || (hVar = cuVar.f347483d.f347503d) == h.c || hVar == h.a)) {
                C126088cz czVar = cuVar.f347483d;
                if (czVar.f347503d == h.b && !czVar.f347502c.isEmpty()) {
                    C125060ao aoVar = (C125060ao) C125061ap.f345034b.createBuilder();
                    String str = czVar.f347500a;
                    aoVar.copyOnWrite();
                    C125061ap apVar = (C125061ap) aoVar.instance;
                    str.getClass();
                    apVar.mo106792a();
                    apVar.f345036a.add(str);
                    List list = czVar.f347502c;
                    aoVar.copyOnWrite();
                    C125061ap apVar2 = (C125061ap) aoVar.instance;
                    apVar2.mo106792a();
                    C62947c.addAll((Iterable) list, (List) apVar2.f345036a);
                    cxVar2 = C47633f.m84733g(C60856cj.m92900i((C125061ap) aoVar.build()));
                } else if (czVar.f347501b.isEmpty()) {
                    cxVar2 = C47633f.m84733g(C60856cj.m92900i(C125061ap.f345034b));
                } else {
                    cxVar2 = rVar.f347291c.mo107219a(czVar.f347501b);
                }
                C60870cx cxVar4 = cxVar2;
                if (rVar.f347292d.mo107180a(eVar.f347344e)) {
                    C126088cz czVar2 = cuVar.f347483d;
                    if (czVar2.f347503d == h.e && !czVar2.f347502c.isEmpty()) {
                        C125146dt dtVar = (C125146dt) C125147du.f345228b.createBuilder();
                        String str2 = czVar2.f347500a;
                        dtVar.copyOnWrite();
                        C125147du duVar = (C125147du) dtVar.instance;
                        str2.getClass();
                        duVar.mo106809a();
                        duVar.f345230a.add(str2);
                        dtVar.mo106808a(czVar2.f347502c);
                        cxVar3 = C47633f.m84733g(C60856cj.m92900i((C125147du) dtVar.build()));
                    } else if (czVar2.f347500a.isEmpty()) {
                        cxVar3 = C47633f.m84733g(C60856cj.m92900i(C125147du.f345228b));
                    } else {
                        cxVar3 = rVar.f347291c.mo107221c(czVar2.f347500a);
                    }
                } else {
                    C60870cx b = rVar.f347291c.mo107220b(cyVar2.mo107327b(), eVar.f347344e);
                    C126015o oVar = C126015o.f347286a;
                    cxVar3 = C60922j.m93044g(b, C47810es.m84963c(oVar), rVar.f347296h);
                }
                C60870cx cxVar5 = cxVar3;
                cxVar = C47638k.m84751b(cxVar4, cxVar5).mo51520a(new C126001a(rVar, cxVar4, cxVar5, cuVar, cyVar2, a2), rVar.f347296h);
            } else {
                cxVar = C47633f.m84733g(C60856cj.m92900i(cyVar2.f347499j));
            }
        }
        C125997a aVar = new C125997a(cVar, a2);
        return mo107382c(a, C60922j.m93044g(cxVar, C47810es.m84963c(aVar), cVar.f347257d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C60870cx mo107382c(C119299u uVar, C60870cx cxVar) {
        C126144h hVar = new C126144h(this, uVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(hVar), C60826bg.f164896a);
    }
}
