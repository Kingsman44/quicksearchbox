package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48589ae;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48590af;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.j */
/* compiled from: PG */
public final /* synthetic */ class C111187j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48589ae f309483a;

    public /* synthetic */ C111187j(C48589ae aeVar) {
        this.f309483a = aeVar;
    }

    public final void accept(Object obj) {
        C48589ae aeVar = this.f309483a;
        C51473j jVar = (C51473j) obj;
        aeVar.copyOnWrite();
        C48590af afVar = (C48590af) aeVar.instance;
        C48590af afVar2 = C48590af.f125589d;
        jVar.getClass();
        C62971cq cqVar = afVar.f125591a;
        if (!cqVar.mo58948c()) {
            afVar.f125591a = C62942bv.mutableCopy(cqVar);
        }
        afVar.f125591a.add(jVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
