package com.google.android.libraries.assistant.pcp.p1579n.p1582c;

import com.google.android.libraries.assistant.pcp.p1573k.C18925e;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3980n.p3985c.C53019j;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protos.p5124m.p5125a.C65603f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.n.c.i */
/* compiled from: PG */
public final /* synthetic */ class C19013i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C19015k f53386a;

    /* renamed from: b */
    public final /* synthetic */ C53019j f53387b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f53388c;

    public /* synthetic */ C19013i(C19015k kVar, C53019j jVar, C53306j jVar2) {
        this.f53386a = kVar;
        this.f53387b = jVar;
        this.f53388c = jVar2;
    }

    public final void accept(Object obj) {
        C52560wg wgVar;
        C19015k kVar = this.f53386a;
        C53019j jVar = this.f53387b;
        C53306j jVar2 = this.f53388c;
        if (((C65603f) kVar.f53390b.mo17428b()).f178307a.contains((String) obj)) {
            if (kVar.f53391c.contains(Integer.valueOf(jVar2.f139793X))) {
                wgVar = C18925e.m36385c(kVar.f53392d);
            } else {
                wgVar = C18925e.m36384b(kVar.f53392d);
            }
            jVar.mo53956a(wgVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
