package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22072bb;
import com.google.android.libraries.gsa.actionusermodel.C22073bc;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.d */
/* compiled from: PG */
public final /* synthetic */ class C22025d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22072bb f60747a;

    public /* synthetic */ C22025d(C22072bb bbVar) {
        this.f60747a = bbVar;
    }

    public final void accept(Object obj) {
        C22072bb bbVar = this.f60747a;
        C63088z zVar = (C63088z) obj;
        bbVar.copyOnWrite();
        C22073bc bcVar = (C22073bc) bbVar.instance;
        C22073bc bcVar2 = C22073bc.f60820k;
        zVar.getClass();
        bcVar.f60822a |= 8;
        bcVar.f60827f = zVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
