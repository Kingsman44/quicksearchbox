package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128177i;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128178j;
import com.google.protos.p4816ai.p4818b.C63204j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ir */
/* compiled from: PG */
public final /* synthetic */ class C109295ir implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C128177i f304470a;

    public /* synthetic */ C109295ir(C128177i iVar) {
        this.f304470a = iVar;
    }

    public final void accept(Object obj) {
        C128177i iVar = this.f304470a;
        C63204j jVar = (C63204j) obj;
        iVar.copyOnWrite();
        C128178j jVar2 = (C128178j) iVar.instance;
        C128178j jVar3 = C128178j.f352610j;
        jVar.getClass();
        jVar2.f352617f = jVar;
        jVar2.f352612a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
