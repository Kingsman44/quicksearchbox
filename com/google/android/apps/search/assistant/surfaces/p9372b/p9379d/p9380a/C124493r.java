package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.r */
/* compiled from: PG */
public final /* synthetic */ class C124493r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124437ah f343540a;

    public /* synthetic */ C124493r(C124437ah ahVar) {
        this.f343540a = ahVar;
    }

    public final void accept(Object obj) {
        C124437ah ahVar = this.f343540a;
        C119885dz dzVar = (C119885dz) obj;
        C124448as asVar = (C124448as) C124455az.f343464c.createBuilder();
        C124453ax axVar = (C124453ax) C124454ay.f343460c.createBuilder();
        axVar.copyOnWrite();
        C124454ay ayVar = (C124454ay) axVar.instance;
        dzVar.getClass();
        ayVar.f343463b = dzVar;
        ayVar.f343462a |= 1;
        asVar.copyOnWrite();
        C124455az azVar = (C124455az) asVar.instance;
        C124454ay ayVar2 = (C124454ay) axVar.build();
        ayVar2.getClass();
        azVar.f343467b = ayVar2;
        azVar.f343466a = 3;
        ahVar.mo106424j(asVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
