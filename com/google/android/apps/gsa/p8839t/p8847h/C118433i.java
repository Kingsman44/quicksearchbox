package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import java.util.concurrent.TimeoutException;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71209as;

/* renamed from: com.google.android.apps.gsa.t.h.i */
/* compiled from: PG */
public final /* synthetic */ class C118433i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C118435k f328729a;

    /* renamed from: b */
    public final /* synthetic */ C71208ar f328730b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f328731c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f328732d;

    /* renamed from: e */
    public final /* synthetic */ C31164au f328733e;

    public /* synthetic */ C118433i(C118435k kVar, C71208ar arVar, C58833ax axVar, C53306j jVar, C31164au auVar) {
        this.f328729a = kVar;
        this.f328730b = arVar;
        this.f328731c = axVar;
        this.f328732d = jVar;
        this.f328733e = auVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C118435k kVar = this.f328729a;
        C71208ar arVar = this.f328730b;
        C58833ax axVar = this.f328731c;
        C53306j jVar = this.f328732d;
        C31164au auVar = this.f328733e;
        if (((Exception) obj) instanceof TimeoutException) {
            arVar.copyOnWrite();
            C71209as asVar = (C71209as) arVar.instance;
            C71209as asVar2 = C71209as.f190080g;
            asVar.f190083a |= 2;
            asVar.f190086d = 2;
        } else {
            arVar.copyOnWrite();
            C71209as asVar3 = (C71209as) arVar.instance;
            C71209as asVar4 = C71209as.f190080g;
            asVar3.f190083a = 2 | asVar3.f190083a;
            asVar3.f190086d = 8;
        }
        C71206ap apVar = (C71206ap) C71207aq.f190077a.createBuilder();
        apVar.mo58885m(C71209as.f190081h, (C71209as) arVar.build());
        kVar.mo103702e(axVar, (C71207aq) apVar.build(), 3, jVar, auVar);
    }
}
