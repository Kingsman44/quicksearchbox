package com.google.android.libraries.gsa.actionusermodel;

import com.google.protos.p4985f.p5030q.C64994ag;
import com.google.protos.p4985f.p5030q.C64995ah;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ak */
/* compiled from: PG */
public final /* synthetic */ class C22053ak implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64994ag f60780a;

    public /* synthetic */ C22053ak(C64994ag agVar) {
        this.f60780a = agVar;
    }

    public final void accept(Object obj) {
        C64994ag agVar = this.f60780a;
        String str = (String) obj;
        agVar.copyOnWrite();
        C64995ah ahVar = (C64995ah) agVar.instance;
        C64995ah ahVar2 = C64995ah.f176013k;
        str.getClass();
        ahVar.f176015a |= 32;
        ahVar.f176022h = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
