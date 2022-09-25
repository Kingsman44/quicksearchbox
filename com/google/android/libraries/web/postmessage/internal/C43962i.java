package com.google.android.libraries.web.postmessage.internal;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.postmessage.internal.i */
/* compiled from: PG */
public final /* synthetic */ class C43962i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43966m f114448a;

    public /* synthetic */ C43962i(C43966m mVar) {
        this.f114448a = mVar;
    }

    public final void accept(Object obj) {
        C43965l lVar = (C43965l) obj;
        this.f114448a.mo46958a(lVar.f114454b, lVar.f114453a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
