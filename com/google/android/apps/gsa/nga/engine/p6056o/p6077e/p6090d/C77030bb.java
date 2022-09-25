package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82832cb;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82833cc;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bb */
/* compiled from: PG */
public final /* synthetic */ class C77030bb implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ df f212612a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f212613b;

    public /* synthetic */ C77030bb(df dfVar, C58485gu guVar) {
        this.f212612a = dfVar;
        this.f212613b = guVar;
    }

    public final void accept(Object obj) {
        df dfVar = this.f212612a;
        C58485gu guVar = this.f212613b;
        C82832cb cbVar = (C82832cb) obj;
        C58485gu a = dfVar.a();
        cbVar.copyOnWrite();
        C82833cc ccVar = (C82833cc) cbVar.instance;
        C82833cc ccVar2 = C82833cc.f225801h;
        C62964ck ckVar = ccVar.f225808f;
        if (!ckVar.mo58948c()) {
            ccVar.f225808f = C62942bv.mutableCopy(ckVar);
        }
        C62947c.addAll((Iterable) a, (List) ccVar.f225808f);
        Iterable iterable = (Iterable) Collection.EL.stream(guVar).map(C77062cg.f212690a).map(C77063ch.f212691a).collect(C58370cn.f155946a);
        cbVar.copyOnWrite();
        C82833cc ccVar3 = (C82833cc) cbVar.instance;
        C62971cq cqVar = ccVar3.f225809g;
        if (!cqVar.mo58948c()) {
            ccVar3.f225809g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) ccVar3.f225809g);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
