package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import com.google.assistant.p3861at.C49829an;
import com.google.assistant.p3861at.C49830ao;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.k */
/* compiled from: PG */
public final /* synthetic */ class C107287k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49829an f298596a;

    public /* synthetic */ C107287k(C49829an anVar) {
        this.f298596a = anVar;
    }

    public final void accept(Object obj) {
        C49829an anVar = this.f298596a;
        C63088z zVar = (C63088z) obj;
        anVar.copyOnWrite();
        C49830ao aoVar = (C49830ao) anVar.instance;
        C49830ao aoVar2 = C49830ao.f129482j;
        zVar.getClass();
        aoVar.f129484a |= 64;
        aoVar.f129490g = zVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
