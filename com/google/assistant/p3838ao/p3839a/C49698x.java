package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3845e.C49523ag;
import com.google.assistant.p3838ao.p3839a.p3845e.C49524ah;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.assistant.ao.a.x */
/* compiled from: PG */
public final /* synthetic */ class C49698x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49523ag f128275a;

    public /* synthetic */ C49698x(C49523ag agVar) {
        this.f128275a = agVar;
    }

    public final void accept(Object obj) {
        C49523ag agVar = this.f128275a;
        String str = (String) obj;
        agVar.copyOnWrite();
        C49524ah ahVar = (C49524ah) agVar.instance;
        C49524ah ahVar2 = C49524ah.f127762s;
        str.getClass();
        ahVar.f127764a |= 32;
        ahVar.f127772i = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
