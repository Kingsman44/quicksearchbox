package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14260cq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14261cr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14262cs;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.q */
/* compiled from: PG */
public final /* synthetic */ class C14972q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14261cr f44936a;

    public /* synthetic */ C14972q(C14261cr crVar) {
        this.f44936a = crVar;
    }

    public final void accept(Object obj) {
        C14261cr crVar = this.f44936a;
        C14260cq cqVar = (C14260cq) obj;
        crVar.copyOnWrite();
        C14262cs csVar = C14262cs.f43141g;
        cqVar.getClass();
        ((C14262cs) crVar.instance).f43145c = cqVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
