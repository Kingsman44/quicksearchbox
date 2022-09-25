package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22074bd;
import com.google.android.libraries.gsa.actionusermodel.C22075be;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.k */
/* compiled from: PG */
public final /* synthetic */ class C22032k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22074bd f60754a;

    public /* synthetic */ C22032k(C22074bd bdVar) {
        this.f60754a = bdVar;
    }

    public final void accept(Object obj) {
        C22074bd bdVar = this.f60754a;
        C63088z zVar = (C63088z) obj;
        bdVar.copyOnWrite();
        C22075be beVar = (C22075be) bdVar.instance;
        C22075be beVar2 = C22075be.f60833n;
        zVar.getClass();
        beVar.f60835a |= 32;
        beVar.f60842h = zVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
