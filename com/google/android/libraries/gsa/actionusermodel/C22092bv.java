package com.google.android.libraries.gsa.actionusermodel;

import com.google.protos.p4985f.p4986a.C64655ai;
import com.google.protos.p4985f.p4986a.C64666at;
import com.google.protos.p4985f.p4986a.C64667au;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.bv */
/* compiled from: PG */
public final /* synthetic */ class C22092bv implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64666at f60895a;

    public /* synthetic */ C22092bv(C64666at atVar) {
        this.f60895a = atVar;
    }

    public final void accept(Object obj) {
        C64666at atVar = this.f60895a;
        C64655ai aiVar = (C64655ai) obj;
        atVar.copyOnWrite();
        C64667au auVar = (C64667au) atVar.instance;
        C64667au auVar2 = C64667au.f175280f;
        aiVar.getClass();
        auVar.mo59290a();
        auVar.f175284c.add(aiVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
