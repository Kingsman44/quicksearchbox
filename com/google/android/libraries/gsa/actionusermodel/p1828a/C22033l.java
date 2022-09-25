package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22074bd;
import com.google.android.libraries.gsa.actionusermodel.C22075be;
import com.google.protos.p4985f.p4986a.C64708r;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.l */
/* compiled from: PG */
public final /* synthetic */ class C22033l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22074bd f60755a;

    public /* synthetic */ C22033l(C22074bd bdVar) {
        this.f60755a = bdVar;
    }

    public final void accept(Object obj) {
        C22074bd bdVar = this.f60755a;
        C64708r rVar = (C64708r) obj;
        bdVar.copyOnWrite();
        C22075be beVar = (C22075be) bdVar.instance;
        C22075be beVar2 = C22075be.f60833n;
        rVar.getClass();
        beVar.f60844j = rVar;
        beVar.f60835a |= 128;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
