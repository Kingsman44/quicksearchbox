package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.android.apps.gsa.nga.engine.geniefm.C76105k;
import com.google.android.apps.gsa.nga.engine.geniefm.C76106l;
import com.google.android.apps.gsa.nga.engine.geniefm.C76110p;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.p */
/* compiled from: PG */
public final /* synthetic */ class C79063p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76105k f217410a;

    public /* synthetic */ C79063p(C76105k kVar) {
        this.f217410a = kVar;
    }

    public final void accept(Object obj) {
        C76105k kVar = this.f217410a;
        C76110p pVar = (C76110p) obj;
        kVar.copyOnWrite();
        C76106l lVar = (C76106l) kVar.instance;
        C76106l lVar2 = C76106l.f210996c;
        pVar.getClass();
        C62971cq cqVar = lVar.f210999b;
        if (!cqVar.mo58948c()) {
            lVar.f210999b = C62942bv.mutableCopy(cqVar);
        }
        lVar.f210999b.add(pVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
