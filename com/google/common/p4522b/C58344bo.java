package com.google.common.p4522b;

import java.util.Set;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.common.b.bo */
/* compiled from: PG */
public final /* synthetic */ class C58344bo implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C58344bo f155916a = new C58344bo();

    private /* synthetic */ C58344bo() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Collector collector = C58370cn.f155946a;
        Set<C58691ok> m = ((C58692ol) obj).mo54975m();
        C58514hw hwVar = new C58514hw(m.size());
        for (C58691ok okVar : m) {
            hwVar.mo55469f(okVar.mo55768b(), okVar.mo55767a());
        }
        return hwVar.mo55467a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
