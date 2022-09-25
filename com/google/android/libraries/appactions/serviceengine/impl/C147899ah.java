package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.assistant.p3944g.p3948b.p3949a.C52952q;
import com.google.assistant.p3944g.p3948b.p3949a.C52953r;
import com.google.assistant.p3944g.p3948b.p3949a.C52955t;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.ah */
/* compiled from: PG */
public final /* synthetic */ class C147899ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52952q f398960a;

    public /* synthetic */ C147899ah(C52952q qVar) {
        this.f398960a = qVar;
    }

    public final void accept(Object obj) {
        C52952q qVar = this.f398960a;
        C52955t tVar = (C52955t) obj;
        qVar.copyOnWrite();
        C52953r rVar = (C52953r) qVar.instance;
        C52953r rVar2 = C52953r.f138840b;
        tVar.getClass();
        C62971cq cqVar = rVar.f138842a;
        if (!cqVar.mo58948c()) {
            rVar.f138842a = C62942bv.mutableCopy(cqVar);
        }
        rVar.f138842a.add(tVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
