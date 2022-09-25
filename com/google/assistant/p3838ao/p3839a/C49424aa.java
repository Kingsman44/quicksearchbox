package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3845e.C49523ag;
import com.google.assistant.p3838ao.p3839a.p3845e.C49524ah;
import com.google.assistant.p3838ao.p3839a.p3845e.C49534ar;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.assistant.ao.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C49424aa implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49523ag f127667a;

    public /* synthetic */ C49424aa(C49523ag agVar) {
        this.f127667a = agVar;
    }

    public final void accept(Object obj) {
        C49523ag agVar = this.f127667a;
        C49534ar arVar = (C49534ar) obj;
        agVar.copyOnWrite();
        C49524ah ahVar = (C49524ah) agVar.instance;
        C49524ah ahVar2 = C49524ah.f127762s;
        arVar.getClass();
        ahVar.f127774k = arVar;
        ahVar.f127764a |= 128;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
