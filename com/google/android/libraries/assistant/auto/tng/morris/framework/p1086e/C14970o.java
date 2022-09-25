package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14260cq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14261cr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14262cs;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.o */
/* compiled from: PG */
public final /* synthetic */ class C14970o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14261cr f44934a;

    public /* synthetic */ C14970o(C14261cr crVar) {
        this.f44934a = crVar;
    }

    public final void accept(Object obj) {
        C14261cr crVar = this.f44934a;
        C14260cq cqVar = (C14260cq) obj;
        crVar.copyOnWrite();
        C14262cs csVar = C14262cs.f43141g;
        cqVar.getClass();
        ((C14262cs) crVar.instance).f43143a = cqVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
