package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22072bb;
import com.google.android.libraries.gsa.actionusermodel.C22073bc;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.c */
/* compiled from: PG */
public final /* synthetic */ class C22024c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22072bb f60746a;

    public /* synthetic */ C22024c(C22072bb bbVar) {
        this.f60746a = bbVar;
    }

    public final void accept(Object obj) {
        C22072bb bbVar = this.f60746a;
        String str = (String) obj;
        bbVar.copyOnWrite();
        C22073bc bcVar = (C22073bc) bbVar.instance;
        C22073bc bcVar2 = C22073bc.f60820k;
        str.getClass();
        bcVar.f60822a |= 4;
        bcVar.f60826e = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
