package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14347fw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14348fx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.au */
/* compiled from: PG */
public final /* synthetic */ class C14681au implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C14347fw f44338a;

    public /* synthetic */ C14681au(C14347fw fwVar) {
        this.f44338a = fwVar;
    }

    public final void accept(Object obj) {
        C14347fw fwVar = this.f44338a;
        C14361gj gjVar = (C14361gj) obj;
        fwVar.copyOnWrite();
        C14348fx fxVar = C14348fx.f43414h;
        gjVar.getClass();
        ((C14348fx) fwVar.instance).f43419d = gjVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
