package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14284dn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14285do;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.ae */
/* compiled from: PG */
public final /* synthetic */ class C14944ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14285do f44896a;

    public /* synthetic */ C14944ae(C14285do doVar) {
        this.f44896a = doVar;
    }

    public final void accept(Object obj) {
        C14285do doVar = this.f44896a;
        int i = C14946ag.f44897a;
        doVar.copyOnWrite();
        C14286dp dpVar = C14286dp.f43215f;
        ((C14286dp) doVar.instance).f43218b = ((C14284dn) obj).getNumber();
        doVar.copyOnWrite();
        ((C14286dp) doVar.instance).f43217a = 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
