package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.p */
/* compiled from: PG */
public final /* synthetic */ class C124491p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124437ah f343538a;

    public /* synthetic */ C124491p(C124437ah ahVar) {
        this.f343538a = ahVar;
    }

    public final void accept(Object obj) {
        C124437ah ahVar = this.f343538a;
        C119904w wVar = (C119904w) obj;
        C124448as asVar = (C124448as) C124455az.f343464c.createBuilder();
        C124444ao aoVar = (C124444ao) C124445ap.f343445c.createBuilder();
        aoVar.copyOnWrite();
        C124445ap apVar = (C124445ap) aoVar.instance;
        wVar.getClass();
        apVar.f343448b = wVar;
        apVar.f343447a |= 1;
        asVar.copyOnWrite();
        C124455az azVar = (C124455az) asVar.instance;
        C124445ap apVar2 = (C124445ap) aoVar.build();
        apVar2.getClass();
        azVar.f343467b = apVar2;
        azVar.f343466a = 2;
        ahVar.mo106424j(asVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
