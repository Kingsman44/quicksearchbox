package com.google.android.libraries.gsa.actionusermodel;

import com.google.protos.p4985f.p5030q.C64990ac;
import com.google.protos.p4985f.p5030q.C64991ad;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.as */
/* compiled from: PG */
public final /* synthetic */ class C22061as implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64990ac f60788a;

    public /* synthetic */ C22061as(C64990ac acVar) {
        this.f60788a = acVar;
    }

    public final void accept(Object obj) {
        C64990ac acVar = this.f60788a;
        String str = (String) obj;
        acVar.copyOnWrite();
        C64991ad adVar = (C64991ad) acVar.instance;
        C64991ad adVar2 = C64991ad.f175990i;
        str.getClass();
        adVar.f175992a |= 4;
        adVar.f175996e = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
