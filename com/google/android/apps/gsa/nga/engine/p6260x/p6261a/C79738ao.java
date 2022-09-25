package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.ao */
/* compiled from: PG */
public final /* synthetic */ class C79738ao implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82889ee f218636a;

    public /* synthetic */ C79738ao(C82889ee eeVar) {
        this.f218636a = eeVar;
    }

    public final void accept(Object obj) {
        C82889ee eeVar = this.f218636a;
        C79813di diVar = (C79813di) obj;
        diVar.copyOnWrite();
        C79814dj djVar = (C79814dj) diVar.instance;
        C79814dj djVar2 = C79814dj.f218834O;
        eeVar.getClass();
        C62971cq cqVar = djVar.f218868r;
        if (!cqVar.mo58948c()) {
            djVar.f218868r = C62942bv.mutableCopy(cqVar);
        }
        djVar.f218868r.add(eeVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
