package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.android.apps.auto.p450a.p451a.C8857ab;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11672ac;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11673ad;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.i */
/* compiled from: PG */
public final /* synthetic */ class C16314i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C11672ac f48002a;

    public /* synthetic */ C16314i(C11672ac acVar) {
        this.f48002a = acVar;
    }

    public final void accept(Object obj) {
        C11672ac acVar = this.f48002a;
        C8857ab abVar = (C8857ab) obj;
        acVar.copyOnWrite();
        C11673ad adVar = (C11673ad) acVar.instance;
        C11673ad adVar2 = C11673ad.f37660b;
        abVar.getClass();
        C62971cq cqVar = adVar.f37662a;
        if (!cqVar.mo58948c()) {
            adVar.f37662a = C62942bv.mutableCopy(cqVar);
        }
        adVar.f37662a.add(abVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
