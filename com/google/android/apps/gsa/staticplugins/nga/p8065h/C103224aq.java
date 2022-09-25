package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80454b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80455c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80456d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.aq */
/* compiled from: PG */
public final /* synthetic */ class C103224aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80455c f287989a;

    public /* synthetic */ C103224aq(C80455c cVar) {
        this.f287989a = cVar;
    }

    public final void accept(Object obj) {
        C80455c cVar = this.f287989a;
        C80454b bVar = (C80454b) obj;
        cVar.copyOnWrite();
        C80456d dVar = (C80456d) cVar.instance;
        C80456d dVar2 = C80456d.f220820b;
        bVar.getClass();
        C62971cq cqVar = dVar.f220822a;
        if (!cqVar.mo58948c()) {
            dVar.f220822a = C62942bv.mutableCopy(cqVar);
        }
        dVar.f220822a.add(bVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
