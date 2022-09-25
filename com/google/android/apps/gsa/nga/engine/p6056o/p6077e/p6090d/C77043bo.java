package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82832cb;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82833cc;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.bo */
/* compiled from: PG */
public final /* synthetic */ class C77043bo implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f212644a;

    public /* synthetic */ C77043bo(C58485gu guVar) {
        this.f212644a = guVar;
    }

    public final void accept(Object obj) {
        C58485gu guVar = this.f212644a;
        C82832cb cbVar = (C82832cb) obj;
        cbVar.copyOnWrite();
        C82833cc ccVar = (C82833cc) cbVar.instance;
        C82833cc ccVar2 = C82833cc.f225801h;
        C62971cq cqVar = ccVar.f225806d;
        if (!cqVar.mo58948c()) {
            ccVar.f225806d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) ccVar.f225806d);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
