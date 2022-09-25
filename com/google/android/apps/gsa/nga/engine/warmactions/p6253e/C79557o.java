package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79572d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.C59672bz;
import com.google.common.p4552o.C59686ca;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.o */
/* compiled from: PG */
public final /* synthetic */ class C79557o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59672bz f218277a;

    public /* synthetic */ C79557o(C59672bz bzVar) {
        this.f218277a = bzVar;
    }

    public final void accept(Object obj) {
        C59672bz bzVar = this.f218277a;
        C58528ij<C79572d> ijVar = (C58528ij) obj;
        bzVar.copyOnWrite();
        C59686ca caVar = (C59686ca) bzVar.instance;
        C59686ca caVar2 = C59686ca.f160028e;
        C62961ch chVar = caVar.f160032c;
        if (!chVar.mo58948c()) {
            caVar.f160032c = C62942bv.mutableCopy(chVar);
        }
        for (C79572d dVar : ijVar) {
            caVar.f160032c.mo58916g(dVar.f218344c);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
