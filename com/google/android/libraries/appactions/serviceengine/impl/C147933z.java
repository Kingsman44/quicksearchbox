package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.assistant.p3944g.p3948b.p3949a.C52938c;
import com.google.assistant.p3944g.p3948b.p3949a.C52939d;
import com.google.assistant.p3944g.p3948b.p3949a.C52945j;
import com.google.assistant.p3944g.p3948b.p3949a.C52946k;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.z */
/* compiled from: PG */
public final /* synthetic */ class C147933z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52945j f399012a;

    public /* synthetic */ C147933z(C52945j jVar) {
        this.f399012a = jVar;
    }

    public final void accept(Object obj) {
        C52945j jVar = this.f399012a;
        String str = (String) obj;
        C52938c cVar = (C52938c) C52939d.f138804e.createBuilder();
        cVar.copyOnWrite();
        C52939d dVar = (C52939d) cVar.instance;
        dVar.f138809d = 1;
        dVar.f138806a = 1 | dVar.f138806a;
        cVar.copyOnWrite();
        C52939d dVar2 = (C52939d) cVar.instance;
        str.getClass();
        dVar2.f138807b = 2;
        dVar2.f138808c = str;
        jVar.copyOnWrite();
        C52946k kVar = (C52946k) jVar.instance;
        C52939d dVar3 = (C52939d) cVar.build();
        C52946k kVar2 = C52946k.f138824d;
        dVar3.getClass();
        kVar.f138828c = dVar3;
        kVar.f138826a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
