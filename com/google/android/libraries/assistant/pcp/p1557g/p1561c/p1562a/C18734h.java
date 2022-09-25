package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18949b;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71210at;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71211au;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71212av;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71213aw;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C18734h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18736j f52824a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f52825b;

    /* renamed from: c */
    public final /* synthetic */ C18949b f52826c;

    public /* synthetic */ C18734h(C18736j jVar, C60870cx cxVar, C18949b bVar) {
        this.f52824a = jVar;
        this.f52825b = cxVar;
        this.f52826c = bVar;
    }

    public final C60870cx apply(Object obj) {
        C18736j jVar = this.f52824a;
        C60870cx cxVar = this.f52825b;
        C18949b bVar = this.f52826c;
        C58833ax axVar = (C58833ax) obj;
        C60870cx cxVar2 = (C60870cx) axVar.mo56106b(new C18732f(jVar)).mo56109e(C60856cj.m92900i(Optional.empty()));
        C71212av avVar = (C71212av) C71213aw.f190093f.createBuilder();
        Objects.requireNonNull(avVar);
        ((Optional) C60856cj.m92909r(cxVar)).ifPresent(new C18719a(avVar));
        if (axVar.mo56113h()) {
            C71210at atVar = (C71210at) C71211au.f190089c.createBuilder();
            String packageName = ((C18913ab) axVar.mo56107c()).mo24143a().getPackageName();
            atVar.copyOnWrite();
            C71211au auVar = (C71211au) atVar.instance;
            packageName.getClass();
            auVar.f190091a |= 1;
            auVar.f190092b = packageName;
            avVar.copyOnWrite();
            C71213aw awVar = (C71213aw) avVar.instance;
            C71211au auVar2 = (C71211au) atVar.build();
            auVar2.getClass();
            awVar.f190098c = auVar2;
            awVar.f190097b = 5;
        }
        bVar.mo24228a((C71213aw) avVar.build(), cxVar2);
        return cxVar2;
    }
}
