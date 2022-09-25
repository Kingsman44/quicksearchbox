package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C98047ab implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C98047ab f273779a = new C98047ab();

    private /* synthetic */ C98047ab() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C7711hc hcVar = (C7711hc) ((C7718hj) obj).toBuilder();
        hcVar.copyOnWrite();
        C7718hj hjVar = (C7718hj) hcVar.instance;
        hjVar.f26955a |= 16777216;
        hjVar.f26933E = true;
        return (C7718hj) hcVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
