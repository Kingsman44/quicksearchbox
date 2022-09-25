package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.assistant.p3994s.p3995a.C53306j;
import p3186j$.util.function.Consumer;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71212av;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71213aw;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.k */
/* compiled from: PG */
public final /* synthetic */ class C18737k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C71212av f52834a;

    public /* synthetic */ C18737k(C71212av avVar) {
        this.f52834a = avVar;
    }

    public final void accept(Object obj) {
        C71212av avVar = this.f52834a;
        avVar.copyOnWrite();
        C71213aw awVar = (C71213aw) avVar.instance;
        C71213aw awVar2 = C71213aw.f190093f;
        awVar.f190099d = ((C53306j) obj).f139793X;
        awVar.f190096a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
