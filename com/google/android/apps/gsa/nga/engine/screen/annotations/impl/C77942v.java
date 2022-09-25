package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.ab;
import com.google.android.apps.gsa.nga.d.a.ac;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.v */
/* compiled from: PG */
public final /* synthetic */ class C77942v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ab f214682a;

    public /* synthetic */ C77942v(ab abVar) {
        this.f214682a = abVar;
    }

    public final void accept(Object obj) {
        ab abVar = this.f214682a;
        C58485gu guVar = (C58485gu) obj;
        abVar.copyOnWrite();
        ac acVar = abVar.instance;
        ac acVar2 = ac.c;
        C62971cq cqVar = acVar.b;
        if (!cqVar.mo58948c()) {
            acVar.b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) acVar.b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
