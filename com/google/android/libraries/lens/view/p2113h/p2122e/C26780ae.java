package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.google.android.libraries.lens.view.p2113h.p2121d.C26766r;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.h.e.ae */
/* compiled from: PG */
public final /* synthetic */ class C26780ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C26781af f72967a;

    /* renamed from: b */
    public final /* synthetic */ C28097c f72968b;

    public /* synthetic */ C26780ae(C26781af afVar, C28097c cVar) {
        this.f72967a = afVar;
        this.f72968b = cVar;
    }

    public final void accept(Object obj) {
        C26781af afVar = this.f72967a;
        C28097c cVar = this.f72968b;
        C26766r rVar = (C26766r) obj;
        if (cVar.mo33558a().f76482f) {
            Integer num = cVar.f76492j;
            num.getClass();
            num.intValue();
            rVar.mo32136kP();
        }
        if (afVar.f72969a.f72974B.mo33582c().mo56113h()) {
            ((Float) afVar.f72969a.f72974B.mo33582c().mo56107c()).floatValue();
            rVar.mo32128h();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
