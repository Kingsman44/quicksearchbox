package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.nlp.p4735b.p4736a.p4738b.C62830l;
import com.google.nlp.p4735b.p4736a.p4738b.C62831m;
import com.google.nlp.p4735b.p4736a.p4738b.C62835q;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.m */
/* compiled from: PG */
public final /* synthetic */ class C79060m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79073z f217404a;

    /* renamed from: b */
    public final /* synthetic */ C62830l f217405b;

    /* renamed from: c */
    public final /* synthetic */ C62831m f217406c;

    public /* synthetic */ C79060m(C79073z zVar, C62830l lVar, C62831m mVar) {
        this.f217404a = zVar;
        this.f217405b = lVar;
        this.f217406c = mVar;
    }

    public final void accept(Object obj) {
        C79073z zVar = this.f217404a;
        C62830l lVar = this.f217405b;
        C62831m mVar = this.f217406c;
        C62835q qVar = (C62835q) obj;
        lVar.copyOnWrite();
        C62831m mVar2 = (C62831m) lVar.instance;
        C62831m mVar3 = C62831m.f169666e;
        qVar.getClass();
        C62971cq cqVar = mVar2.f169670c;
        if (!cqVar.mo58948c()) {
            mVar2.f169670c = C62942bv.mutableCopy(cqVar);
        }
        mVar2.f169670c.add(qVar);
        zVar.f217424c.mo55495c(mVar.f169669b, qVar.f169681b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
