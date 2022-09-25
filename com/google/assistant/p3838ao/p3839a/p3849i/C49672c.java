package com.google.assistant.p3838ao.p3839a.p3849i;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.assistant.ao.a.i.c */
/* compiled from: PG */
public final /* synthetic */ class C49672c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49674e f128230a;

    /* renamed from: b */
    public final /* synthetic */ String f128231b;

    public /* synthetic */ C49672c(C49674e eVar, String str) {
        this.f128230a = eVar;
        this.f128231b = str;
    }

    public final void accept(Object obj) {
        C49674e eVar = this.f128230a;
        eVar.f128233a.put(this.f128231b, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
