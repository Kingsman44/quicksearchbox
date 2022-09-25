package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.assistant.p3814ai.p3815a.p3816a.C49172f;
import com.google.assistant.p3814ai.p3815a.p3816a.C49175i;
import com.google.assistant.p3897e.p3917i.p3918a.C51577mw;
import com.google.assistant.p3897e.p3917i.p3918a.C51580mz;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.bj */
/* compiled from: PG */
public final /* synthetic */ class C106038bj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51577mw f296057a;

    public /* synthetic */ C106038bj(C51577mw mwVar) {
        this.f296057a = mwVar;
    }

    public final void accept(Object obj) {
        C51577mw mwVar = this.f296057a;
        C49175i iVar = ((C49172f) obj).f127149a;
        if (iVar == null) {
            iVar = C49175i.f127151d;
        }
        String str = iVar.f127155c;
        mwVar.copyOnWrite();
        C51580mz mzVar = (C51580mz) mwVar.instance;
        C51580mz mzVar2 = C51580mz.f134430h;
        str.getClass();
        C62971cq cqVar = mzVar.f134436e;
        if (!cqVar.mo58948c()) {
            mzVar.f134436e = C62942bv.mutableCopy(cqVar);
        }
        mzVar.f134436e.add(str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
