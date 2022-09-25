package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.nlp.p4735b.p4736a.p4738b.C62831m;
import com.google.nlp.p4735b.p4736a.p4738b.C62832n;
import com.google.nlp.p4735b.p4736a.p4738b.C62833o;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.s */
/* compiled from: PG */
public final /* synthetic */ class C79066s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C62832n f217413a;

    public /* synthetic */ C79066s(C62832n nVar) {
        this.f217413a = nVar;
    }

    public final void accept(Object obj) {
        C62832n nVar = this.f217413a;
        C62831m mVar = (C62831m) obj;
        nVar.copyOnWrite();
        C62833o oVar = (C62833o) nVar.instance;
        C62833o oVar2 = C62833o.f169673c;
        mVar.getClass();
        C62971cq cqVar = oVar.f169675a;
        if (!cqVar.mo58948c()) {
            oVar.f169675a = C62942bv.mutableCopy(cqVar);
        }
        oVar.f169675a.add(mVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
