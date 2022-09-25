package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22078bh;
import com.google.android.libraries.gsa.actionusermodel.C22079bi;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.h */
/* compiled from: PG */
public final /* synthetic */ class C22029h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22078bh f60751a;

    public /* synthetic */ C22029h(C22078bh bhVar) {
        this.f60751a = bhVar;
    }

    public final void accept(Object obj) {
        C22078bh bhVar = this.f60751a;
        C63088z zVar = (C63088z) obj;
        bhVar.copyOnWrite();
        C22079bi biVar = (C22079bi) bhVar.instance;
        C22079bi biVar2 = C22079bi.f60866l;
        zVar.getClass();
        biVar.f60868a |= 16;
        biVar.f60874g = zVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
