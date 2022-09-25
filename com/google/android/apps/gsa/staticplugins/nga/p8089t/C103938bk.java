package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.assistant.p3793ae.p3794a.C48771c;
import com.google.assistant.p3793ae.p3794a.C48774f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bk */
/* compiled from: PG */
public final /* synthetic */ class C103938bk implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48771c f289270a;

    public /* synthetic */ C103938bk(C48771c cVar) {
        this.f289270a = cVar;
    }

    public final void accept(Object obj) {
        C48771c cVar = this.f289270a;
        List list = (List) obj;
        cVar.copyOnWrite();
        C48774f fVar = (C48774f) cVar.instance;
        C48774f fVar2 = C48774f.f126206b;
        C62971cq cqVar = fVar.f126208a;
        if (!cqVar.mo58948c()) {
            fVar.f126208a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) fVar.f126208a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
