package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71209as;

/* renamed from: com.google.android.apps.gsa.t.h.h */
/* compiled from: PG */
public final /* synthetic */ class C118432h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C118435k f328724a;

    /* renamed from: b */
    public final /* synthetic */ C71208ar f328725b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f328726c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f328727d;

    /* renamed from: e */
    public final /* synthetic */ C31164au f328728e;

    public /* synthetic */ C118432h(C118435k kVar, C71208ar arVar, C58833ax axVar, C53306j jVar, C31164au auVar) {
        this.f328724a = kVar;
        this.f328725b = arVar;
        this.f328726c = axVar;
        this.f328727d = jVar;
        this.f328728e = auVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C118435k kVar = this.f328724a;
        C71208ar arVar = this.f328725b;
        C58833ax axVar = this.f328726c;
        C53306j jVar = this.f328727d;
        C31164au auVar = this.f328728e;
        int intValue = ((Integer) ((C58833ax) obj).mo56106b(C118434j.f328734a).mo56109e(0)).intValue();
        int i = intValue > 0 ? 2 : 10;
        arVar.copyOnWrite();
        C71209as asVar = (C71209as) arVar.instance;
        C71209as asVar2 = C71209as.f190080g;
        asVar.f190083a = 2 | asVar.f190083a;
        asVar.f190086d = i - 1;
        arVar.copyOnWrite();
        C71209as asVar3 = (C71209as) arVar.instance;
        asVar3.f190083a |= 4;
        asVar3.f190087e = intValue;
        C71206ap apVar = (C71206ap) C71207aq.f190077a.createBuilder();
        apVar.mo58885m(C71209as.f190081h, (C71209as) arVar.build());
        kVar.mo103702e(axVar, (C71207aq) apVar.build(), 2, jVar, auVar);
    }
}
