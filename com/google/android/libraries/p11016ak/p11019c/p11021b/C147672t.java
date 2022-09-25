package com.google.android.libraries.p11016ak.p11019c.p11021b;

import com.google.android.libraries.p11016ak.C147735q;
import com.google.android.libraries.p11016ak.C147736r;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ak.c.b.t */
/* compiled from: PG */
public final /* synthetic */ class C147672t implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f398533a;

    public /* synthetic */ C147672t(int i) {
        this.f398533a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = this.f398533a;
        C147736r rVar = (C147736r) obj;
        C147735q qVar = (C147735q) rVar.toBuilder();
        int i2 = rVar.f398663e;
        qVar.copyOnWrite();
        ((C147736r) qVar.instance).f398659a = i2 + i;
        int i3 = rVar.f398664f;
        qVar.copyOnWrite();
        ((C147736r) qVar.instance).f398660b = i + i3;
        return (C147736r) qVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
