package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128177i;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128178j;
import com.google.assistant.p3745ab.C48305dd;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.is */
/* compiled from: PG */
public final /* synthetic */ class C109296is implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C128177i f304471a;

    public /* synthetic */ C109296is(C128177i iVar) {
        this.f304471a = iVar;
    }

    public final void accept(Object obj) {
        C128177i iVar = this.f304471a;
        C48305dd ddVar = (C48305dd) obj;
        iVar.copyOnWrite();
        C128178j jVar = (C128178j) iVar.instance;
        C128178j jVar2 = C128178j.f352610j;
        ddVar.getClass();
        jVar.f352614c = ddVar;
        jVar.f352613b = 5;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
