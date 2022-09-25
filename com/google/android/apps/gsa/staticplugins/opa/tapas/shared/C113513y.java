package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.pm.ApplicationInfo;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.y */
/* compiled from: PG */
public final /* synthetic */ class C113513y implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f314278a;

    public /* synthetic */ C113513y(Function function) {
        this.f314278a = function;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C60870cx) this.f314278a.apply((ApplicationInfo) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
