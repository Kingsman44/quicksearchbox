package com.google.android.apps.search.googleapp.search.srp.external;

import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.external.e */
/* compiled from: PG */
final class C137832e implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C139798i f374990a;

    public C137832e(C139798i iVar) {
        this.f374990a = iVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Long l = (Long) obj;
        C69664n.m101061g(l, "it");
        C139798i iVar = this.f374990a;
        long longValue = l.longValue();
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        C139823j jVar2 = C139823j.f380066m;
        jVar.f380068a |= 4;
        jVar.f380071d = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
