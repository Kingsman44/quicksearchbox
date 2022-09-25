package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.s */
/* compiled from: PG */
public final /* synthetic */ class C124494s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124437ah f343541a;

    public /* synthetic */ C124494s(C124437ah ahVar) {
        this.f343541a = ahVar;
    }

    public final void accept(Object obj) {
        C124437ah ahVar = this.f343541a;
        C119844cl clVar = (C119844cl) obj;
        C124448as asVar = (C124448as) C124455az.f343464c.createBuilder();
        C124449at atVar = (C124449at) C124450au.f343453c.createBuilder();
        atVar.copyOnWrite();
        C124450au auVar = (C124450au) atVar.instance;
        clVar.getClass();
        auVar.f343456b = clVar;
        auVar.f343455a |= 1;
        asVar.copyOnWrite();
        C124455az azVar = (C124455az) asVar.instance;
        C124450au auVar2 = (C124450au) atVar.build();
        auVar2.getClass();
        azVar.f343467b = auVar2;
        azVar.f343466a = 5;
        ahVar.mo106424j(asVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
