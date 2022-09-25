package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.pm.ApplicationInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.t */
/* compiled from: PG */
public final /* synthetic */ class C113508t implements Function {

    /* renamed from: a */
    public final /* synthetic */ C113251ad f314268a;

    public /* synthetic */ C113508t(C113251ad adVar) {
        this.f314268a = adVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113251ad adVar = this.f314268a;
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return adVar.mo99928e(adVar.f313609b, applicationInfo.packageName, new C113509u(adVar, applicationInfo));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
