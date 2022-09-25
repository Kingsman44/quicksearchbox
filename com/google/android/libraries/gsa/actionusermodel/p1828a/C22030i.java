package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22078bh;
import com.google.android.libraries.gsa.actionusermodel.C22079bi;
import com.google.protos.p4985f.p4986a.C64708r;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.i */
/* compiled from: PG */
public final /* synthetic */ class C22030i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22078bh f60752a;

    public /* synthetic */ C22030i(C22078bh bhVar) {
        this.f60752a = bhVar;
    }

    public final void accept(Object obj) {
        C22078bh bhVar = this.f60752a;
        C64708r rVar = (C64708r) obj;
        bhVar.copyOnWrite();
        C22079bi biVar = (C22079bi) bhVar.instance;
        C22079bi biVar2 = C22079bi.f60866l;
        rVar.getClass();
        biVar.f60876i = rVar;
        biVar.f60868a |= 64;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
