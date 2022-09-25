package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22076bf;
import com.google.android.libraries.gsa.actionusermodel.C22077bg;
import com.google.protos.p4985f.p4986a.C64708r;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.r */
/* compiled from: PG */
public final /* synthetic */ class C22039r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22076bf f60761a;

    public /* synthetic */ C22039r(C22076bf bfVar) {
        this.f60761a = bfVar;
    }

    public final void accept(Object obj) {
        C22076bf bfVar = this.f60761a;
        C64708r rVar = (C64708r) obj;
        bfVar.copyOnWrite();
        C22077bg bgVar = (C22077bg) bfVar.instance;
        C22077bg bgVar2 = C22077bg.f60849o;
        rVar.getClass();
        bgVar.f60861k = rVar;
        bgVar.f60851a |= 256;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
