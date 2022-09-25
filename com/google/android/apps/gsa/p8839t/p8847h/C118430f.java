package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71209as;

/* renamed from: com.google.android.apps.gsa.t.h.f */
/* compiled from: PG */
public final /* synthetic */ class C118430f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C118435k f328714a;

    /* renamed from: b */
    public final /* synthetic */ C71208ar f328715b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f328716c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f328717d;

    /* renamed from: e */
    public final /* synthetic */ C31164au f328718e;

    public /* synthetic */ C118430f(C118435k kVar, C71208ar arVar, C58833ax axVar, C53306j jVar, C31164au auVar) {
        this.f328714a = kVar;
        this.f328715b = arVar;
        this.f328716c = axVar;
        this.f328717d = jVar;
        this.f328718e = auVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C118435k kVar = this.f328714a;
        C71208ar arVar = this.f328715b;
        C58833ax axVar = this.f328716c;
        C53306j jVar = this.f328717d;
        C31164au auVar = this.f328718e;
        C58833ax axVar2 = (C58833ax) obj;
        if (axVar2.mo56113h()) {
            int h = ((C18913ab) axVar2.mo56107c()).mo24151h();
            int i = h - 1;
            if (h != 0) {
                arVar.copyOnWrite();
                C71209as asVar = (C71209as) arVar.instance;
                C71209as asVar2 = C71209as.f190080g;
                asVar.f190083a |= 2;
                asVar.f190086d = i;
                int size = ((C18913ab) axVar2.mo56107c()).mo24150g().size();
                arVar.copyOnWrite();
                C71209as asVar3 = (C71209as) arVar.instance;
                asVar3.f190083a |= 4;
                asVar3.f190087e = size;
            } else {
                throw null;
            }
        }
        C71206ap apVar = (C71206ap) C71207aq.f190077a.createBuilder();
        apVar.mo58885m(C71209as.f190081h, (C71209as) arVar.build());
        kVar.mo103702e(axVar, (C71207aq) apVar.build(), 2, jVar, auVar);
    }
}
