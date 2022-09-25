package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.bb */
/* compiled from: PG */
public final /* synthetic */ class C83075bb implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80399l f226685a;

    public /* synthetic */ C83075bb(C80399l lVar) {
        this.f226685a = lVar;
    }

    public final void accept(Object obj) {
        C80399l lVar = this.f226685a;
        C65196fc fcVar = (C65196fc) obj;
        lVar.copyOnWrite();
        C80401n nVar = C80401n.f220656k;
        fcVar.getClass();
        ((C80401n) lVar.instance).f220666i = fcVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
