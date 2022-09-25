package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.pm.ApplicationInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.x */
/* compiled from: PG */
public final /* synthetic */ class C113512x implements Function {

    /* renamed from: a */
    public final /* synthetic */ C113251ad f314277a;

    public /* synthetic */ C113512x(C113251ad adVar) {
        this.f314277a = adVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113251ad adVar = this.f314277a;
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return adVar.mo99928e(adVar.f313611d, applicationInfo.packageName, new C113248aa(adVar, applicationInfo));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
