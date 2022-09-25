package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.assistant.p3944g.p3948b.p3949a.C52954s;
import com.google.assistant.p3944g.p3948b.p3949a.C52955t;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.aj */
/* compiled from: PG */
public final /* synthetic */ class C147901aj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52954s f398963a;

    public /* synthetic */ C147901aj(C52954s sVar) {
        this.f398963a = sVar;
    }

    public final void accept(Object obj) {
        C52954s sVar = this.f398963a;
        long longValue = ((Long) obj).longValue();
        sVar.copyOnWrite();
        C52955t tVar = (C52955t) sVar.instance;
        C52955t tVar2 = C52955t.f138843e;
        tVar.f138845a |= 2;
        tVar.f138847c = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
