package com.google.android.apps.search.googleapp.p10370p;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.p.ab */
/* compiled from: PG */
public final /* synthetic */ class C136835ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C136873i f372457a;

    public /* synthetic */ C136835ab(C136873i iVar) {
        this.f372457a = iVar;
    }

    public final void accept(Object obj) {
        C136873i iVar = this.f372457a;
        long longValue = ((Long) obj).longValue();
        iVar.copyOnWrite();
        C136875k kVar = C136875k.f372537e;
        ((C136875k) iVar.instance).mo113419a().remove(Long.valueOf(longValue));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
