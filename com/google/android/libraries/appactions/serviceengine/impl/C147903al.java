package com.google.android.libraries.appactions.serviceengine.impl;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.appactions.serviceengine.api.C147881n;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.al */
/* compiled from: PG */
public final /* synthetic */ class C147903al implements Function {

    /* renamed from: a */
    public final /* synthetic */ C147906ao f398966a;

    /* renamed from: b */
    public final /* synthetic */ C147881n f398967b;

    public /* synthetic */ C147903al(C147906ao aoVar, C147881n nVar) {
        this.f398966a = aoVar;
        this.f398967b = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C147906ao aoVar = this.f398966a;
        C147881n nVar = this.f398967b;
        boolean booleanValue = ((Boolean) nVar.mo124554h().orElse(false)).booleanValue();
        boolean booleanValue2 = ((Boolean) nVar.mo124556i().orElse(false)).booleanValue();
        Optional e = nVar.mo124550e();
        Optional of = Optional.m71637of(C147906ao.m241044e((String) obj));
        if (booleanValue) {
            of = of.filter(new C147922o(aoVar, e));
        } else if (booleanValue2 && !aoVar.mo124571h((String) e.orElse(BuildConfig.FLAVOR))) {
            return Optional.empty();
        }
        return of.map(C147923p.f399002a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
