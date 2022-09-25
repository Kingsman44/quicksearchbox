package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.assistant.p3944g.p3948b.p3949a.C52955t;
import com.google.common.base.C58881cr;
import com.google.common.base.C58882cs;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.ae */
/* compiled from: PG */
public final /* synthetic */ class C147896ae implements Function {

    /* renamed from: a */
    public final /* synthetic */ C147906ao f398957a;

    public /* synthetic */ C147896ae(C147906ao aoVar) {
        this.f398957a = aoVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58881cr crVar;
        C147906ao aoVar = this.f398957a;
        String str = (String) obj;
        synchronized (aoVar.f398974d) {
            crVar = (C58881cr) aoVar.f398974d.get(str);
            if (crVar == null) {
                C58882cs csVar = new C58882cs(new C147893ab(aoVar, str), aoVar.f398973c.toMillis(), TimeUnit.MILLISECONDS);
                aoVar.f398974d.put(str, csVar);
                crVar = csVar;
            }
        }
        return (C52955t) crVar.mo6453a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
