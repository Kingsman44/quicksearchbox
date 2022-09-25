package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9680a;

import p3186j$.util.function.Consumer;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71038ck;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71040cm;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C128131e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C71038ck f352512a;

    public /* synthetic */ C128131e(C71038ck ckVar) {
        this.f352512a = ckVar;
    }

    public final void accept(Object obj) {
        C71038ck ckVar = this.f352512a;
        long longValue = ((Long) obj).longValue();
        ckVar.copyOnWrite();
        C71040cm cmVar = (C71040cm) ckVar.instance;
        C71040cm cmVar2 = C71040cm.f189458d;
        cmVar.f189460a |= 2;
        cmVar.f189462c = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
