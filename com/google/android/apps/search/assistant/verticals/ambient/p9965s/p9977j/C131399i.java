package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.assistant.p3886c.C50845q;
import com.google.assistant.p3886c.C50846r;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.i */
/* compiled from: PG */
public final /* synthetic */ class C131399i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50845q f359195a;

    public /* synthetic */ C131399i(C50845q qVar) {
        this.f359195a = qVar;
    }

    public final void accept(Object obj) {
        C50845q qVar = this.f359195a;
        C63088z zVar = (C63088z) obj;
        qVar.copyOnWrite();
        C50846r rVar = (C50846r) qVar.instance;
        C50846r rVar2 = C50846r.f132401d;
        zVar.getClass();
        rVar.f132403a |= 1;
        rVar.f132404b = zVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
