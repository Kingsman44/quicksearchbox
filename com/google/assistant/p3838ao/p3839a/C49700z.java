package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3845e.C49523ag;
import com.google.assistant.p3838ao.p3839a.p3845e.C49524ah;
import com.google.assistant.p3838ao.p3839a.p3845e.C49542az;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.assistant.ao.a.z */
/* compiled from: PG */
public final /* synthetic */ class C49700z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49523ag f128277a;

    public /* synthetic */ C49700z(C49523ag agVar) {
        this.f128277a = agVar;
    }

    public final void accept(Object obj) {
        C49523ag agVar = this.f128277a;
        C49542az azVar = (C49542az) obj;
        agVar.copyOnWrite();
        C49524ah ahVar = (C49524ah) agVar.instance;
        C49524ah ahVar2 = C49524ah.f127762s;
        azVar.getClass();
        ahVar.f127773j = azVar;
        ahVar.f127764a |= 64;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
