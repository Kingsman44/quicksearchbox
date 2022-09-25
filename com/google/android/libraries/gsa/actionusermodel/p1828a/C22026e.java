package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22072bb;
import com.google.android.libraries.gsa.actionusermodel.C22073bc;
import com.google.protos.p4985f.p4986a.C64708r;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.e */
/* compiled from: PG */
public final /* synthetic */ class C22026e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22072bb f60748a;

    public /* synthetic */ C22026e(C22072bb bbVar) {
        this.f60748a = bbVar;
    }

    public final void accept(Object obj) {
        C22072bb bbVar = this.f60748a;
        C64708r rVar = (C64708r) obj;
        bbVar.copyOnWrite();
        C22073bc bcVar = (C22073bc) bbVar.instance;
        C22073bc bcVar2 = C22073bc.f60820k;
        rVar.getClass();
        bcVar.f60829h = rVar;
        bcVar.f60822a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
