package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.C18777i;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18949b;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18951d;
import com.google.android.libraries.assistant.pcp.p1583o.C19030g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71212av;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71213aw;

/* renamed from: com.google.android.libraries.assistant.pcp.b.p */
/* compiled from: PG */
public final /* synthetic */ class C18545p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18551v f52543a;

    /* renamed from: b */
    public final /* synthetic */ C18949b f52544b;

    /* renamed from: c */
    public final /* synthetic */ C18718c f52545c;

    /* renamed from: d */
    public final /* synthetic */ C18777i f52546d;

    public /* synthetic */ C18545p(C18551v vVar, C18949b bVar, C18718c cVar, C18777i iVar) {
        this.f52543a = vVar;
        this.f52544b = bVar;
        this.f52545c = cVar;
        this.f52546d = iVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C18551v vVar = this.f52543a;
        C18949b bVar = this.f52544b;
        C18718c cVar = this.f52545c;
        C18777i iVar = this.f52546d;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((C18951d) bVar).mo24229b(3, C71213aw.f190093f);
            return C60856cj.m92899h(new IllegalArgumentException("No CLIENT_TYPE context supplier found."));
        }
        C53306j jVar = (C53306j) optional.get();
        if (iVar.mo24043b() == 1) {
            cxVar = C60856cj.m92899h(new IllegalArgumentException("CachingStrategy type is UNKNOWN."));
        } else {
            cxVar = C60922j.m93045h(vVar.f52557a.mo24093a(jVar), C47810es.m84966f(new C18540k(vVar, jVar, iVar, cVar)), vVar.f52560d);
        }
        C71212av avVar = (C71212av) C71213aw.f190093f.createBuilder();
        int b = iVar.mo24043b();
        avVar.copyOnWrite();
        C71213aw awVar = (C71213aw) avVar.instance;
        int i = b - 1;
        if (b != 0) {
            awVar.f190100e = i;
            awVar.f190096a |= 4;
            avVar.copyOnWrite();
            C71213aw awVar2 = (C71213aw) avVar.instance;
            awVar2.f190099d = ((C53306j) optional.get()).f139793X;
            awVar2.f190096a |= 1;
            bVar.mo24228a((C71213aw) avVar.build(), C47633f.m84733g(cxVar).mo51516i(C19030g.f53416a, vVar.f52560d));
            return cxVar;
        }
        throw null;
    }
}
