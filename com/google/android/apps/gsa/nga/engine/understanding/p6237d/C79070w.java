package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.android.apps.gsa.nga.engine.geniefm.C76106l;
import com.google.android.apps.gsa.nga.engine.geniefm.C76107m;
import com.google.android.apps.gsa.nga.engine.geniefm.C76108n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.w */
/* compiled from: PG */
public final /* synthetic */ class C79070w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76107m f217418a;

    public /* synthetic */ C79070w(C76107m mVar) {
        this.f217418a = mVar;
    }

    public final void accept(Object obj) {
        C76107m mVar = this.f217418a;
        C76106l lVar = (C76106l) obj;
        mVar.copyOnWrite();
        C76108n nVar = (C76108n) mVar.instance;
        C76108n nVar2 = C76108n.f211001c;
        lVar.getClass();
        C62971cq cqVar = nVar.f211003a;
        if (!cqVar.mo58948c()) {
            nVar.f211003a = C62942bv.mutableCopy(cqVar);
        }
        nVar.f211003a.add(lVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
